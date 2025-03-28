package com.jin.drivinglicence.component.viewmodel

import android.os.Handler
import android.os.Looper
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mobile.mbccs.base.component.activity.ActivityManager
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext

abstract class BaseViewModel : ViewModel(), DefaultLifecycleObserver, CoroutineScope {

    val isLoading by lazy { MutableLiveData<Boolean>() }
    private val thread by lazy { Handler(Looper.getMainLooper()) }
    private val viewModelJob = SupervisorJob()

    private val viewModelScope: CoroutineScope =
        CoroutineScope(viewModelJob + Dispatchers.Main.immediate)

    override val coroutineContext: CoroutineContext
        get() = viewModelJob + Dispatchers.Main

    private val handler = CoroutineExceptionHandler { _, exception ->
        exception.printStackTrace()
    }

    protected val context by lazy {
        ActivityManager.getTopActivity()
    }

    protected fun getString(id: Int): String {
        return context?.getString(id) ?: ""
    }

    protected fun launchHandler(
        block: suspend CoroutineScope.() -> Unit,
    ) {
        viewModelScope.launch(handler) {
            block()
        }
    }

    fun <T> Flow<T>.subscribe(
        onLoading: Boolean = true,
        keepLoading: Boolean = false,
        onNext: (T) -> Unit
    ) {
        this@subscribe.onStart {
            isLoading.value = onLoading
        }.onEach {
            if (it != null) {
                withContext(Dispatchers.Main) {
                    onNext.invoke(it)
                }
            }
            if (!keepLoading && onLoading) {
                thread.postDelayed(disableLoading, 500)
            }
        }.catch {
            isLoading.value = false
            Throwable(it).also { throwable ->
                throwable.printStackTrace()
            }
        }.launchIn(viewModelScope)
    }

    private val disableLoading: Runnable = Runnable { isLoading.value = false }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
        viewModelScope.cancel()
        thread.removeCallbacks(disableLoading)
    }
}