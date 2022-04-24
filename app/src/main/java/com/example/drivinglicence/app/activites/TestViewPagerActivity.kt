package com.example.drivinglicence.app.activites

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.drivinglicence.R
import com.example.drivinglicence.app.adapter.ViewPagerAdapter
import com.example.drivinglicence.app.entity.Answer
import com.example.drivinglicence.app.entity.Question
import com.example.drivinglicence.app.fragment.LessonFragment
import com.example.drivinglicence.app.viewmodel.MapDataViewModel
import com.example.drivinglicence.component.activity.BaseVMActivity
import com.example.drivinglicence.databinding.ActivityTestViewPagerBinding
import com.example.drivinglicence.utils.ANSWERS
import com.example.drivinglicence.utils.QUESTION

class TestViewPagerActivity : BaseVMActivity<ActivityTestViewPagerBinding, MapDataViewModel>() {
    private val viewpagerAdapter by lazy {
        ViewPagerAdapter(supportFragmentManager)
    }
    private val mListFragment: MutableList<Fragment> = mutableListOf()

    override fun initView() {
        binding.toolbar.setIconLeft(R.drawable.icon_back_white)
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

    private var listQuestion: MutableList<Question> = mutableListOf()
    private var listAnswer: MutableList<MutableList<Answer>> = mutableListOf()
    override fun initData() {
        //danh sach cau tra loi cua 3 cau hoi
        listQuestion = viewModel.getListQuestionImportant(this)
        viewModel.mapAnswer[1]?.let { listAnswer.add(it) }
        viewModel.mapAnswer[2]?.let { listAnswer.add(it) }
        viewModel.mapAnswer[3]?.let { listAnswer.add(it) }
        for (i in 1..3) {
            val question = listQuestion[i - 1]
            val answers = listAnswer[i - 1] as ArrayList<Answer>
            mListFragment.add(LessonFragment().apply {
                val bundle = Bundle()
                bundle.putParcelable(QUESTION, question)
                bundle.putParcelableArrayList(ANSWERS, answers)
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