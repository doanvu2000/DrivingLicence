package com.example.drivinglicense.component.activity

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.example.drivinglicense.component.navigator.getGenericSuperclass
import com.example.drivinglicense.component.viewmodel.BaseViewModel

abstract class BaseVMActivity<VB : ViewBinding, VM : BaseViewModel> : BaseCoreActivity<VB>() {

    open val viewModel: VM by lazy {
        ViewModelProvider(this)[getGenericSuperclass(1)]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycle.addObserver(viewModel)
        handleLoading()
    }

    open fun handleLoading() {
        try {
            viewModel.isLoading.observe { isShow ->
                if (isShow) {
                    if (!isFinishing && !loadingDialog.isAdded) {
                        loadingDialog.show(this@BaseVMActivity)
                    }
                } else {
                    if (!isFinishing) {
                        loadingDialog.dismissAllowingStateLoss()
                    }
                }
            }
        } catch (e: Exception) {
        }
    }


    override fun onDestroy() {
        lifecycle.removeObserver(viewModel)
        super.onDestroy()
    }

}