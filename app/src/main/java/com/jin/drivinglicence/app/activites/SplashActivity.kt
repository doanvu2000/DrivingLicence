package com.jin.drivinglicence.app.activites
import android.os.Handler
import android.os.Looper
import com.jin.drivinglicence.app.viewmodel.DataViewModel
import com.jin.drivinglicence.component.activity.BaseVMActivity
import com.jin.drivinglicence.component.navigator.openActivity
import com.jin.drivinglicence.databinding.SplashBinding

class SplashActivity : BaseVMActivity<SplashBinding, DataViewModel>() {
    override fun initView() {
    }

    override fun initListener() {
    }

    override fun initData() {
        Handler(Looper.getMainLooper()).postDelayed({
            openActivity(HomeActivity::class.java)
            finish()
        }, 1500)
    }
}