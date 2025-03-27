package com.jin.drivinglicence.app.fragment

import androidx.recyclerview.widget.DividerItemDecoration
import com.jin.drivinglicence.app.adapter.RoadTrafficAdapter
import com.jin.drivinglicence.app.entity.ItemRoadTraffic
import com.jin.drivinglicence.app.viewmodel.MapDataViewModel
import com.jin.drivinglicence.component.fragment.BaseFragment
import com.jin.drivinglicence.component.widgets.recyclerview.RecyclerUtils
import com.jin.drivinglicence.databinding.FragmentRoadTrafficBanBinding
import com.jin.drivinglicence.utils.LIST_ROAD_TRAFFIC


class RoadTrafficBanFragment : BaseFragment<FragmentRoadTrafficBanBinding, MapDataViewModel>() {

    private val roadTrafficAdapter by lazy {
        RoadTrafficAdapter()
    }

    override fun initView() {
        RecyclerUtils.setGridManager(this, binding.rcvRoadTraffic, roadTrafficAdapter)
        binding.rcvRoadTraffic.addItemDecoration(
            DividerItemDecoration(
                requireContext(),
                DividerItemDecoration.VERTICAL
            )
        )
    }

    override fun initListener() {
    }

    override fun initData() {
        val dataList =
            arguments?.getParcelableArrayList(LIST_ROAD_TRAFFIC) ?: mutableListOf<ItemRoadTraffic>()
        roadTrafficAdapter.addData(dataList)
    }
}