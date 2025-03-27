package com.jin.drivinglicence.app.adapter

import android.annotation.SuppressLint
import android.view.View
import com.jin.drivinglicence.R
import com.jin.drivinglicence.app.entity.Question
import com.jin.drivinglicence.component.adapter.BaseRecyclerViewAdapter
import com.jin.drivinglicence.databinding.ItemListQuestionBottomBinding

class ListQuestionCountDownBottomAdapter :
    BaseRecyclerViewAdapter<Question, ItemListQuestionBottomBinding>() {
    var currentPos: Int = 0

    @SuppressLint("SetTextI18n")
    override fun bindData(binding: ItemListQuestionBottomBinding, item: Question, position: Int) {
        binding.textCount.text = "${position + 1}"
        if (item.isChooseAnswer == true) {
            binding.imageChoose.visibility = View.VISIBLE
        }
        if (position != currentPos) {
            binding.textCount.setBackgroundResource(R.drawable.circle_button_grey)
        } else {
            binding.textCount.setBackgroundResource(R.drawable.circle_button_grey_border)
        }
    }

}