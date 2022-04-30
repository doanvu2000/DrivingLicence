package com.example.drivinglicence.app.fragment

import android.annotation.SuppressLint
import android.text.Html
import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import com.example.drivinglicence.R
import com.example.drivinglicence.app.adapter.AnswerCountDownAdapter
import com.example.drivinglicence.app.entity.Answer
import com.example.drivinglicence.app.entity.Question
import com.example.drivinglicence.app.viewmodel.DataViewModel
import com.example.drivinglicence.app.viewmodel.MapDataViewModel
import com.example.drivinglicence.component.fragment.BaseFragment
import com.example.drivinglicence.component.widgets.recyclerview.RecyclerUtils
import com.example.drivinglicence.databinding.FragmentLessonBinding
import com.example.drivinglicence.utils.ANSWERS
import com.example.drivinglicence.utils.QUESTION

class LessonCountDownFragment(
) :
    BaseFragment<FragmentLessonBinding, DataViewModel>() {

    private val shareViewModel: MapDataViewModel by viewModels(ownerProducer = { requireActivity() })

    private val answerCountDownAdapter by lazy {
        AnswerCountDownAdapter()
    }

    override fun initView() {
        initData()
        RecyclerUtils.setGridManager(this, binding.rcvAnswers, answerCountDownAdapter)
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun initListener() {
        answerCountDownAdapter.setOnClickItemRecyclerView { answer, position ->
            /**set question is selected answer*/
            shareViewModel.listQuestion.map { question ->
                if (question.questionId == answer.questionId){
                    question.isChooseAnswer = true
                }
            }
//            shareViewModel.listQuestion[answer.questionId - 1].isChooseAnswer = true // dang co van de
            if (answer.isCorrect) {
                shareViewModel.mapResult[answer.questionId] = true
                //biến để check xem question đã được chọn câu hỏi chưa, đã chọn =>thay layout ở bottom sheet
                shareViewModel.listAnswer.map { answers ->
                    answers.map {
                        if (it.answerId == answer.answerId) {
                            it.isChoose = true
                        }
                    }
                }
                answer.isChoose = true
            } else {
                shareViewModel.mapResult[answer.questionId] = false
            }
            answerCountDownAdapter.dataList.map { it.flag = 1 }
            answer.flag = 2
            answerCountDownAdapter.notifyDataSetChanged()
            Log.d(
                "TAG",
                "Chọn câu ${position + 1}, answer.iscorrect = ${answer.isCorrect}, map = ${shareViewModel.mapResult} "
            )
        }
    }


    @SuppressLint("SetTextI18n")
    override fun initData() {

        val question: Question? = arguments?.getParcelable(QUESTION)
        val listAnswer: MutableList<Answer>? = arguments?.getParcelableArrayList(ANSWERS)
        question?.let {
            if (it.isImportant) {
                binding.textQuestionContent.text =
                    Html.fromHtml(question.content + getString(R.string.text_question_important))
            } else {
                binding.textQuestionContent.text = question.content
            }
        }
        answerCountDownAdapter.addData(listAnswer ?: mutableListOf())
    }

    override fun onSingleClick(v: View) {
    }

}