package com.jin.drivinglicence.component.dialog

import com.jin.drivinglicence.R
import com.jin.drivinglicence.app.adapter.ListQuestionCountDownBottomAdapter
import com.jin.drivinglicence.app.entity.Question
import com.jin.drivinglicence.component.widgets.recyclerview.RecyclerUtils
import com.jin.drivinglicence.databinding.ListQuestionBottomDialogBinding
import com.jin.drivinglicence.utils.POSITION
import com.jin.drivinglicence.utils.QUESTIONS

class ListQuestionCountDownBottomDialog : BaseBottomSheetDialog<ListQuestionBottomDialogBinding>() {

    var onClickItem: ((Int) -> Unit)? = null

    var listQuestion: MutableList<Question> = mutableListOf()
    private val listQuestionAdapter by lazy {
        ListQuestionCountDownBottomAdapter()
    }

    override fun initView() {
        RecyclerUtils.setGridManagerV(
            requireContext(),
            binding.rcvListQuestionBottom,
            5,
            listQuestionAdapter
        )
    }

    override fun getTheme(): Int = R.style.BaseBottomSheetDialog

    override fun initData() {
        listQuestion = arguments?.getParcelableArrayList(QUESTIONS) ?: mutableListOf()
        arguments?.getInt(POSITION)?.let {
            listQuestionAdapter.currentPos = it
        }
        listQuestionAdapter.addData(listQuestion)
        initListener()
    }

    fun initListener() {
        listQuestionAdapter.setOnClickItemRecyclerView { _, position ->
            onClickItem?.invoke(position)
        }
        binding.iconDown.setOnClickListener {
            onDestroyView()
        }
    }
}