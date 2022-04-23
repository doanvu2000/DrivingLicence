package com.example.drivinglicense.app.adapter

import com.bumptech.glide.Glide
import com.example.drivinglicense.app.entity.ItemAction
import com.example.drivinglicense.component.adapter.BaseRecyclerViewAdapter
import com.example.drivinglicense.databinding.ItemActionHomeBinding
import com.squareup.picasso.Picasso
import java.lang.Exception

class ActionAdapter : BaseRecyclerViewAdapter<ItemAction, ItemActionHomeBinding>() {
    var onCLickItem: ((position: Int) -> Unit)? = null
    override fun bindData(binding: ItemActionHomeBinding, item: ItemAction, position: Int) {
        binding.tvTitle.text = item.title
        try {
            Picasso.get().load(item.thumb).into(binding.imageThumb)
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
        binding.layoutItemAction.setOnClickListener { onCLickItem?.invoke(position) }
    }
}