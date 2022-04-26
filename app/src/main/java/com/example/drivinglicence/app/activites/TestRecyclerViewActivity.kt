package com.example.drivinglicence.app.activites

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.drivinglicence.R
import com.example.drivinglicence.app.adapter.ActionAdapter
import com.example.drivinglicence.app.adapter.ExamAdapter
import com.example.drivinglicence.app.adapter.ListQuestionBottomAdapter
import com.example.drivinglicence.app.entity.ItemAction
import com.example.drivinglicence.app.entity.Question
import com.example.drivinglicence.databinding.ActivityTestRecyclerViewBinding
import com.example.drivinglicence.utils.setDivider

class TestRecyclerViewActivity : AppCompatActivity() {
    val examAdapter by lazy {
        ExamAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_recycler_view)
        val rcv = findViewById<RecyclerView>(R.id.rcvTest)
        for (i in 1..20) {
            examAdapter.addData(i)
        }
        rcv.layoutManager = LinearLayoutManager(this)
        rcv.adapter = examAdapter
        rcv.setDivider(R.drawable.item_divider)
    }
}