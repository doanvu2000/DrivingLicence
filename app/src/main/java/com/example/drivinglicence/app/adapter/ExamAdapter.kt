package com.example.drivinglicence.app.adapter

import com.example.drivinglicence.component.adapter.BaseRecyclerViewAdapter
import com.example.drivinglicence.databinding.ItemExamBinding

class ExamAdapter : BaseRecyclerViewAdapter<Int, ItemExamBinding>() {
    override fun bindData(binding: ItemExamBinding, item: Int, position: Int) {
        binding.tvCount.text = "Đề số $item"
    }
}