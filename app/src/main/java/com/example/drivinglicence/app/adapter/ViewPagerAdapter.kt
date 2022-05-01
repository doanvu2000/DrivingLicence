package com.example.drivinglicence.app.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

@Suppress("DEPRECATION")
class ViewPagerAdapter(fragmentManager: FragmentManager) :
    FragmentStatePagerAdapter(fragmentManager) {
    private val fragments = mutableListOf<Fragment>()

    fun addFragment(fragment: List<Fragment>) {
        fragments.addAll(fragment)
    }

    override fun getCount(): Int {
        return fragments.size
    }

    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

}