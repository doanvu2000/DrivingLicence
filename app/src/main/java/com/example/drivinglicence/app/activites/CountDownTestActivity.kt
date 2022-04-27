package com.example.drivinglicence.app.activites

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import com.example.drivinglicence.R
import com.example.drivinglicence.app.adapter.ViewPagerAdapter
import com.example.drivinglicence.app.entity.Answer
import com.example.drivinglicence.app.entity.ListAnswers
import com.example.drivinglicence.app.entity.Question
import com.example.drivinglicence.app.fragment.LessonCountDownFragment
import com.example.drivinglicence.app.viewmodel.MapDataViewModel
import com.example.drivinglicence.component.activity.BaseVMActivity
import com.example.drivinglicence.component.dialog.AlertMessageDialog
import com.example.drivinglicence.component.dialog.ListQuestionBottomDialog
import com.example.drivinglicence.databinding.ActivityLessonViewPagerBinding
import com.example.drivinglicence.pref.showDevelopMessage
import com.example.drivinglicence.utils.*
import kotlin.math.roundToInt

class CountDownTestActivity : BaseVMActivity<ActivityLessonViewPagerBinding, MapDataViewModel>() {

    private val viewpagerAdapter by lazy {
        ViewPagerAdapter(supportFragmentManager)
    }
    private val mListFragment: MutableList<Fragment> = mutableListOf()

    var timeCount: Long = 0
    var isFinish = false
    private var timer = object : CountDownTimer(1000 * 10 * 60, 1000) {
        override fun onTick(millisUntilFinished: Long) {
            val ms = millisUntilFinished / 1000
            timeCount = ms
            binding.toolbar.setTitle(formatTime(ms))
        }

        override fun onFinish() {
            //end test exam
            isFinish = true
            handlerFinish()
        }
    }

    private fun formatTime(time: Long): String {
        val minutes: Int = (time / 60).toDouble().roundToInt()
        val second = time - minutes * 60
        return "$minutes : $second"
    }


    override fun initView() {
        binding.toolbar.setIconLeft(R.drawable.icon_back_white)
        binding.toolbar.setAction(getString(R.string.text_end))
        binding.toolbar.setActionColor(Color.WHITE)
        timer.start()
    }


    override fun initListener() {
        binding.toolbar.onLeftClickListener = {
            onBackPressed()
            timer.cancel()
        }
        binding.toolbar.onActionClickListener = {
            showDevelopMessage()
            isFinish = true
            timer.cancel()
            handlerFinish()
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

    private fun handlerFinish() {
        /**Thống kê câu sai và đúng, kiểm tra trượt hay đỗ*/
        var isPass = true
        var count = 0
        for (index in 0 until listAnswer.size) {
            listAnswer[index].map { answer ->
                answer.apply {
                    if (isChoose == true && isCorrect) {
                        count++
//                        viewModel.mapResult[answer.questionId] = true
                    } else {
//                        viewModel.mapResult[answer.questionId] = false
                    }
                }
            }
        }
        for (item in listQuestion) {
            if ((item.isImportant && viewModel.mapResult[item.questionId] == false)
                || (item.isImportant && item.isChooseAnswer == false)
            ) {
                isPass = false
            }
        }
        //count < 21
        if (count < listQuestion.size - 2) {
            isPass = false
        }
        AlertMessageDialog(this).also { alert ->
            val buttonText = getString(R.string.text_confirm)
            var title = ""
            when (isPass) {
                true -> { // pass
                    title = getString(R.string.text_pass_exam)
                    alert.setColorTitle(ContextCompat.getColor(this, R.color.green))
                }
                else -> { // failed
                    title = getString(R.string.text_failed_exam)
                    alert.setColorTitle(ContextCompat.getColor(this, R.color.red))
                }
            }

            alert.show(title, "Số câu đúng: $count", buttonText, cancelAble = false,
                onClickSubmit = {
                    alert.hide()
                    onBackPressed()
                }
            )
            alert.hideCancelButton()
        }
    }

    private var listQuestion: MutableList<Question> = mutableListOf()
    private var listAnswer: MutableList<MutableList<Answer>> = mutableListOf()
    override fun initData() {
        listQuestion = intent.extras?.getParcelableArrayList(QUESTIONS) ?: mutableListOf()
        listAnswer =
            intent.extras?.getParcelable<ListAnswers>(LIST_ANSWERS)?.listAnswers ?: mutableListOf()
        viewModel.listQuestion = listQuestion
        viewModel.listAnswer = listAnswer
        for (i in 1..listAnswer.size) {
            val question = listQuestion[i - 1]
            val answers = listAnswer[i - 1] as ArrayList<Answer>
            mListFragment.add(LessonCountDownFragment().apply {
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
        val bundle = Bundle()
        bundle.putParcelableArrayList(QUESTIONS, viewModel.listQuestion as ArrayList)
        val map = mutableMapOf<Int, Boolean>()
        viewModel.listQuestion.map {
            map[it.questionId] = it.isChooseAnswer ?: false
        }
        Log.d("TAG", "showBottomDialog: $map")
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