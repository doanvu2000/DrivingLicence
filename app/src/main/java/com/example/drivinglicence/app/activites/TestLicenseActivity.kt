package com.example.drivinglicence.app.activites

import android.graphics.Color
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import androidx.core.content.ContextCompat
import com.example.drivinglicence.R
import com.example.drivinglicence.app.adapter.ExamAdapter
import com.example.drivinglicence.app.entity.Answer
import com.example.drivinglicence.app.entity.ListAnswers
import com.example.drivinglicence.app.entity.Question
import com.example.drivinglicence.app.viewmodel.MapDataViewModel
import com.example.drivinglicence.component.activity.BaseCoreActivity
import com.example.drivinglicence.component.activity.BaseVMActivity
import com.example.drivinglicence.component.dialog.AlertMessageDialog
import com.example.drivinglicence.component.dialog.InformationLessonBottomSheet
import com.example.drivinglicence.component.navigator.openActivity
import com.example.drivinglicence.component.widgets.recyclerview.RecyclerUtils
import com.example.drivinglicence.databinding.ActivityTestLicenseBinding
import com.example.drivinglicence.pref.LocalCache
import com.example.drivinglicence.pref.showMessage
import com.example.drivinglicence.utils.*
import java.util.ArrayList

class TestLicenseActivity : BaseVMActivity<ActivityTestLicenseBinding, MapDataViewModel>() {
    val examAdapter by lazy {
        ExamAdapter()
    }
    private var listQuestion: MutableList<Question> = mutableListOf()
    private var listAnswer: MutableList<MutableList<Answer>> = mutableListOf()

    override fun initView() {
        setupToolBar()
        RecyclerUtils.setGridManager(this, binding.rcvExams, examAdapter)
        val isSecond = LocalCache.getInstance().getBoolean(IS_SECOND) ?: false
        if (!isSecond) {
            showAlertMessage()
        }
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
            showAlertMessage()
        }
        examAdapter.setOnClickItemRecyclerView { position, _ ->

            listQuestion = getQuestionTest(this, position)
            listAnswer = getAnswerTest(this, position)

            /**Fake data*/
//            listQuestion = viewModel.getListQuestionCulturesAndEthics(this)
//            for (i in 1..5) {
//                listAnswer.add(viewModel.mapAnswerCulturesAndEthics[i] ?: mutableListOf())
//            }
            listQuestion = viewModel.getListQuestionImportant(this)
            for (i in 1..3) {
                listAnswer.add(viewModel.mapAnswerImportant[i] ?: mutableListOf())
            }
            showInformationLicense()
        }
    }

    private fun showInformationLicense() {
        InformationLessonBottomSheet().also { dialog ->
            dialog.show(supportFragmentManager, "")
            dialog.startTestClickListener = {
                val bundle = Bundle()
                bundle.putParcelableArrayList(QUESTIONS, listQuestion as ArrayList)
                bundle.putParcelable(LIST_ANSWERS, ListAnswers(listAnswer))
                openActivity(CountDownTestActivity::class.java, bundle)
            }
        }
    }

    override fun initData() {
        for (i in 1..20) {
            examAdapter.addData(i)
        }
    }

    private fun showAlertMessage() {
        AlertMessageDialog(this).also { alert ->
            alert.show(
                "Hướng dẫn làm bài thi",
                "Mỗi đề thi đều có câu hỏi điểm liệt, nếu thí sinh chỉ cần trả lời sai câu hỏi điểm liệt coi như bị rớt. Đề thi bằng lái hạng A1 gồm 25 câu hỏi làm bài trong 19 phút. \n\n Để vượt qua bài thi, thí sinh cần trả lời đúng 21/25 câu hỏi và không sai câu điểm liệt nào",
                "ĐÃ HIỂU",
                cancelAble = false,
                onClickSubmit = {
                    putIsFirst()
                }
            )
            alert.hideCancelButton()
        }
    }

    private fun putIsFirst() {
        LocalCache.getInstance().put(IS_SECOND, true)
    }
}