package com.jin.drivinglicence.app.adapter

import com.jin.drivinglicence.app.entity.ItemRoadTraffic
import com.jin.drivinglicence.component.adapter.BaseRecyclerViewAdapter
import com.jin.drivinglicence.databinding.ItemRoadTrafficBinding
import com.jin.drivinglicence.utils.loadSrcCacheResource

class RoadTrafficAdapter : BaseRecyclerViewAdapter<ItemRoadTraffic, ItemRoadTrafficBinding>() {
    override fun bindData(binding: ItemRoadTrafficBinding, item: ItemRoadTraffic, position: Int) {
        binding.textTrafficName.text = item.title
        binding.textDescription.text = item.content
        binding.imageThumb.loadSrcCacheResource(item.thumb)
    }
}