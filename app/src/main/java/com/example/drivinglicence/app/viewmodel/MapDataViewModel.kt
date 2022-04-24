package com.example.drivinglicence.app.viewmodel

import android.content.Context
import com.example.drivinglicence.app.entity.Answer
import com.example.drivinglicence.app.entity.Question
import com.example.drivinglicence.component.viewmodel.BaseViewModel
import com.example.drivinglicence.utils.listAnswerConceptAndRule
import com.example.drivinglicence.utils.listAnswerImportant

class MapDataViewModel : BaseViewModel() {

    var mapAnswerImportant = HashMap<Int, MutableList<Answer>>()
    var mapAnswerConceptsAndRules = HashMap<Int, MutableList<Answer>>()

    /** 60 question 1 -> 60 */
    fun getAnswerWithQuestionImportant() {
        for (i in 1..3) {
            mapAnswerImportant[i] = listAnswerImportant[i - 1]
        }
    }

    fun getListQuestionImportant(context: Context): MutableList<Question> {
        val list = mutableListOf<Question>()
        for (i in 1..10) {
            val id =
                context.resources.getIdentifier(
                    "question_important_$i",
                    "string",
                    context.packageName
                )
            if (id > 0) {
                list.add(
                    Question(i, null, context.getString(id), null, true)
                )
            }
        }
        getAnswerWithQuestionImportant()
        return list
    }

    /** 83 question 1 -> 83 */
    private fun getAnswerWithQuestionConcepts() {
        for (i in 1..2) {
            mapAnswerConceptsAndRules[i] = listAnswerConceptAndRule[i - 1]
        }
    }
    fun getListQuestionConceptsAndRules(context: Context): MutableList<Question> {
        val list = mutableListOf<Question>()
        for (i in 1..2) {
            val id =
                context.resources.getIdentifier(
                    "question_concepts_and_rules_$i",
                    "string",
                    context.packageName
                )
            if (id > 0) {
                list.add(
                    Question(i, null, context.getString(id), null, false)
                )
            }
        }
        getAnswerWithQuestionConcepts()
        return list
    }

}