package com.example.drivinglicense.app.adapter

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.View
import androidx.core.content.ContextCompat
import com.example.drivinglicense.R
import com.example.drivinglicense.app.entity.Answer
import com.example.drivinglicense.component.adapter.BaseRecyclerViewAdapter
import com.example.drivinglicense.databinding.ItemAnswerBinding

class AnswerAdapter() : BaseRecyclerViewAdapter<Answer, ItemAnswerBinding>() {

    @SuppressLint("SetTextI18n")
    override fun bindData(binding: ItemAnswerBinding, item: Answer, position: Int) {
        binding.textAnswerCount.text = "${position + 1}"
        binding.textAnswerContent.text = item.answerContent
        /** flag
         * 1: black
         * 2: green
         * 3: red
         * */
        when (item.flag) {
            1 -> {
                binding.textAnswerContent.setTextColor(Color.rgb(0, 0, 0))
                binding.textAnswerCount.setTextColor(Color.rgb(0, 0, 0))
                binding.textAnswerCount.setBackgroundResource(R.drawable.bg_round_count)
                binding.imageStatus.visibility = View.GONE
            }
            2 -> {
                binding.textAnswerContent.setTextColor(Color.rgb(34, 139, 34))
                binding.textAnswerCount.setTextColor(Color.WHITE)
                binding.textAnswerCount.setBackgroundResource(R.drawable.bg_round_count_green)
                binding.imageStatus.visibility = View.VISIBLE
                binding.imageStatus.setImageResource(R.drawable.icon_check)
            }
            3 -> {
                binding.textAnswerContent.setTextColor(Color.rgb(255, 0, 0))
                binding.textAnswerCount.setTextColor(Color.WHITE)
                binding.textAnswerCount.setBackgroundResource(R.drawable.bg_round_count_red)
                binding.imageStatus.visibility = View.VISIBLE
                binding.imageStatus.setImageResource(R.drawable.icon_close)
            }
        }
    }
}