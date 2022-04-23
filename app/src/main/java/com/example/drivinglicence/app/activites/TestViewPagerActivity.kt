package com.example.drivinglicense.app.activites

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.drivinglicense.R
import com.example.drivinglicense.app.adapter.ViewPagerAdapter
import com.example.drivinglicense.app.fragment.LessonFragment
import com.example.drivinglicense.app.viewmodel.MapDataViewModel
import com.example.drivinglicense.component.activity.BaseVMActivity
import com.example.drivinglicense.databinding.ActivityTestViewPagerBinding
import com.example.drivinglicense.utils.getListQuestionImportant

class TestViewPagerActivity : BaseVMActivity<ActivityTestViewPagerBinding, MapDataViewModel>() {
    private val viewpagerAdapter by lazy {
        ViewPagerAdapter(supportFragmentManager)
    }
    private val mListFragment: MutableList<Fragment> = mutableListOf()

    override fun initView() {
        binding.toolbar.setIconLeft(R.drawable.icon_back_left)

    }

    override fun initListener() {
        binding.toolbar.onLeftClickListener = { onBackPressed() }
        binding.textBack.setOnClickListener(this)
        binding.textNextQuestion.setOnClickListener(this)
        binding.viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            @SuppressLint("SetTextI18n")
            override fun onPageSelected(position: Int) {
                when (position) {
                    0 -> {
                        binding.textBack.visibility = View.GONE
                    }
                    mListFragment.size - 1 -> {
                        binding.textBack.visibility = View.VISIBLE
                        binding.textNextQuestion.visibility = View.GONE
                    }
                    else -> {
                        binding.textBack.visibility = View.VISIBLE
                        binding.textNextQuestion.visibility = View.VISIBLE
                    }
                }
                binding.textCurrentQuestion.text = "${position + 1}"
            }

            override fun onPageScrollStateChanged(state: Int) {
            }
        })
    }

    override fun initData() {
        //danh sach cau tra loi cua 3 cau hoi
        val listQuestion = viewModel.getListQuestionImportant(this)
        val listAnswer = mutableListOf(
            viewModel.mapAnswer[1],
            viewModel.mapAnswer[2],
            viewModel.mapAnswer[3],
            viewModel.mapAnswer[1],
            viewModel.mapAnswer[2],
            viewModel.mapAnswer[3],
            viewModel.mapAnswer[1],
            viewModel.mapAnswer[2],
            viewModel.mapAnswer[3],
            viewModel.mapAnswer[1]
        )
        for (i in 1..3) {
            mListFragment.add(LessonFragment(listQuestion[i - 1], listAnswer[i - 1]!!, i).apply {
                val bundle = Bundle()
                bundle.putParcelable("question",listQuestion[i - 1])
                arguments = bundle
            })
        }
        viewpagerAdapter.addFragment(mListFragment)
        binding.viewPager.adapter = viewpagerAdapter
        binding.textTotalQuestion.text = viewpagerAdapter.count.toString()
    }

    override fun onSingleClick(v: View) {
        when (v.id) {
            R.id.text_back -> {
                binding.viewPager.currentItem = binding.viewPager.currentItem - 1
            }
            R.id.text_next_question -> {
                binding.viewPager.currentItem = binding.viewPager.currentItem + 1
            }
        }
    }
}