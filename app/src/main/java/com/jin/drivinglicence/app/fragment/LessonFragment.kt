package com.jin.drivinglicence.app.fragment

import android.annotation.SuppressLint
import android.text.Html
import android.view.View
import com.jin.drivinglicence.R
import com.jin.drivinglicence.app.adapter.AnswerAdapter
import com.jin.drivinglicence.app.entity.Answer
import com.jin.drivinglicence.app.entity.Question
import com.jin.drivinglicence.app.viewmodel.DataViewModel
import com.jin.drivinglicence.component.fragment.BaseFragment
import com.jin.drivinglicence.component.widgets.recyclerview.RecyclerUtils
import com.jin.drivinglicence.databinding.FragmentLessonBinding
import com.jin.drivinglicence.utils.ANSWERS
import com.jin.drivinglicence.utils.QUESTION

class LessonFragment :
    BaseFragment<FragmentLessonBinding, DataViewModel>() {


    private val answerAdapter by lazy {
        AnswerAdapter()
    }

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

    @Suppress("DEPRECATION")
    @SuppressLint("SetTextI18n")
    override fun initData() {
        val question: Question? = arguments?.getParcelable(QUESTION)
        val listAnswer: MutableList<Answer>? = arguments?.getParcelableArrayList(ANSWERS)
        question?.let {
            if (it.isImportant) {
                binding.textQuestionContent.text = Html.fromHtml(
                    question.content + " " + getString(R.string.text_question_important)
                )
            } else {
                binding.textQuestionContent.text = question.content
            }
            it.image?.let { thumb ->
                binding.imageQuestion.visibility = View.VISIBLE
                binding.imageQuestion.setImageResource(thumb)
            }
        }
        answerAdapter.addData(listAnswer ?: mutableListOf())
    }

    override fun onSingleClick(v: View) {
    }

    override fun onPause() {
        super.onPause()
        answerAdapter.dataList.map { it.flag = 1 }
    }

}