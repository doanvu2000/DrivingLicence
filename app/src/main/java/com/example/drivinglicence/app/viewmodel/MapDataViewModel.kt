package com.example.drivinglicence.app.viewmodel

import android.content.Context
import android.util.Log
import com.example.drivinglicence.R
import com.example.drivinglicence.app.entity.Answer
import com.example.drivinglicence.app.entity.Question
import com.example.drivinglicence.component.viewmodel.BaseViewModel
import com.example.drivinglicence.utils.listAnswerConceptAndRule
import com.example.drivinglicence.utils.listAnswerCultureAndEthic
import com.example.drivinglicence.utils.listAnswerDrivingUnique
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
    var mapAnswerDrivingUnique = HashMap<Int, MutableList<Answer>>()

    /** 35 question important 1 -> 35 */
    private fun getAnswerWithQuestionImportant() {
        for (i in 1..35) {
            mapAnswerImportant[i] = listAnswerImportant[i - 1]
        }
    }

    fun getListQuestionImportant(context: Context): MutableList<Question> {
        val list = mutableListOf<Question>()
        for (i in 1..35) {
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

    /** 29 question  concepts and rules 41 -> 70 */
    private fun getAnswerWithQuestionConcepts() {
        for (i in 1..30) {
            mapAnswerConceptsAndRules[i + 40] = listAnswerConceptAndRule[i - 1]
        }
    }

    fun getListQuestionConceptsAndRules(context: Context): MutableList<Question> {
        val list = mutableListOf<Question>()
        for (i in 1..14) {
            val id =
                context.resources.getIdentifier(
                    "question_concepts_and_rules_$i",
                    "string",
                    context.packageName
                )
            if (id > 0) {
                list.add(
                    Question(i + 40, null, context.getString(id), null, false)
                )
            }
        }
        //55 -> 70
        list.add(Question(55, null, context.getString(R.string.question_important_3), null, true))
        list.add(Question(56, null, context.getString(R.string.question_important_4), null, true))
        list.add(Question(57, null, context.getString(R.string.question_important_7), null, true))
        list.add(Question(58, null, context.getString(R.string.question_important_8), null, true))
        list.add(Question(59, null, context.getString(R.string.question_important_10), null, true))
        list.add(Question(60, null, context.getString(R.string.question_important_18), null, true))
        list.add(Question(61, null, context.getString(R.string.question_important_21), null, true))
        list.add(Question(62, null, context.getString(R.string.question_important_22), null, true))
        list.add(Question(63, null, context.getString(R.string.question_important_23), null, true))
        list.add(Question(64, null, context.getString(R.string.question_important_24), null, true))
        list.add(Question(65, null, context.getString(R.string.question_important_25), null, true))
        list.add(Question(66, null, context.getString(R.string.question_important_26), null, true))
        list.add(Question(67, null, context.getString(R.string.question_important_27), null, true))
        list.add(Question(68, null, context.getString(R.string.question_important_28), null, true))
        list.add(Question(69, null, context.getString(R.string.question_important_29), null, true))
        list.add(Question(70, null, context.getString(R.string.question_important_34), null, true))
        getAnswerWithQuestionConcepts()
        return list
    }

    /** 5 question cultures and ethics 81 -> 85 */
    private fun getAnswerWithQuestionCulturesAndEthics() {
        for (i in 1..5) {
            mapAnswerCulturesAndEthics[i + 80] = listAnswerCultureAndEthic[i - 1]
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

    /** 12 question driving unique 91 -> 102 */
    private fun getAnswerWithQuestionDrivingUnique() {
        for (i in 1..12) {
            mapAnswerDrivingUnique[i + 90] = listAnswerDrivingUnique[i - 1]
        }
    }

    fun getListQuestionDrivingUnique(context: Context): MutableList<Question> {
        val list = mutableListOf<Question>()
        for (i in 1..10) {
            val id =
                context.resources.getIdentifier(
                    "question_driving_unique_$i",
                    "string",
                    context.packageName
                )
            if (id > 0) {
                list.add(
                    Question(i, null, context.getString(id), null, false)
                )
            }
        }
        list.add(Question(101, null, context.getString(R.string.question_important_34), null, true))
        list.add(Question(102, null, context.getString(R.string.question_important_35), null, true))
        getAnswerWithQuestionDrivingUnique()
        return list
    }

}