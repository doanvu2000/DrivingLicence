package com.jin.drivinglicence.app.adapter

import android.annotation.SuppressLint
import com.jin.drivinglicence.R
import com.jin.drivinglicence.component.adapter.BaseRecyclerViewAdapter
import com.jin.drivinglicence.databinding.ItemExamBinding

class ExamAdapter : BaseRecyclerViewAdapter<Int, ItemExamBinding>() {
    @SuppressLint("SetTextI18n")
    override fun bindData(binding: ItemExamBinding, item: Int, position: Int) {
        binding.tvCount.text = context.getString(R.string.text_exam_number) + " $item"
    }
}