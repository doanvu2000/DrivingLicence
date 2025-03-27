package com.jin.drivinglicence.app.fragment

import android.annotation.SuppressLint
import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import com.jin.drivinglicence.app.adapter.AnswerResultAdapter
import com.jin.drivinglicence.app.entity.Answer
import com.jin.drivinglicence.app.entity.Question
import com.jin.drivinglicence.app.viewmodel.DataViewModel
import com.jin.drivinglicence.app.viewmodel.MapDataViewModel
import com.jin.drivinglicence.component.fragment.BaseFragment
import com.jin.drivinglicence.component.widgets.recyclerview.RecyclerUtils
import com.jin.drivinglicence.databinding.FragmentLessonBinding
import com.jin.drivinglicence.utils.QUESTION

class LessonResultFragment :
    BaseFragment<FragmentLessonBinding, DataViewModel>() {

    private val shareViewModel: MapDataViewModel by viewModels(ownerProducer = { requireActivity() })

    private val answerResultAdapter by lazy {
        AnswerResultAdapter()
    }

    override fun initView() {
        binding.layoutExplainAnswer.visibility = View.VISIBLE
        initData()
        RecyclerUtils.setGridManager(this, binding.rcvAnswers, answerResultAdapter)
    }

    override fun initListener() {
    }

    @SuppressLint("SetTextI18n")
    override fun initData() {
        val question: Question? = arguments?.getParcelable(QUESTION)
        val listAnswer: MutableList<Answer>? = question?.let { shareViewModel.getAnswer(it) }

        listAnswer?.map { answer ->
            if (answer.isCorrect) {
                binding.textExplainAnswer.text = answer.answerExplain
            }
        }
        question?.let {
            binding.textQuestionContent.text = it.content
            it.image?.let { source ->
                binding.imageQuestion.visibility = View.VISIBLE
                binding.imageQuestion.setImageResource(source)
            }
        }
        answerResultAdapter.addData(listAnswer ?: mutableListOf())


    }

    override fun onSingleClick(v: View) {
    }

}