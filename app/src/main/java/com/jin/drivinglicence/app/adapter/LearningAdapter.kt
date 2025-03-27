package com.jin.drivinglicence.app.adapter

import com.jin.drivinglicence.app.entity.ItemLearning
import com.jin.drivinglicence.component.adapter.BaseRecyclerViewAdapter
import com.jin.drivinglicence.databinding.ItemLearningBinding
import com.jin.drivinglicence.utils.loadSrcCacheResource

class LearningAdapter : BaseRecyclerViewAdapter<ItemLearning, ItemLearningBinding>() {
    override fun bindData(binding: ItemLearningBinding, item: ItemLearning, position: Int) {
        binding.textNameItemLearning.text = item.title
        binding.textCountQuestion.text = item.description
        binding.imageItemLearning.loadSrcCacheResource(item.thumb)
    }
}