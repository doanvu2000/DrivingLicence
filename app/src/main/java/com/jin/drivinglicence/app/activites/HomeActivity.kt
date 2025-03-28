package com.jin.drivinglicence.app.activites

import android.view.Menu
import android.view.MenuItem
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.toDrawable
import com.jin.drivinglicence.R
import com.jin.drivinglicence.app.adapter.ActionAdapter
import com.jin.drivinglicence.app.entity.ItemAction
import com.jin.drivinglicence.component.activity.BaseCoreActivity
import com.jin.drivinglicence.component.navigator.openActivity
import com.jin.drivinglicence.component.widgets.recyclerview.RecyclerUtils
import com.jin.drivinglicence.databinding.ActivityMainBinding
import com.jin.drivinglicence.pref.LocalCache
import com.jin.drivinglicence.pref.showMessage
import com.jin.drivinglicence.utils.initAllList
import com.jin.drivinglicence.utils.showDialogDevelopment

class HomeActivity : BaseCoreActivity<ActivityMainBinding>() {
    private val actionAdapter by lazy {
        ActionAdapter()
    }

    private lateinit var listAction: MutableList<ItemAction>

    override fun initView() {
        LocalCache.initialize(this)
        supportActionBar?.setBackgroundDrawable(
            ContextCompat.getColor(
                this,
                R.color.primary
            ).toDrawable()
        )
        supportActionBar?.title = getString(R.string.app_name) + " A1"
        initSlide()
    }

    private fun initSlide() {
        val listImageSlide =
            arrayListOf(
                R.drawable.slide1,
                R.drawable.slide2,
                R.drawable.slide4,
                R.drawable.slide5,
                R.drawable.slide6
            )
        for (item in listImageSlide) {
            val imageView = ImageView(this)
            imageView.scaleType = ImageView.ScaleType.FIT_XY
            imageView.setImageResource(item)
            binding.slide.addView(imageView)
        }
        //time to slide
        binding.slide.flipInterval = 1700
        binding.slide.isAutoStart = true
        val animationSlideIn = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left)
        val animationSlideOut = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right)
        binding.slide.inAnimation = animationSlideIn
        binding.slide.outAnimation = animationSlideOut
    }

    override fun initData() {
        RecyclerUtils.setGridManager(this, binding.rcvItem, 3, actionAdapter)
        listAction = ArrayList()
        val item1 = ItemAction(getString(R.string.text_exam), R.drawable.exam)
        val item2 = ItemAction(getString(R.string.text_learning_theory), R.drawable.book)
        val item3 = ItemAction(getString(R.string.text_road_signs), R.drawable.stop2)
        val item4 = ItemAction(getString(R.string.text_tips), R.drawable.star)
        val item5 = ItemAction(getString(R.string.text_search_law), R.drawable.law)
        val item6 = ItemAction(getString(R.string.text_sometime_error), R.drawable.computer)
        listAction = arrayListOf(item1, item2, item3, item4, item5, item6)
        actionAdapter.addData(listAction)
        initAllList(this)
    }

    override fun initListener() {
        actionAdapter.onCLickItem = {
            when (listAction[it].title) {
                getString(R.string.text_exam) -> {
                    /**Thi sát hạch*/
                    openActivity(TestLicenseActivity::class.java, false)
                }

                getString(R.string.text_learning_theory) -> {
                    /**Học lý thuyết*/
                    openActivity(LearningTheoryActivity::class.java, false)
                }

                getString(R.string.text_road_signs) -> {
                    /**Biển báo đường bộ*/
                    openActivity(RoadTrafficSignsActivity::class.java, false)
                }

                getString(R.string.text_tips) -> {
                    /**Mẹo đạt kết quả cao*/
                    openActivity(TipsActivity::class.java, false)
                }

                getString(R.string.text_search_law) -> {
                    /**Tra cứu luật*/
                    openActivity(SearchLawActivity::class.java, false)
                }

                else -> {
                    showDialogDevelopment(this)
                }
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_setting, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item_license_A1 -> {
                supportActionBar?.title = getString(R.string.app_name) + " A1"
                showMessage(this, getString(R.string.text_chose_license_A1))
            }

            R.id.item_license_A2 -> {
                supportActionBar?.title = getString(R.string.app_name) + " A2"
                showMessage(this, getString(R.string.text_chose_license_A2))
            }
        }
        return false
    }
}