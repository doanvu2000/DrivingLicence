package com.example.drivinglicence.app.fragment

import android.annotation.SuppressLint
import android.util.Log
import android.view.View
import com.example.drivinglicence.app.adapter.AnswerAdapter
import com.example.drivinglicence.app.entity.Answer
import com.example.drivinglicence.app.entity.Question
import com.example.drivinglicence.app.viewmodel.DataViewModel
import com.example.drivinglicence.component.fragment.BaseFragment
import com.example.drivinglicence.component.widgets.recyclerview.RecyclerUtils
import com.example.drivinglicence.databinding.FragmentLessonBinding
import com.example.drivinglicence.databinding.LayoutQuestionAnswerBinding
import com.example.drivinglicence.utils.ANSWERS
import com.example.drivinglicence.utils.QUESTION

class LessonFragment(
) :
    BaseFragment<FragmentLessonBinding, DataViewModel>() {

//    private val bindingContent by lazy {
//        LayoutQuestionAnswerBinding.bind(binding.root)
//    }
    private val answerAdapter by lazy {
        AnswerAdapter()
    }
//    private var question: Question? = null
//    private var listAnswer: MutableList<Answer>? = null

    override fun initView() {
        initData()
        RecyclerUtils.setGridManager(this, binding.rcvAnswers, answerAdapter)
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun initListener() {
        answerAdapter.setOnClickItemRecyclerView { answer, _ ->
            if (answer.isCorrect) {
                binding.layoutEx.visibility = View.VISIBLE
                binding.layoutExplainAnswer.visibility = View.VISIBLE
                binding.textExplainAnswer.text = answer.answerExplain
                answerAdapter.dataList.map { it.flag = 1 }
                answer.flag = 2
            } else {
                binding.layoutEx.visibility = View.GONE
                binding.layoutExplainAnswer.visibility = View.GONE
                answerAdapter.dataList.map { it.flag = 1 }
                answer.flag = 3
            }
            answerAdapter.notifyDataSetChanged()
        }
    }

    override fun initData() {
        val question: Question? = arguments?.getParcelable(QUESTION)
        val listAnswer: MutableList<Answer>? = arguments?.getParcelableArrayList(ANSWERS)
        binding.textQuestionContent.text = question?.content
        answerAdapter.addData(listAnswer ?: mutableListOf())
        Log.d("TAG123", "initData: ${question?.questionId} - ${listAnswer?.size}")
    }

    override fun onSingleClick(v: View) {
    }

}