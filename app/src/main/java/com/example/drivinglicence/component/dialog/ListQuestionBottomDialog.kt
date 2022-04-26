package com.example.drivinglicence.component.dialog

import android.util.Log
import com.example.drivinglicence.app.adapter.ListQuestionBottomAdapter
import com.example.drivinglicence.app.entity.Question
import com.example.drivinglicence.component.widgets.recyclerview.RecyclerUtils
import com.example.drivinglicence.databinding.ListQuestionBottomDialogBinding
import com.example.drivinglicence.utils.QUESTIONS

class ListQuestionBottomDialog : BaseBottomSheetDialog<ListQuestionBottomDialogBinding>() {

    var listQuestion: MutableList<Question> = mutableListOf()
    private val listQuestionAdapter by lazy {
        ListQuestionBottomAdapter()
    }

    override fun initView() {
        RecyclerUtils.setGridManagerV(
            requireContext(),
            binding.rcvListQuestionBottom,
            7,
            listQuestionAdapter
        )
    }

    override fun initData() {
        listQuestion = arguments?.getParcelableArrayList(QUESTIONS) ?: mutableListOf()
        Log.d("TAG", "initData: ${listQuestion.size}")
        listQuestionAdapter.addData(listQuestion)
    }
}