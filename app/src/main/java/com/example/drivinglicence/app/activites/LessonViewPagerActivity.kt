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
import com.example.drivinglicence.component.dialog.InformationLessonBottomSheet
import com.example.drivinglicence.databinding.ActivityLessonViewPagerBinding
import com.example.drivinglicence.utils.ANSWERS
import com.example.drivinglicence.utils.FLAG
import com.example.drivinglicence.utils.QUESTION

class LessonViewPagerActivity : BaseVMActivity<ActivityLessonViewPagerBinding, MapDataViewModel>() {
    private val viewpagerAdapter by lazy {
        ViewPagerAdapter(supportFragmentManager)
    }
    private val mListFragment: MutableList<Fragment> = mutableListOf()

    override fun initView() {
        binding.toolbar.setIconLeft(R.drawable.icon_back_white)
    }

    override fun initListener() {
        binding.toolbar.onLeftClickListener = { onBackPressed() }
        binding.btnBackQuestion.setOnClickListener(this)
        binding.btnForwardQuestion.setOnClickListener(this)
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
                        binding.btnBackQuestion.visibility = View.GONE
                    }
                    mListFragment.size - 1 -> {
                        binding.btnBackQuestion.visibility = View.VISIBLE
                        binding.btnForwardQuestion.visibility = View.GONE
                    }
                    else -> {
                        binding.btnBackQuestion.visibility = View.VISIBLE
                        binding.btnForwardQuestion.visibility = View.VISIBLE
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
        val flag = intent.extras?.getInt(FLAG) ?: 1
        /**
         * 1: 60 Câu hỏi điểm liệt
         * 2: 83 Câu hỏi khái niệm và quy tắc
         * 3: 5 câu hỏi văn hóa và đạo đức lái xe
         * 4: 12 câu hỏi kĩ thuật lái xe
         * 5: 65 câu hỏi biển báo đường bộ
         * 6: 35 câu hỏi sa hình
         * */
        //danh sach cau tra loi cua 3 cau hoi
        when (flag) {
            1 -> {
                binding.toolbar.setTitle(getString(R.string.text_60_question_important))
                /**60 Câu hỏi điểm liệt*/
                listQuestion = viewModel.getListQuestionImportant(this)
                viewModel.mapAnswerImportant[1]?.let { listAnswer.add(it) }
                viewModel.mapAnswerImportant[2]?.let { listAnswer.add(it) }
                viewModel.mapAnswerImportant[3]?.let { listAnswer.add(it) }
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
            }
            2 -> {
                binding.toolbar.setTitle(getString(R.string.text_concepts_and_rules))
                /**83 Câu hỏi khái niệm và quy tắc*/
                listQuestion = viewModel.getListQuestionConceptsAndRules(this)
                for (i in 1..2) {
                    listAnswer.add(viewModel.mapAnswerConceptsAndRules[i] ?: mutableListOf())
                }
                for (i in 1..2) {
                    val question = listQuestion[i - 1]
                    val answers = listAnswer[i - 1] as ArrayList<Answer>
                    mListFragment.add(LessonFragment().apply {
                        val bundle = Bundle()
                        bundle.putParcelable(QUESTION, question)
                        bundle.putParcelableArrayList(ANSWERS, answers)
                        arguments = bundle
                    })
                }
            }
            3 -> {
                binding.toolbar.setTitle(getString(R.string.text_culture_and_ethic))
                /**5 câu Văn hóa và đạo đức lái xe*/
                listQuestion = viewModel.getListQuestionCulturesAndEthics(this)
                for (i in 1..5) {
                    listAnswer.add(viewModel.mapAnswerCulturesAndEthics[i] ?: mutableListOf())
                }
                for (i in 1..5) {
                    val question = listQuestion[i - 1]
                    val answers = listAnswer[i - 1] as ArrayList<Answer>
                    mListFragment.add(LessonFragment().apply {
                        val bundle = Bundle()
                        bundle.putParcelable(QUESTION, question)
                        bundle.putParcelableArrayList(ANSWERS, answers)
                        arguments = bundle
                    })
                }
            }
            4 -> {
                binding.toolbar.setTitle(getString(R.string.text_driving_technique))
            }
            5 -> {
                binding.toolbar.setTitle(getString(R.string.text_road_signs))
            }
            6 -> {
                binding.toolbar.setTitle(getString(R.string.text_sat_figure))
            }
        }
        viewpagerAdapter.addFragment(mListFragment)
        binding.viewPager.adapter = viewpagerAdapter
        binding.textTotalQuestion.text = viewpagerAdapter.count.toString()
    }

    override fun onSingleClick(v: View) {

        when (v.id) {
            R.id.btnBackQuestion -> {
                binding.viewPager.currentItem = binding.viewPager.currentItem - 1
            }
            R.id.btnForwardQuestion -> {
                binding.viewPager.currentItem = binding.viewPager.currentItem + 1
            }
        }
    }
}