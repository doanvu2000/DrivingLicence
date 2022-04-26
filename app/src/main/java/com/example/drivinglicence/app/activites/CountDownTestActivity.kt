package com.example.drivinglicence.app.activites

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.drivinglicence.R
import com.example.drivinglicence.app.adapter.ViewPagerAdapter
import com.example.drivinglicence.app.entity.Answer
import com.example.drivinglicence.app.entity.ListAnswers
import com.example.drivinglicence.app.entity.Question
import com.example.drivinglicence.app.fragment.LessonFragment
import com.example.drivinglicence.app.viewmodel.MapDataViewModel
import com.example.drivinglicence.component.activity.BaseVMActivity
import com.example.drivinglicence.component.dialog.ListQuestionBottomDialog
import com.example.drivinglicence.databinding.ActivityLessonViewPagerBinding
import com.example.drivinglicence.pref.showDevelopMessage
import com.example.drivinglicence.utils.*

class CountDownTestActivity : BaseVMActivity<ActivityLessonViewPagerBinding, MapDataViewModel>() {
    private val viewpagerAdapter by lazy {
        ViewPagerAdapter(supportFragmentManager)
    }
    private val mListFragment: MutableList<Fragment> = mutableListOf()

    override fun initView() {
        binding.toolbar.setIconLeft(R.drawable.icon_back_white)
        binding.toolbar.setAction(getString(R.string.text_end))
        binding.toolbar.setActionColor(Color.WHITE)
    }

    override fun initListener() {
        binding.toolbar.onLeftClickListener = { onBackPressed() }
        binding.toolbar.onActionClickListener ={
            showDevelopMessage()
        }
        binding.btnBackQuestion.setOnClickListener(this)
        binding.btnForwardQuestion.setOnClickListener(this)
        binding.btnViewBottom.setOnClickListener(this)
        binding.layoutShowBottom.setOnClickListener(this)
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
//        binding.toolbar.setTitle(getString(R.string.text_60_question_important))
        listQuestion = intent.extras?.getParcelableArrayList(QUESTIONS) ?: mutableListOf()
        listAnswer =
            intent.extras?.getParcelable<ListAnswers>(LIST_ANSWERS)?.listAnswers ?: mutableListOf()
        for (i in 1..listAnswer.size) {
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
            R.id.btnBackQuestion -> {
                binding.viewPager.currentItem = binding.viewPager.currentItem - 1
            }
            R.id.btnForwardQuestion -> {
                binding.viewPager.currentItem = binding.viewPager.currentItem + 1
            }
            R.id.btn_view_bottom, R.id.layout_show_bottom -> {
                showBottomDialog()
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun showBottomDialog() {
        Log.d("TAG", "showBottomDialog: ")
        val bundle = Bundle()
        bundle.putParcelableArrayList(QUESTIONS, listQuestion as ArrayList)
        bundle.putInt(POSITION, binding.textCurrentQuestion.text.toString().toInt() - 1)
        ListQuestionBottomDialog().also { dialog ->
            dialog.arguments = bundle
            dialog.show(supportFragmentManager, "")
            dialog.onClickItem = { pos ->
                dialog.dismiss()
                when (pos) {
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
                binding.textCurrentQuestion.text = "${pos + 1}"
                binding.viewPager.currentItem = pos
            }
        }
    }
}