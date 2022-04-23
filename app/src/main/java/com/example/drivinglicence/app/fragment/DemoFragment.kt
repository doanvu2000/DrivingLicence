package com.example.drivinglicence.app.fragment

import android.util.Log
import com.example.drivinglicence.app.entity.Demo
import com.example.drivinglicence.app.viewmodel.MapDataViewModel
import com.example.drivinglicence.component.fragment.BaseFragment
import com.example.drivinglicence.databinding.FragmentDemoBinding


class DemoFragment : BaseFragment<FragmentDemoBinding, MapDataViewModel>() {

    override fun initView() {

    }

    override fun initListener() {
    }

    override fun initData() {
        val demo = arguments?.getParcelable<Demo>("demo")
        Log.d("TAG123", "initData: $demo")
        demo?.let {
            binding.textId.text = "${demo.id}"
            binding.textName.text = demo.name
        }
    }
}