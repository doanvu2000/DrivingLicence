package com.example.drivinglicense.app.activites

import android.graphics.Color
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.drivinglicense.R
import com.example.drivinglicense.app.adapter.ExamAdapter
import com.example.drivinglicense.component.activity.BaseCoreActivity
import com.example.drivinglicense.component.dialog.AlertMessageDialog
import com.example.drivinglicense.component.widgets.recyclerview.RecyclerUtils
import com.example.drivinglicense.databinding.ActivityTestLicenseBinding
import com.example.drivinglicense.pref.showDevelopMessage
import com.example.drivinglicense.pref.showMessage

class TestLicenseActivity : BaseCoreActivity<ActivityTestLicenseBinding>() {
    val examAdapter by lazy {
        ExamAdapter()
    }

    override fun initView() {
        supportActionBar?.hide()
        setupToolBar()
        RecyclerUtils.setGridManager(this, binding.rcvExams, examAdapter)
    }

    private fun setupToolBar() {
        binding.toolbar.setTitle(getString(R.string.text_exam))
        binding.toolbar.setBackgroundColor(ContextCompat.getColor(this, R.color.primary))
        binding.toolbar.setTitleColor(Color.WHITE)
        binding.toolbar.setIconLeft(R.drawable.icon_back_white)
        binding.toolbar.setIconRight(R.drawable.icon_info)
    }

    override fun initListener() {
        binding.toolbar.onLeftClickListener = { onBackPressed() }
        binding.toolbar.onRightClickListener = {
            AlertMessageDialog(this).also { alert ->
                alert.show(
                    "Hướng dẫn làm bài thi",
                    "Mỗi đề thi đều có câu hỏi điểm liệt, nếu thí sinh chỉ cần trả lời sai câu hỏi điểm liệt coi như bị rớt. Đề thi bằng lái hạng A1 gồm 25 câu hỏi làm bài trong 19 phút. \n\n Để vượt qua bài thi, thí sinh cần trả lời đúng 21/25 câu hỏi và không sai câu điểm liệt nào",
                    "ĐÃ HIỂU",
                    cancelAble = false
                )
//                alert.setBackgroundButtonSubmit(R.drawable.guide_line_green)
                alert.hideCancelButton()
            }
        }
        examAdapter.setOnClickItemRecyclerView { position, _ ->
            showMessage(this, "open exam $position")
        }
    }

    override fun initData() {
        for (i in 1..20) {
            examAdapter.addData(i)
        }
    }
}