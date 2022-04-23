package com.example.drivinglicense.app.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.drivinglicense.R
import com.example.drivinglicense.app.adapter.AnswerAdapter
import com.example.drivinglicense.app.entity.Answer
import com.example.drivinglicense.app.entity.Question
import com.example.drivinglicense.app.viewmodel.MapDataViewModel
import com.example.drivinglicense.component.fragment.BaseFragment
import com.example.drivinglicense.component.widgets.recyclerview.RecyclerUtils
import com.example.drivinglicense.databinding.FragmentLessonBinding
import com.example.drivinglicense.databinding.LayoutQuestionAnswerBinding
import com.example.drivinglicense.pref.showMessage
import com.example.drivinglicense.utils.getListQuestionImportant

class LessonFragment(
    private val question: Question,
    private val listAnswer: MutableList<Answer>,
    val flag: Int
) :
    BaseFragment<FragmentLessonBinding, MapDataViewModel>() {

    private val bindingContent by lazy {
        LayoutQuestionAnswerBinding.bind(binding.root)
    }
    private val answerAdapter by lazy {
        AnswerAdapter()
    }

    override fun initView() {
        bindingContent.textQuestionContent.text = question.content
        RecyclerUtils.setGridManager(this, bindingContent.rcvAnswers, answerAdapter)
        Log.d("TAG", "initView:  ${question.questionId}")
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun initListener() {
        answerAdapter.setOnClickItemRecyclerView { answer, _ ->
            if (answer.isCorrect) {
                bindingContent.layoutEx.visibility = View.VISIBLE
                bindingContent.layoutExplainAnswer.visibility = View.VISIBLE
                bindingContent.textExplainAnswer.text = answer.answerExplain
                answerAdapter.dataList.map { it.flag = 1 }
                answer.flag = 2
            } else {
                bindingContent.layoutEx.visibility = View.GONE
                bindingContent.layoutExplainAnswer.visibility = View.GONE
                answerAdapter.dataList.map { it.flag = 1 }
                answer.flag = 3
            }
            answerAdapter.notifyDataSetChanged()
        }
    }

    override fun initData() {
        answerAdapter.addData(listAnswer)
    }

    override fun onSingleClick(v: View) {
    }

}