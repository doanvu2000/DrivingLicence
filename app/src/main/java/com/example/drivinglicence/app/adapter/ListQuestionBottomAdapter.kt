package com.example.drivinglicence.app.adapter

import com.example.drivinglicence.R
import com.example.drivinglicence.app.entity.ItemAction
import com.example.drivinglicence.app.entity.Question
import com.example.drivinglicence.component.adapter.BaseRecyclerViewAdapter
import com.example.drivinglicence.databinding.ItemActionHomeBinding
import com.example.drivinglicence.databinding.ItemListQuestionBottomBinding
import com.squareup.picasso.Picasso
import java.lang.Exception

class ListQuestionBottomAdapter :
    BaseRecyclerViewAdapter<Question, ItemListQuestionBottomBinding>() {
    override fun bindData(binding: ItemListQuestionBottomBinding, item: Question, position: Int) {
        binding.textCount.text = "${item.questionId}"
        if (item.isImportant) {
            binding.textCount.setBackgroundResource(R.drawable.circle_button_orange)
        }
    }
}