package com.example.drivinglicence.utils

import android.content.Context
import com.example.drivinglicence.R
import com.example.drivinglicence.app.entity.Answer
import com.example.drivinglicence.app.entity.Question

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
        Answer(1, context.getString(R.string.answer_important_2_1), false, 2),
        Answer(
            2,
            answerContent = context.getString(R.string.answer_important_2_2),
            true,
            2,
            answerExplain = context.getString(R.string.text_explain_answer_important_2)
        ),
        Answer(3, context.getString(R.string.answer_important_2_3), false, 2),
        Answer(4, context.getString(R.string.answer_important_2_4), false, 2)
    )

    listImportant3 = mutableListOf(
        Answer(1, context.getString(R.string.answer_important_1_1), false, 1),
        Answer(2, context.getString(R.string.answer_important_1_2), false, 1),
        Answer(
            3, context.getString(R.string.answer_important_1_3), true,
            1, context.getString(R.string.text_explain_answer_important_3)
        ),
    )
    listAnswerImportant = mutableListOf(listImportant1, listImportant2, listImportant3)

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
        Answer(1, context.getString(R.string.answer_concepts_and_rules_2_1), false, 2),
        Answer(
            2, context.getString(R.string.answer_concepts_and_rules_2_2), true, 2,
            answerExplain = context.getString(R.string.text_explain_answer_concept_and_rule_2)
        ),
        Answer(3, context.getString(R.string.answer_concepts_and_rules_2_3), false, 2),
    )
    listConceptAndRule3 = mutableListOf(
        Answer(1, context.getString(R.string.answer_concepts_and_rules_3_1), false, 3),
        Answer(
            2, context.getString(R.string.answer_concepts_and_rules_3_2), false, 3
        ),
        Answer(
            3, context.getString(R.string.answer_concepts_and_rules_3_3), true, 3,
            answerExplain = context.getString(R.string.text_explain_answer_concept_and_rule_3)
        )
    )

    listAnswerConceptAndRule = mutableListOf(
        listConceptAndRule1, listConceptAndRule2,
        listConceptAndRule3
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
            1, context.getString(R.string.answer_culture_and_ethics_2_1), true,
            2,
            answerExplain = context.getString(R.string.text_explain_answer_culture_and_ethic_2)
        ),
        Answer(2, context.getString(R.string.answer_culture_and_ethics_2_2), false, 2),
        Answer(3, context.getString(R.string.answer_culture_and_ethics_2_3), false, 2)
    )
    listCultureAndEthic3 = mutableListOf(
        Answer(
            1, context.getString(R.string.answer_culture_and_ethics_3_1), true,
            3,
            answerExplain = context.getString(R.string.text_explain_answer_culture_and_ethic_3)
        ),
        Answer(2, context.getString(R.string.answer_culture_and_ethics_3_2), false, 3),
        Answer(3, context.getString(R.string.answer_culture_and_ethics_3_3), false, 3)
    )
    listCultureAndEthic4 = mutableListOf(
        Answer(
            1, context.getString(R.string.answer_culture_and_ethics_4_1), true,
            4,
            answerExplain = context.getString(R.string.text_explain_answer_culture_and_ethic_4)
        ),
        Answer(2, context.getString(R.string.answer_culture_and_ethics_4_2), false, 4),
        Answer(3, context.getString(R.string.answer_culture_and_ethics_4_3), false, 4)
    )
    listCultureAndEthic5 = mutableListOf(
        Answer(
            1, context.getString(R.string.answer_culture_and_ethics_5_1), false, 5
        ),
        Answer(2, context.getString(R.string.answer_culture_and_ethics_5_2), false, 5),
        Answer(3, context.getString(R.string.answer_culture_and_ethics_5_3), false, 5),
        Answer(
            3, context.getString(R.string.answer_culture_and_ethics_5_3), true, 5,
            answerExplain = context.getString(R.string.text_explain_answer_culture_and_ethic_5)
        )
    )

    listAnswerCultureAndEthic = mutableListOf(
        listCultureAndEthic1,
        listCultureAndEthic2,
        listCultureAndEthic3,
        listCultureAndEthic4,
        listCultureAndEthic5
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

/**Biển báo đường bộ*/ //65

/**Sa hình*/ //35