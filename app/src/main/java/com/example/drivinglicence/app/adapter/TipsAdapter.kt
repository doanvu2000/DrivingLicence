package com.example.drivinglicence.app.adapter

import android.animation.Animator
import android.content.Context
import android.view.View
import com.example.drivinglicence.R
import com.example.drivinglicence.app.entity.ItemLearning
import com.example.drivinglicence.component.adapter.BaseRecyclerViewAdapter
import com.example.drivinglicence.databinding.ItemTipsBinding

class TipsAdapter : BaseRecyclerViewAdapter<ItemLearning, ItemTipsBinding>() {
    override fun bindData(binding: ItemTipsBinding, item: ItemLearning, position: Int) {
        binding.textTip.text = item.title
        binding.textContent.text = item.description
        var isShow = false
        binding.layoutClick.setOnClickListener {
            isShow = !isShow
            if (isShow) {
                binding.textContent.visibility = View.VISIBLE
                binding.actionShow.setImageResource(R.drawable.icon_up_blue)
            } else {
                binding.textContent.animate()
                    .alpha(0f)
                    .setListener(object : Animator.AnimatorListener {
                        override fun onAnimationStart(p0: Animator?) {

                        }

                        override fun onAnimationEnd(p0: Animator?) {
                            binding.textContent.visibility = View.GONE
                        }

                        override fun onAnimationCancel(p0: Animator?) {
                        }

                        override fun onAnimationRepeat(p0: Animator?) {
                        }
                    })
                    .duration = 600
                binding.actionShow.setImageResource(R.drawable.icon_down_blue)
            }
        }
    }
}