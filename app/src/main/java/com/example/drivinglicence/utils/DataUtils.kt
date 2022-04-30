package com.example.drivinglicence.utils

import android.content.Context
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.example.drivinglicence.R
import com.example.drivinglicence.app.entity.Answer
import com.example.drivinglicence.app.entity.Question

fun getQuestionTest(context: Context, position: Int): MutableList<Question> {
    return mutableListOf()
}

fun getAnswerTest(context: Context, position: Int): MutableList<MutableList<Answer>> {
    return mutableListOf()
}

/**-------------------------260 câu hỏi lý thuyết-------------------------*/

/**Câu hỏi điểm liệt*/ //60
fun getListQuestionImportant(context: Context): MutableList<Question> {
    val list = mutableListOf<Question>()
    for (i in 1..10) {
        val id =
            context.resources.getIdentifier("question_important_$i", "string", context.packageName)
        if (id > 0) {
            list.add(
                Question(1, null, context.getString(id), null, true)
            )
        }
    }
    return list
}

var listAnswerImportant = mutableListOf<MutableList<Answer>>()
var listImportant1 = mutableListOf<Answer>()
var listImportant2 = mutableListOf<Answer>()
var listImportant3 = mutableListOf<Answer>()
var listImportant4 = mutableListOf<Answer>()
var listImportant5 = mutableListOf<Answer>()
var listImportant6 = mutableListOf<Answer>()
fun initList(context: Context) {
    /**60 câu hỏi điểm liệt*/
    listImportant1 = mutableListOf(
        Answer(1, context.getString(R.string.answer_important_1_1), false, 1),
        Answer(2, context.getString(R.string.answer_important_1_2), false, 1),
        Answer(
            3, context.getString(R.string.answer_important_1_3), true,
            1, context.getString(R.string.text_explain_answer_important_1)
        ),
        Answer(4, context.getString(R.string.answer_important_1_4), false, 1)
    )
    listImportant2 = mutableListOf(
        Answer(5, context.getString(R.string.answer_important_2_1), false, 2),
        Answer(
            6,
            answerContent = context.getString(R.string.answer_important_2_2),
            true,
            2,
            answerExplain = context.getString(R.string.text_explain_answer_important_2)
        ),
        Answer(7, context.getString(R.string.answer_important_2_3), false, 2),
        Answer(8, context.getString(R.string.answer_important_2_4), false, 2)
    )

    listImportant3 = mutableListOf(
        Answer(9, context.getString(R.string.answer_important_3_1), false, 3),
        Answer(10, context.getString(R.string.answer_important_3_2), false, 3),
        Answer(
            11, context.getString(R.string.answer_important_3_3), true,
            3, context.getString(R.string.text_explain_answer_important_3)
        ),
    )
    listImportant4 = mutableListOf(
        Answer(
            12, context.getString(R.string.answer_important_4_1), true, 4,
            context.getString(R.string.text_explain_answer_important_4)
        ),
        Answer(13, context.getString(R.string.answer_important_4_2), false, 4),
        Answer(14, context.getString(R.string.answer_important_4_3), false, 4)
    )
    listImportant5 = mutableListOf(
        Answer(
            15, context.getString(R.string.answer_important_5_1), true, 5,
            context.getString(R.string.text_explain_answer_important_5)
        ),
        Answer(16, context.getString(R.string.answer_important_5_2), false, 5),
        Answer(17, context.getString(R.string.answer_important_5_3), false, 5)
    )
    listImportant6 = mutableListOf(
        Answer(
            15, context.getString(R.string.answer_important_6_1), true, 6,
            context.getString(R.string.text_explain_answer_important_6)
        ),
        Answer(16, context.getString(R.string.answer_important_6_2), false, 6),
        Answer(17, context.getString(R.string.answer_important_6_3), false, 6)
    )
    listAnswerImportant = mutableListOf(
        listImportant1, listImportant2, listImportant3,
        listImportant4, listImportant5, listImportant6
    )

    /**83 câu khái niệm và quy tắc*/
    listConceptAndRule1 = mutableListOf(
        Answer(1, context.getString(R.string.answer_concepts_and_rules_1_1), false, 1),
        Answer(
            2, context.getString(R.string.answer_concepts_and_rules_1_2), true, 1,
            answerExplain = context.getString(R.string.text_explain_answer_concept_and_rule_1)
        ),
        Answer(
            3, context.getString(R.string.answer_concepts_and_rules_1_3), false,
            1,
        ),
    )
    listConceptAndRule2 = mutableListOf(
        Answer(4, context.getString(R.string.answer_concepts_and_rules_2_1), false, 2),
        Answer(
            5, context.getString(R.string.answer_concepts_and_rules_2_2), true, 2,
            answerExplain = context.getString(R.string.text_explain_answer_concept_and_rule_2)
        ),
        Answer(6, context.getString(R.string.answer_concepts_and_rules_2_3), false, 2),
    )
    listConceptAndRule3 = mutableListOf(
        Answer(7, context.getString(R.string.answer_concepts_and_rules_3_1), false, 3),
        Answer(
            8, context.getString(R.string.answer_concepts_and_rules_3_2), false, 3
        ),
        Answer(
            9, context.getString(R.string.answer_concepts_and_rules_3_3), true, 3,
            answerExplain = context.getString(R.string.text_explain_answer_concept_and_rule_3)
        )
    )

    listAnswerConceptAndRule = mutableListOf(
        listConceptAndRule1, listConceptAndRule2, listConceptAndRule3
    )

    /**Văn hóa và đạo đức lái xe*/

    listCultureAndEthic1 = mutableListOf(
        Answer(1, context.getString(R.string.answer_culture_and_ethics_1_1), false, 1),
        Answer(
            2, context.getString(R.string.answer_culture_and_ethics_1_2), false, 1
        ),
        Answer(
            3, context.getString(R.string.answer_culture_and_ethics_1_3), true,
            1, answerExplain = context.getString(R.string.text_explain_answer_culture_and_ethic_1)
        ),
    )
    listCultureAndEthic2 = mutableListOf(
        Answer(
            4, context.getString(R.string.answer_culture_and_ethics_2_1), true,
            2,
            answerExplain = context.getString(R.string.text_explain_answer_culture_and_ethic_2)
        ),
        Answer(5, context.getString(R.string.answer_culture_and_ethics_2_2), false, 2),
        Answer(6, context.getString(R.string.answer_culture_and_ethics_2_3), false, 2)
    )
    listCultureAndEthic3 = mutableListOf(
        Answer(
            7, context.getString(R.string.answer_culture_and_ethics_3_1), true,
            3,
            answerExplain = context.getString(R.string.text_explain_answer_culture_and_ethic_3)
        ),
        Answer(8, context.getString(R.string.answer_culture_and_ethics_3_2), false, 3),
        Answer(9, context.getString(R.string.answer_culture_and_ethics_3_3), false, 3)
    )
    listCultureAndEthic4 = mutableListOf(
        Answer(
            10, context.getString(R.string.answer_culture_and_ethics_4_1), true,
            4,
            answerExplain = context.getString(R.string.text_explain_answer_culture_and_ethic_4)
        ),
        Answer(11, context.getString(R.string.answer_culture_and_ethics_4_2), false, 4),
        Answer(12, context.getString(R.string.answer_culture_and_ethics_4_3), false, 4)
    )
    listCultureAndEthic5 = mutableListOf(
        Answer(
            13, context.getString(R.string.answer_culture_and_ethics_5_1), false, 5
        ),
        Answer(14, context.getString(R.string.answer_culture_and_ethics_5_2), false, 5),
        Answer(15, context.getString(R.string.answer_culture_and_ethics_5_3), false, 5),
        Answer(
            16, context.getString(R.string.answer_culture_and_ethics_5_3), true, 5,
            answerExplain = context.getString(R.string.text_explain_answer_culture_and_ethic_5)
        )
    )

    listAnswerCultureAndEthic = mutableListOf(
        listCultureAndEthic1, listCultureAndEthic2, listCultureAndEthic3, listCultureAndEthic4,
        listCultureAndEthic5
    )

    /**Kỹ thuật lái xe*/
    listDrivingUnique1 = mutableListOf(
        Answer(
            1, context.getString(R.string.answer_driving_unique_1_1), true, 1,
            context.getString(R.string.text_explain_answer_driving_unique_1)
        ),
        Answer(2, context.getString(R.string.answer_driving_unique_1_2), false, 1)
    )
    listDrivingUnique2 = mutableListOf(
        Answer(
            3, context.getString(R.string.answer_driving_unique_2_1), false, 2,
        ),
        Answer(4, context.getString(R.string.answer_driving_unique_2_2), false, 2),
        Answer(5, context.getString(R.string.answer_driving_unique_2_3), false, 2),
        Answer(
            6, context.getString(R.string.answer_driving_unique_2_4), true, 2,
            context.getString(R.string.text_explain_answer_driving_unique_2)
        )
    )
    listDrivingUnique3 = mutableListOf(
        Answer(
            7, context.getString(R.string.answer_driving_unique_3_1), true, 3,
            context.getString(R.string.text_explain_answer_driving_unique_3)
        ),
        Answer(8, context.getString(R.string.answer_driving_unique_3_2), false, 3)
    )
    listDrivingUnique4 = mutableListOf(
        Answer(
            9, context.getString(R.string.answer_driving_unique_4_1),
            false, 4
        ),
        Answer(10, context.getString(R.string.answer_driving_unique_4_2), false, 4),
        Answer(
            11, context.getString(R.string.answer_driving_unique_4_3), true, 4,
            context.getString(R.string.text_explain_answer_driving_unique_4)
        )
    )
    listDrivingUnique5 = mutableListOf(
        Answer(
            12, context.getString(R.string.answer_driving_unique_5_1),
            false, 5
        ),
        Answer(13, context.getString(R.string.answer_driving_unique_5_2), false, 5),
        Answer(
            14, context.getString(R.string.answer_driving_unique_5_3), true, 5,
            context.getString(R.string.text_explain_answer_driving_unique_5)
        )
    )
    listDrivingUnique6 = mutableListOf(
        Answer(
            15, context.getString(R.string.answer_driving_unique_6_1), false, 6,
        ),
        Answer(16, context.getString(R.string.answer_driving_unique_6_2), false, 6),
        Answer(17, context.getString(R.string.answer_driving_unique_6_3), false, 6),
        Answer(
            18, context.getString(R.string.answer_driving_unique_6_4), true, 6,
            context.getString(R.string.text_explain_answer_driving_unique_6)
        )
    )
    listDrivingUnique7 = mutableListOf(
        Answer(
            19, context.getString(R.string.answer_driving_unique_7_1), false, 7,
        ),
        Answer(20, context.getString(R.string.answer_driving_unique_7_2), false, 7),
        Answer(21, context.getString(R.string.answer_driving_unique_7_3), false, 7),
        Answer(
            22, context.getString(R.string.answer_driving_unique_7_4), true, 7,
            context.getString(R.string.text_explain_answer_driving_unique_7)
        )
    )
    listDrivingUnique8 = mutableListOf(
        Answer(
            19, context.getString(R.string.answer_driving_unique_8_1), false, 8,
        ),
        Answer(20, context.getString(R.string.answer_driving_unique_8_2), false, 8),
        Answer(
            21, context.getString(R.string.answer_driving_unique_8_3), true, 8,
            context.getString(R.string.text_explain_answer_driving_unique_8)
        ),
        Answer(
            22, context.getString(R.string.answer_driving_unique_8_4), false, 8
        )
    )

    listDrivingUnique9 = mutableListOf(
        Answer(
            23, context.getString(R.string.answer_driving_unique_9_1), false, 9,
        ),
        Answer(24, context.getString(R.string.answer_driving_unique_9_2), false, 9),
        Answer(
            25, context.getString(R.string.answer_driving_unique_9_3), true, 9,
            context.getString(R.string.text_explain_answer_driving_unique_9)
        ),
        Answer(
            26, context.getString(R.string.answer_driving_unique_9_4), false, 9
        )
    )
    listDrivingUnique10 = mutableListOf(
        Answer(
            27, context.getString(R.string.answer_driving_unique_10_1),
            false, 5
        ),
        Answer(28, context.getString(R.string.answer_driving_unique_10_2), false, 5),
        Answer(
            29, context.getString(R.string.answer_driving_unique_10_3), true, 5,
            context.getString(R.string.text_explain_answer_driving_unique_10)
        )
    )

    listAnswerDrivingUnique = mutableListOf(
        listDrivingUnique1, listDrivingUnique2, listDrivingUnique3, listDrivingUnique4,
        listDrivingUnique5, listDrivingUnique6, listDrivingUnique7, listDrivingUnique8,
        listDrivingUnique9, listDrivingUnique10
    )
}

