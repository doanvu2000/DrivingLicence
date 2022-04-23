package com.example.drivinglicense.app.activites

import android.graphics.Color
import androidx.core.content.ContextCompat
import com.example.drivinglicense.R
import com.example.drivinglicense.component.activity.BaseCoreActivity
import com.example.drivinglicense.databinding.ActivityTipsBinding

class TipsActivity : BaseCoreActivity<ActivityTipsBinding>() {
    override fun initView() {
        supportActionBar?.hide()
        setupToolBar()
    }

    private fun setupToolBar() {
        binding.toolbar.setTitle(getString(R.string.text_tips))
        binding.toolbar.setBackgroundColor(ContextCompat.getColor(this, R.color.primary))
        binding.toolbar.setTitleColor(Color.WHITE)
        binding.toolbar.setIconLeft(R.drawable.icon_back_white)
        binding.toolbar.setIconRight(R.drawable.icon_info)
    }

    override fun initListener() {
        binding.toolbar.onLeftClickListener = { onBackPressed() }
    }

    override fun initData() {
    }
}