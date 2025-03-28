package com.jin.drivinglicence.app.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.jin.drivinglicence.app.entity.Question
import com.jin.drivinglicence.utils.QUESTION

@Suppress("DEPRECATION")
class ViewPagerAdapter(fragmentManager: FragmentManager) :
    FragmentStatePagerAdapter(fragmentManager) {
    private val fragments: MutableList<Fragment> = mutableListOf()

    fun addFragment(fragment: List<Fragment>) {
        fragments.addAll(fragment)
    }

    fun setFragment(position: Int, fragment: Fragment, question: Question) {
        fragments[position] = fragment.apply {
            val bundle = Bundle()
            bundle.putParcelable(QUESTION, question)
            arguments = bundle
        }
    }

    fun clearFragment() {
        fragments.clear()
    }

    override fun getCount(): Int {
        return fragments.size
    }

    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

    override fun getItemPosition(`object`: Any): Int {
        return POSITION_NONE
    }

}