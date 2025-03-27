package com.jin.drivinglicence.app.adapter

import com.jin.drivinglicence.app.entity.ItemAction
import com.jin.drivinglicence.component.adapter.BaseRecyclerViewAdapter
import com.jin.drivinglicence.databinding.ItemActionHomeBinding
import com.jin.drivinglicence.utils.loadSrcCacheResource

class ActionAdapter : BaseRecyclerViewAdapter<ItemAction, ItemActionHomeBinding>() {
    var onCLickItem: ((position: Int) -> Unit)? = null
    override fun bindData(binding: ItemActionHomeBinding, item: ItemAction, position: Int) {
        binding.tvTitle.text = item.title
        binding.imageThumb.loadSrcCacheResource(item.thumb)
        binding.layoutItemAction.setOnClickListener { onCLickItem?.invoke(position) }
    }
}