/**Khái niệm và quy tắc*/ //83
var listAnswerConceptAndRule = mutableListOf<MutableList<Answer>>()
var listConceptAndRule1 = mutableListOf<Answer>()
var listConceptAndRule2 = mutableListOf<Answer>()
var listConceptAndRule3 = mutableListOf<Answer>()
var listConceptAndRule4 = mutableListOf<Answer>()

/**Văn hóa và đạo đức lái xe*/ //5 answer_culture_and_ethics_1_1
var listAnswerCultureAndEthic = mutableListOf<MutableList<Answer>>()
var listCultureAndEthic1 = mutableListOf<Answer>()
var listCultureAndEthic2 = mutableListOf<Answer>()
var listCultureAndEthic3 = mutableListOf<Answer>()
var listCultureAndEthic4 = mutableListOf<Answer>()
var listCultureAndEthic5 = mutableListOf<Answer>()

/**Kỹ thuật lái xe*/ //12

var listAnswerDrivingUnique = mutableListOf<MutableList<Answer>>()
var listDrivingUnique1 = mutableListOf<Answer>()
var listDrivingUnique2 = mutableListOf<Answer>()
var listDrivingUnique3 = mutableListOf<Answer>()
var listDrivingUnique4 = mutableListOf<Answer>()
var listDrivingUnique5 = mutableListOf<Answer>()
var listDrivingUnique6 = mutableListOf<Answer>()
var listDrivingUnique7 = mutableListOf<Answer>()
var listDrivingUnique8 = mutableListOf<Answer>()
var listDrivingUnique9 = mutableListOf<Answer>()
var listDrivingUnique10 = mutableListOf<Answer>()
var listDrivingUnique11 = mutableListOf<Answer>()
var listDrivingUnique12 = mutableListOf<Answer>()
/**Biển báo đường bộ*/ //65

/**Sa hình*/ //35

