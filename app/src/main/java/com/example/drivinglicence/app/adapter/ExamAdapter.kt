package com.example.drivinglicense.app.adapter

import com.example.drivinglicense.component.adapter.BaseRecyclerViewAdapter
import com.example.drivinglicense.databinding.ItemExamBinding

class ExamAdapter : BaseRecyclerViewAdapter<Int, ItemExamBinding>() {
    override fun bindData(binding: ItemExamBinding, item: Int, position: Int) {
        binding.tvCount.text = "Đề số $item"
    }
}