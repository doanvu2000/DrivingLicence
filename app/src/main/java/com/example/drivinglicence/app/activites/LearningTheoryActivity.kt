package com.example.drivinglicense.app.activites

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import com.example.drivinglicense.R
import com.example.drivinglicense.component.activity.BaseCoreActivity
import com.example.drivinglicense.component.navigator.openActivity
import com.example.drivinglicense.databinding.ActivityLearningTheoryBinding
import com.example.drivinglicense.utils.TITLE_TOOLBAR

class LearningTheoryActivity : BaseCoreActivity<ActivityLearningTheoryBinding>() {
    override fun initView() {
        supportActionBar?.hide()
        setupToolBar()
    }

    private fun setupToolBar() {
        binding.toolbar.setTitle(getString(R.string.text_learning_theory))
        binding.toolbar.setBackgroundColor(ContextCompat.getColor(this, R.color.primary))
        binding.toolbar.setTitleColor(Color.WHITE)
        binding.toolbar.setIconLeft(R.drawable.icon_back_white)
        binding.toolbar.setIconRight(R.drawable.icon_info)
    }

    override fun initListener() {
        binding.toolbar.onLeftClickListener = { onBackPressed() }
        binding.btn60.setOnClickListener(this)
    }

    override fun initData() {
    }

    override fun onSingleClick(v: View) {
        when (v.id) {
            R.id.btn60 -> {
                val bundle = Bundle()
                bundle.putString(TITLE_TOOLBAR,"60 câu hỏi điểm liệt")
                openActivity(ExecuteActivity::class.java,bundle)
            }
        }
    }
}