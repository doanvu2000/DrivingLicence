package com.jin.drivinglicence.app.adapter

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.View
import com.jin.drivinglicence.R
import com.jin.drivinglicence.app.entity.Answer
import com.jin.drivinglicence.component.adapter.BaseRecyclerViewAdapter
import com.jin.drivinglicence.databinding.ItemAnswerBinding

class AnswerResultAdapter : BaseRecyclerViewAdapter<Answer, ItemAnswerBinding>() {

    @SuppressLint("SetTextI18n")
    override fun bindData(binding: ItemAnswerBinding, item: Answer, position: Int) {
        binding.textAnswerCount.text = "${position + 1}"
        binding.textAnswerContent.text = item.answerContent
        binding.textAnswerContent.setTextColor(Color.rgb(0, 0, 0))
        binding.textAnswerCount.setTextColor(Color.rgb(0, 0, 0))
        binding.textAnswerCount.setBackgroundResource(R.drawable.bg_round_count)
        binding.imageStatus.visibility = View.GONE
        if (item.isChoose == true) {//answer user choose
            binding.textAnswerCount.setTextColor(Color.WHITE)
            binding.textAnswerCount.setBackgroundResource(R.drawable.bg_round_count_orange)
            binding.imageStatus.visibility = View.VISIBLE
            binding.imageStatus.setImageResource(R.drawable.icon_close)
        }
        if (item.isCorrect) {//answer true
            binding.textAnswerContent.setTextColor(Color.rgb(34, 139, 34))
            binding.textAnswerCount.setTextColor(Color.WHITE)
            binding.textAnswerCount.setBackgroundResource(R.drawable.bg_round_count_green)
            binding.imageStatus.visibility = View.VISIBLE
            binding.imageStatus.setImageResource(R.drawable.icon_check)
        }
    }
}