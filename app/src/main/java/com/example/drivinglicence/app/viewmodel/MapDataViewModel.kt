package com.example.drivinglicence.app.viewmodel

import android.content.Context
import android.util.Log
import com.example.drivinglicence.app.entity.Answer
import com.example.drivinglicence.app.entity.Question
import com.example.drivinglicence.component.viewmodel.BaseViewModel
import com.example.drivinglicence.utils.listAnswerConceptAndRule
import com.example.drivinglicence.utils.listAnswerCultureAndEthic
import com.example.drivinglicence.utils.listAnswerImportant
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.util.concurrent.Flow

class MapDataViewModel : BaseViewModel() {

    val mapResult = mutableMapOf<Int, Boolean>()
    var listQuestion: MutableList<Question> = mutableListOf()
    var listAnswer: MutableList<MutableList<Answer>> = mutableListOf()

    var mapAnswerImportant = HashMap<Int, MutableList<Answer>>()
    var mapAnswerConceptsAndRules = HashMap<Int, MutableList<Answer>>()
    var mapAnswerCulturesAndEthics = HashMap<Int, MutableList<Answer>>()

    /** 60 question important 1 -> 60 */
    fun getAnswerWithQuestionImportant() {
        for (i in 1..6) {
            mapAnswerImportant[i] = listAnswerImportant[i - 1]
        }
    }

    fun getListQuestionImportant(context: Context): MutableList<Question> {
        val list = mutableListOf<Question>()
        for (i in 1..6) {
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

    /** 83 question  concepts and rules 1 -> 83 */
    private fun getAnswerWithQuestionConcepts() {
        for (i in 1..3) {
            mapAnswerConceptsAndRules[i] = listAnswerConceptAndRule[i - 1]
        }
    }

    fun getListQuestionConceptsAndRules(context: Context): MutableList<Question> {
        val list = mutableListOf<Question>()
        for (i in 1..3) {
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

    /** 5 question cultures and ethics 1 -> 5 */
    private fun getAnswerWithQuestionCulturesAndEthics() {
        for (i in 1..5) {
            mapAnswerCulturesAndEthics[i] = listAnswerCultureAndEthic[i - 1]
        }
    }

    fun getListQuestionCulturesAndEthics(context: Context): MutableList<Question> {
        val list = mutableListOf<Question>()
        for (i in 1..5) {
            val id =
                context.resources.getIdentifier(
                    "question_culture_and_ethics_$i",
                    "string",
                    context.packageName
                )
            if (id > 0) {
                list.add(
                    Question(i, null, context.getString(id), null, false)
                )
            }
        }
        getAnswerWithQuestionCulturesAndEthics()
        return list
    }

}