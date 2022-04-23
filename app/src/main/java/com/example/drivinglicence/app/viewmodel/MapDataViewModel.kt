package com.example.drivinglicense.app.viewmodel

import android.content.Context
import com.example.drivinglicense.app.entity.Answer
import com.example.drivinglicense.app.entity.Question
import com.example.drivinglicense.component.viewmodel.BaseViewModel
import com.example.drivinglicense.utils.listAnswer

class MapDataViewModel : BaseViewModel() {

    var mapAnswer = HashMap<Int, MutableList<Answer>>()

    /** 60 question 1 -> 60 */
    fun getAnswerWithQuestionImportant() {
        for (i in 1..3) {
            mapAnswer[i] = listAnswer[i - 1]
        }
    }

    fun getListQuestionImportant(context: Context): MutableList<Question> {
        val list = mutableListOf<Question>()
        for (i in 1..10) {
            val id =
                context.resources.getIdentifier("question_important_$i", "string", context.packageName)
            if (id > 0) {
                list.add(
                    Question(i, null, context.getString(id), null, true)
                )
            }
        }
        getAnswerWithQuestionImportant()
        return list
    }

}