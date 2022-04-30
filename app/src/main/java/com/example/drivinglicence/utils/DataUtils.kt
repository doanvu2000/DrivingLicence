package com.example.drivinglicence.utils

import android.content.Context
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

/**Câu hỏi điểm liệt*/ //35
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
var listImportant7 = mutableListOf<Answer>()
var listImportant8 = mutableListOf<Answer>()
var listImportant9 = mutableListOf<Answer>()
var listImportant10 = mutableListOf<Answer>()
var listImportant11 = mutableListOf<Answer>()
var listImportant12 = mutableListOf<Answer>()
var listImportant13 = mutableListOf<Answer>()
var listImportant14 = mutableListOf<Answer>()
var listImportant15 = mutableListOf<Answer>()
var listImportant16 = mutableListOf<Answer>()
var listImportant17 = mutableListOf<Answer>()
var listImportant18 = mutableListOf<Answer>()
var listImportant19 = mutableListOf<Answer>()
var listImportant20 = mutableListOf<Answer>()
var listImportant21 = mutableListOf<Answer>()
var listImportant22 = mutableListOf<Answer>()
var listImportant23 = mutableListOf<Answer>()
var listImportant24 = mutableListOf<Answer>()
var listImportant25 = mutableListOf<Answer>()
var listImportant26 = mutableListOf<Answer>()
var listImportant27 = mutableListOf<Answer>()
var listImportant28 = mutableListOf<Answer>()
var listImportant29 = mutableListOf<Answer>()
var listImportant30 = mutableListOf<Answer>()
var listImportant31 = mutableListOf<Answer>()
var listImportant32 = mutableListOf<Answer>()
var listImportant33 = mutableListOf<Answer>()
var listImportant34 = mutableListOf<Answer>()
var listImportant35 = mutableListOf<Answer>()
fun initList(context: Context) {
    /**35 câu hỏi điểm liệt*/
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
    listImportant7 = mutableListOf(
        Answer(18, context.getString(R.string.answer_important_7_1), false, 7),
        Answer(
            19, context.getString(R.string.answer_important_7_2), true, 7,
            context.getString(R.string.text_explain_answer_important_7)
        ),
        Answer(20, context.getString(R.string.answer_important_7_3), false, 7)
    )
    listImportant8 = mutableListOf(
        Answer(
            21, context.getString(R.string.answer_important_8_1), true, 8,
            context.getString(R.string.text_explain_answer_important_8)
        ),
        Answer(22, context.getString(R.string.answer_important_8_2), false, 8),
        Answer(23, context.getString(R.string.answer_important_8_3), false, 8),
        Answer(24, context.getString(R.string.answer_important_8_4), false, 8)
    )
    listImportant9 = mutableListOf(
        Answer(25, context.getString(R.string.answer_important_9_1), false, 9),
        Answer(
            26, context.getString(R.string.answer_important_9_2), true, 9,
            context.getString(R.string.text_explain_answer_important_9)
        ),
        Answer(27, context.getString(R.string.answer_important_9_3), false, 9),
        Answer(28, context.getString(R.string.answer_important_9_4), false, 9)
    )
    listImportant10 = mutableListOf(
        Answer(29, context.getString(R.string.answer_important_10_1), false, 10),
        Answer(30, context.getString(R.string.answer_important_10_2), false, 10),
        Answer(
            31, context.getString(R.string.answer_important_10_3), true, 10,
            context.getString(R.string.text_explain_answer_important_10)
        )
    )
    listImportant11 = mutableListOf(
        Answer(32, context.getString(R.string.answer_important_11_1), false, 11),
        Answer(33, context.getString(R.string.answer_important_11_2), false, 11),
        Answer(
            34, context.getString(R.string.answer_important_11_3), true, 11,
            context.getString(R.string.text_explain_answer_important_11)
        )
    )
    listImportant12 = mutableListOf(
        Answer(35, context.getString(R.string.answer_important_12_1), false, 12),
        Answer(
            36, context.getString(R.string.answer_important_12_2), true, 12,
            context.getString(R.string.text_explain_answer_important_12)
        ),
        Answer(37, context.getString(R.string.answer_important_12_3), false, 12)
    )
    listImportant13 = mutableListOf(
        Answer(
            38, context.getString(R.string.answer_important_13_1), true, 13,
            context.getString(R.string.text_explain_answer_important_13)
        ),
        Answer(39, context.getString(R.string.answer_important_13_2), false, 13),
        Answer(40, context.getString(R.string.answer_important_13_3), false, 13),
        Answer(41, context.getString(R.string.answer_important_13_4), false, 13),
    )
    listImportant14 = mutableListOf(
        Answer(42, context.getString(R.string.answer_important_14_1), false, 14),
        Answer(43, context.getString(R.string.answer_important_14_2), false, 14),
        Answer(
            44, context.getString(R.string.answer_important_14_3), true, 14,
            context.getString(R.string.text_explain_answer_important_14)
        ),
        Answer(45, context.getString(R.string.answer_important_14_4), false, 14),
    )
    listImportant15 = mutableListOf(
        Answer(46, context.getString(R.string.answer_important_15_1), false, 15),
        Answer(
            47, context.getString(R.string.answer_important_15_2), true, 15,
            context.getString(R.string.text_explain_answer_important_15)
        ),
        Answer(48, context.getString(R.string.answer_important_15_3), false, 15)
    )
    listImportant16 = mutableListOf(
        Answer(49, context.getString(R.string.answer_important_16_1), false, 16),
        Answer(50, context.getString(R.string.answer_important_16_2), false, 16),
        Answer(
            51, context.getString(R.string.answer_important_16_3), true, 16,
            context.getString(R.string.text_explain_answer_important_16)
        )
    )
    listImportant17 = mutableListOf(
        Answer(
            52, context.getString(R.string.answer_important_17_1), true, 17,
            context.getString(R.string.text_explain_answer_important_17)
        ),
        Answer(53, context.getString(R.string.answer_important_17_2), false, 17),
        Answer(54, context.getString(R.string.answer_important_17_3), false, 17)
    )
    listImportant18 = mutableListOf(
        Answer(55, context.getString(R.string.answer_important_18_1), false, 18),
        Answer(
            56, context.getString(R.string.answer_important_18_2), true, 18,
            context.getString(R.string.text_explain_answer_important_18)
        ),
        Answer(57, context.getString(R.string.answer_important_18_3), false, 18)
    )
    listImportant19 = mutableListOf(
        Answer(
            58, context.getString(R.string.answer_important_19_1), true, 19,
            context.getString(R.string.text_explain_answer_important_19)
        ),
        Answer(59, context.getString(R.string.answer_important_19_2), false, 19),
        Answer(60, context.getString(R.string.answer_important_19_3), false, 19)
    )
    listImportant20 = mutableListOf(
        Answer(61, context.getString(R.string.answer_important_20_1), false, 20),
        Answer(
            62, context.getString(R.string.answer_important_20_2), true, 20,
            context.getString(R.string.text_explain_answer_important_20)
        ),
        Answer(63, context.getString(R.string.answer_important_20_3), false, 20)
    )
    listImportant21 = mutableListOf(
        Answer(64, context.getString(R.string.answer_important_21_1), false, 21),
        Answer(65, context.getString(R.string.answer_important_21_2), false, 21),
        Answer(66, context.getString(R.string.answer_important_21_3), false, 21),
        Answer(
            67, context.getString(R.string.answer_important_21_4), true, 21,
            context.getString(R.string.text_explain_answer_important_21)
        )
    )
    listImportant22 = mutableListOf(
        Answer(68, context.getString(R.string.answer_important_22_1), false, 22),
        Answer(69, context.getString(R.string.answer_important_22_2), false, 22),
        Answer(
            70, context.getString(R.string.answer_important_22_3), true, 22,
            context.getString(R.string.text_explain_answer_important_22)
        )
    )
    listImportant23 = mutableListOf(
        Answer(
            71, context.getString(R.string.answer_important_23_1), true, 23,
            context.getString(R.string.text_explain_answer_important_23)
        ),
        Answer(72, context.getString(R.string.answer_important_23_2), false, 23),
        Answer(73, context.getString(R.string.answer_important_23_3), false, 23),
        Answer(74, context.getString(R.string.answer_important_23_4), false, 23)
    )
    listImportant24 = mutableListOf(
        Answer(
            75, context.getString(R.string.answer_important_24_1), true, 24,
            context.getString(R.string.text_explain_answer_important_24)
        ),
        Answer(76, context.getString(R.string.answer_important_24_2), false, 24),
        Answer(77, context.getString(R.string.answer_important_24_3), false, 24),
        Answer(78, context.getString(R.string.answer_important_24_4), false, 24)
    )
    listImportant25 = mutableListOf(
        Answer(79, context.getString(R.string.answer_important_25_1), false, 25),
        Answer(80, context.getString(R.string.answer_important_25_2), false, 25),
        Answer(81, context.getString(R.string.answer_important_25_3), false, 25),
        Answer(
            82, context.getString(R.string.answer_important_25_4), true, 25,
            context.getString(R.string.text_explain_answer_important_25)
        )
    )
    listImportant26 = mutableListOf(
        Answer(83, context.getString(R.string.answer_important_26_1), false, 26),
        Answer(84, context.getString(R.string.answer_important_26_2), false, 26),
        Answer(
            85, context.getString(R.string.answer_important_26_3), true, 26,
            context.getString(R.string.text_explain_answer_important_26)
        ),
        Answer(86, context.getString(R.string.answer_important_26_4), false, 26)
    )
    listImportant27 = mutableListOf(
        Answer(87, context.getString(R.string.answer_important_27_1), false, 27),
        Answer(
            88, context.getString(R.string.answer_important_27_2), true, 27,
            context.getString(R.string.text_explain_answer_important_27)
        ),
        Answer(89, context.getString(R.string.answer_important_27_3), false, 27),
        Answer(90, context.getString(R.string.answer_important_27_4), false, 27)
    )
    listImportant28 = mutableListOf(
        Answer(91, context.getString(R.string.answer_important_28_1), false, 28),
        Answer(92, context.getString(R.string.answer_important_28_2), false, 28),
        Answer(
            93, context.getString(R.string.answer_important_28_3), true, 28,
            context.getString(R.string.text_explain_answer_important_28)
        )
    )
    listImportant29 = mutableListOf(
        Answer(
            94, context.getString(R.string.answer_important_29_1), true, 29,
            context.getString(R.string.text_explain_answer_important_29)
        ),
        Answer(95, context.getString(R.string.answer_important_29_2), false, 29),
        Answer(96, context.getString(R.string.answer_important_29_3), false, 29)
    )
    listImportant30 = mutableListOf(
        Answer(
            97, context.getString(R.string.answer_important_30_1), true, 30,
            context.getString(R.string.text_explain_answer_important_30)
        ),
        Answer(98, context.getString(R.string.answer_important_30_2), false, 30),
        Answer(99, context.getString(R.string.answer_important_30_3), false, 30),
        Answer(100, context.getString(R.string.answer_important_30_4), false, 30)
    )
    listImportant31 = mutableListOf(
        Answer(
            101, context.getString(R.string.answer_important_31_1), true, 31,
            context.getString(R.string.text_explain_answer_important_31)
        ),
        Answer(102, context.getString(R.string.answer_important_31_2), false, 31),
        Answer(103, context.getString(R.string.answer_important_31_3), false, 31)
    )
    listImportant32 = mutableListOf(
        Answer(104, context.getString(R.string.answer_important_32_1), false, 32),
        Answer(105, context.getString(R.string.answer_important_32_2), false, 32),
        Answer(
            106, context.getString(R.string.answer_important_32_3), true, 32,
            context.getString(R.string.text_explain_answer_important_32)
        )
    )
    listImportant33 = mutableListOf(
        Answer(
            107, context.getString(R.string.answer_important_33_1), true, 33,
            context.getString(R.string.text_explain_answer_important_33)
        ),
        Answer(108, context.getString(R.string.answer_important_33_2), false, 33)
    )
    listImportant34 = mutableListOf(
        Answer(
            109, context.getString(R.string.answer_important_34_1), true, 34,
            context.getString(R.string.text_explain_answer_important_34)
        ),
        Answer(110, context.getString(R.string.answer_important_34_2), false, 34),
        Answer(111, context.getString(R.string.answer_important_34_3), false, 34)
    )
    listImportant35 = mutableListOf(
        Answer(112, context.getString(R.string.answer_important_35_1), false, 35),
        Answer(
            113, context.getString(R.string.answer_important_35_2), true, 36,
            context.getString(R.string.text_explain_answer_important_35)
        ),
        Answer(114, context.getString(R.string.answer_important_35_3), false, 35)
    )
    listAnswerImportant = mutableListOf(
        listImportant1, listImportant2, listImportant3, listImportant4, listImportant5,
        listImportant6, listImportant7, listImportant8, listImportant9, listImportant10,
        listImportant11, listImportant12, listImportant13, listImportant14, listImportant15,
        listImportant16, listImportant17, listImportant18, listImportant19, listImportant20,
        listImportant21, listImportant22, listImportant23, listImportant24, listImportant25,
        listImportant26, listImportant27, listImportant28, listImportant29, listImportant30,
        listImportant31, listImportant32, listImportant33, listImportant34, listImportant35
    )

    /**29 câu khái niệm và quy tắc 41 -> 70*/
    listConceptAndRule1 = mutableListOf(
        Answer(1, context.getString(R.string.answer_concepts_and_rules_1_1), false, 41),
        Answer(
            2, context.getString(R.string.answer_concepts_and_rules_1_2), true, 41,
            answerExplain = context.getString(R.string.text_explain_answer_concept_and_rule_1)
        ),
        Answer(
            3, context.getString(R.string.answer_concepts_and_rules_1_3), false,
            41,
        )
    )
    listConceptAndRule2 = mutableListOf(
        Answer(4, context.getString(R.string.answer_concepts_and_rules_2_1), false, 42),
        Answer(
            5, context.getString(R.string.answer_concepts_and_rules_2_2), true, 42,
            answerExplain = context.getString(R.string.text_explain_answer_concept_and_rule_2)
        ),
        Answer(6, context.getString(R.string.answer_concepts_and_rules_2_3), false, 42)
    )
    listConceptAndRule3 = mutableListOf(
        Answer(7, context.getString(R.string.answer_concepts_and_rules_3_1), false, 43),
        Answer(
            8, context.getString(R.string.answer_concepts_and_rules_3_2), false, 43
        ),
        Answer(
            9, context.getString(R.string.answer_concepts_and_rules_3_3), true, 43,
            answerExplain = context.getString(R.string.text_explain_answer_concept_and_rule_3)
        )
    )
    listConceptAndRule4 = mutableListOf(
        Answer(
            10, context.getString(R.string.answer_concepts_and_rules_4_1), true, 44,
            answerExplain = context.getString(R.string.text_explain_answer_concept_and_rule_4)
        ),
        Answer(
            11, context.getString(R.string.answer_concepts_and_rules_4_2), false, 44
        ),
        Answer(12, context.getString(R.string.answer_concepts_and_rules_4_3), false, 44)
    )
    listConceptAndRule5 = mutableListOf(
        Answer(
            13, context.getString(R.string.answer_concepts_and_rules_5_1), true, 45,
            answerExplain = context.getString(R.string.text_explain_answer_concept_and_rule_5)
        ),
        Answer(
            14, context.getString(R.string.answer_concepts_and_rules_5_2), false, 45
        ),
        Answer(15, context.getString(R.string.answer_concepts_and_rules_5_3), false, 45)
    )
    listConceptAndRule6 = mutableListOf(
        Answer(16, context.getString(R.string.answer_concepts_and_rules_6_1), false, 46),
        Answer(17, context.getString(R.string.answer_concepts_and_rules_6_2), false, 46),
        Answer(18, context.getString(R.string.answer_concepts_and_rules_6_3), false, 46),
        Answer(
            19, context.getString(R.string.answer_concepts_and_rules_6_4), true, 46,
            answerExplain = context.getString(R.string.text_explain_answer_concept_and_rule_6)
        )
    )
    listConceptAndRule7 = mutableListOf(
        Answer(20, context.getString(R.string.answer_concepts_and_rules_7_1), false, 47),
        Answer(
            21, context.getString(R.string.answer_concepts_and_rules_7_2), true, 47,
            answerExplain = context.getString(R.string.text_explain_answer_concept_and_rule_7)
        )
    )
    listConceptAndRule8 = mutableListOf(
        Answer(
            22, context.getString(R.string.answer_concepts_and_rules_8_1), true, 48,
            answerExplain = context.getString(R.string.text_explain_answer_concept_and_rule_8)
        ),
        Answer(23, context.getString(R.string.answer_concepts_and_rules_8_2), false, 48),
        Answer(24, context.getString(R.string.answer_concepts_and_rules_8_3), false, 48)
    )
    listConceptAndRule9 = mutableListOf(
        Answer(25, context.getString(R.string.answer_concepts_and_rules_9_1), false, 49),
        Answer(26, context.getString(R.string.answer_concepts_and_rules_9_2), false, 49),
        Answer(
            27, context.getString(R.string.answer_concepts_and_rules_9_3), true, 49,
            answerExplain = context.getString(R.string.text_explain_answer_concept_and_rule_9)
        )
    )
    listConceptAndRule10 = mutableListOf(
        Answer(28, context.getString(R.string.answer_concepts_and_rules_10_1), false, 50),
        Answer(29, context.getString(R.string.answer_concepts_and_rules_10_2), false, 50),
        Answer(
            30, context.getString(R.string.answer_concepts_and_rules_10_3), true, 50,
            answerExplain = context.getString(R.string.text_explain_answer_concept_and_rule_10)
        )
    )
    listConceptAndRule11 = mutableListOf(
        Answer(31, context.getString(R.string.answer_concepts_and_rules_11_1), false, 51),
        Answer(32, context.getString(R.string.answer_concepts_and_rules_11_2), false, 51),
        Answer(
            33, context.getString(R.string.answer_concepts_and_rules_11_3), true, 51,
            answerExplain = context.getString(R.string.text_explain_answer_concept_and_rule_11)
        )
    )
    listConceptAndRule12 = mutableListOf(
        Answer(34, context.getString(R.string.answer_concepts_and_rules_12_1), false, 52),
        Answer(
            35, context.getString(R.string.answer_concepts_and_rules_12_2), true, 52,
            answerExplain = context.getString(R.string.text_explain_answer_concept_and_rule_12)
        ),
        Answer(36, context.getString(R.string.answer_concepts_and_rules_12_3), false, 52)
    )
    listConceptAndRule13 = mutableListOf(
        Answer(37, context.getString(R.string.answer_concepts_and_rules_13_1), false, 53),
        Answer(
            38, context.getString(R.string.answer_concepts_and_rules_13_2), true, 53,
            answerExplain = context.getString(R.string.text_explain_answer_concept_and_rule_13)
        ),
        Answer(39, context.getString(R.string.answer_concepts_and_rules_13_3), false, 53)
    )
    listConceptAndRule14 = mutableListOf(
        Answer(40, context.getString(R.string.answer_concepts_and_rules_14_1), false, 54),
        Answer(
            41, context.getString(R.string.answer_concepts_and_rules_14_2), true, 54,
            answerExplain = context.getString(R.string.text_explain_answer_concept_and_rule_14)
        )
    )
    //important 3
    listConceptAndRule15 = mutableListOf(
        Answer(42, context.getString(R.string.answer_important_3_1), false, 55),
        Answer(43, context.getString(R.string.answer_important_3_2), false, 55),
        Answer(
            44, context.getString(R.string.answer_important_3_3), true, 55,
            answerExplain = context.getString(R.string.text_explain_answer_important_3)
        )
    )
    //important 4
    listConceptAndRule16 = mutableListOf(
        Answer(
            45, context.getString(R.string.answer_important_4_1), true, 56,
            answerExplain = context.getString(R.string.text_explain_answer_important_4)
        ),
        Answer(46, context.getString(R.string.answer_important_4_2), false, 56),
        Answer(47, context.getString(R.string.answer_important_4_3), false, 56)
    )
    //important 7
    listConceptAndRule17 = mutableListOf(
        Answer(48, context.getString(R.string.answer_important_7_1), false, 57),
        Answer(
            49, context.getString(R.string.answer_important_7_2), true, 57,
            answerExplain = context.getString(R.string.text_explain_answer_important_7)
        ),
        Answer(50, context.getString(R.string.answer_important_7_3), false, 57)
    )
    //important 8
    listConceptAndRule18 = mutableListOf(
        Answer(
            51, context.getString(R.string.answer_important_8_1), true, 58,
            answerExplain = context.getString(R.string.text_explain_answer_important_8)
        ),
        Answer(52, context.getString(R.string.answer_important_8_2), false, 58),
        Answer(53, context.getString(R.string.answer_important_8_3), false, 58),
        Answer(54, context.getString(R.string.answer_important_8_4), false, 58)
    )
    //important 10
    listConceptAndRule19 = mutableListOf(
        Answer(
            55, context.getString(R.string.answer_important_10_1), false, 59,
        ),
        Answer(56, context.getString(R.string.answer_important_10_2), false, 59),
        Answer(
            57, context.getString(R.string.answer_important_10_3), true, 59,
            answerExplain = context.getString(R.string.text_explain_answer_important_10)
        )
    )
    //important 18
    listConceptAndRule20 = mutableListOf(
        Answer(58, context.getString(R.string.answer_important_18_1), false, 60),
        Answer(
            59, context.getString(R.string.answer_important_18_2), true, 60,
            answerExplain = context.getString(R.string.text_explain_answer_important_18)
        ),
        Answer(60, context.getString(R.string.answer_important_18_3), false, 60)
    )
    //important 21
    listConceptAndRule21 = mutableListOf(
        Answer(61, context.getString(R.string.answer_important_21_1), false, 61),
        Answer(62, context.getString(R.string.answer_important_21_2), false, 61),
        Answer(63, context.getString(R.string.answer_important_21_3), false, 61),
        Answer(
            64, context.getString(R.string.answer_important_21_4), true, 61,
            answerExplain = context.getString(R.string.text_explain_answer_important_21)
        )
    )
    //important 22
    listConceptAndRule22 = mutableListOf(
        Answer(65, context.getString(R.string.answer_important_22_1), false, 62),
        Answer(66, context.getString(R.string.answer_important_22_2), false, 62),
        Answer(
            67, context.getString(R.string.answer_important_22_3), true, 62,
            answerExplain = context.getString(R.string.text_explain_answer_important_22)
        )
    )
    //important 23
    listConceptAndRule23 = mutableListOf(
        Answer(
            68, context.getString(R.string.answer_important_23_1), true, 63,
            answerExplain = context.getString(R.string.text_explain_answer_important_23)
        ),
        Answer(69, context.getString(R.string.answer_important_23_2), false, 63),
        Answer(70, context.getString(R.string.answer_important_23_3), false, 63),
        Answer(71, context.getString(R.string.answer_important_23_4), false, 63)
    )
    //important 24
    listConceptAndRule24 = mutableListOf(
        Answer(72, context.getString(R.string.answer_important_24_1), false, 64),
        Answer(
            73, context.getString(R.string.answer_important_24_2), true, 64,
            answerExplain = context.getString(R.string.text_explain_answer_important_24)
        ),
        Answer(74, context.getString(R.string.answer_important_24_3), false, 64),
        Answer(75, context.getString(R.string.answer_important_24_4), false, 64)
    )
    //important 25
    listConceptAndRule25 = mutableListOf(
        Answer(76, context.getString(R.string.answer_important_25_1), false, 65),
        Answer(77, context.getString(R.string.answer_important_25_2), false, 65),
        Answer(78, context.getString(R.string.answer_important_25_3), false, 65),
        Answer(
            79, context.getString(R.string.answer_important_25_4), true, 65,
            answerExplain = context.getString(R.string.text_explain_answer_important_25)
        )
    )
    //important 26
    listConceptAndRule26 = mutableListOf(
        Answer(80, context.getString(R.string.answer_important_26_1), false, 66),
        Answer(81, context.getString(R.string.answer_important_26_2), false, 66),
        Answer(
            82, context.getString(R.string.answer_important_26_3), true, 66,
            answerExplain = context.getString(R.string.text_explain_answer_important_26)
        ),
        Answer(83, context.getString(R.string.answer_important_26_4), false, 66)
    )
    //important 27
    listConceptAndRule27 = mutableListOf(
        Answer(84, context.getString(R.string.answer_important_27_1), false, 67),
        Answer(
            85, context.getString(R.string.answer_important_27_2), true, 67,
            answerExplain = context.getString(R.string.text_explain_answer_important_27)
        ),
        Answer(86, context.getString(R.string.answer_important_27_3), false, 67),
        Answer(87, context.getString(R.string.answer_important_27_4), false, 67)
    )
    //important 28
    listConceptAndRule28 = mutableListOf(
        Answer(88, context.getString(R.string.answer_important_28_1), false, 68),
        Answer(
            89, context.getString(R.string.answer_important_28_2), false, 68,
        ),
        Answer(
            90, context.getString(R.string.answer_important_28_3), true, 68,
            answerExplain = context.getString(R.string.text_explain_answer_important_28)
        )
    )
    //important 29
    listConceptAndRule29 = mutableListOf(
        Answer(
            91, context.getString(R.string.answer_important_29_1), true, 69,
            answerExplain = context.getString(R.string.text_explain_answer_important_29)
        ),
        Answer(92, context.getString(R.string.answer_important_29_2), false, 69),
        Answer(93, context.getString(R.string.answer_important_29_3), false, 69)
    )
    //important 34
    listConceptAndRule30 = mutableListOf(
        Answer(
            94, context.getString(R.string.answer_important_34_1), true, 70,
            answerExplain = context.getString(R.string.text_explain_answer_important_34)
        ),
        Answer(95, context.getString(R.string.answer_important_34_2), false, 70),
        Answer(96, context.getString(R.string.answer_important_34_3), false, 70)
    )

    listAnswerConceptAndRule = mutableListOf(
        listConceptAndRule1, listConceptAndRule2, listConceptAndRule3, listConceptAndRule4,
        listConceptAndRule5, listConceptAndRule6, listConceptAndRule7, listConceptAndRule8,
        listConceptAndRule9, listConceptAndRule10, listConceptAndRule11, listConceptAndRule12,
        listConceptAndRule13, listConceptAndRule14, listConceptAndRule15, listConceptAndRule16,
        listConceptAndRule17, listConceptAndRule18, listConceptAndRule19, listConceptAndRule20,
        listConceptAndRule21, listConceptAndRule22, listConceptAndRule23, listConceptAndRule24,
        listConceptAndRule25, listConceptAndRule26, listConceptAndRule27, listConceptAndRule28,
        listConceptAndRule29, listConceptAndRule30
    )

    /**Văn hóa và đạo đức lái xe 81 - 85*/

    listCultureAndEthic1 = mutableListOf(
        Answer(1, context.getString(R.string.answer_culture_and_ethics_1_1), false, 81),
        Answer(
            2, context.getString(R.string.answer_culture_and_ethics_1_2), false, 81
        ),
        Answer(
            3, context.getString(R.string.answer_culture_and_ethics_1_3), true,
            1, answerExplain = context.getString(R.string.text_explain_answer_culture_and_ethic_1)
        ),
    )
    listCultureAndEthic2 = mutableListOf(
        Answer(
            4, context.getString(R.string.answer_culture_and_ethics_2_1), true,
            82,
            answerExplain = context.getString(R.string.text_explain_answer_culture_and_ethic_2)
        ),
        Answer(5, context.getString(R.string.answer_culture_and_ethics_2_2), false, 82),
        Answer(6, context.getString(R.string.answer_culture_and_ethics_2_3), false, 82)
    )
    listCultureAndEthic3 = mutableListOf(
        Answer(
            7, context.getString(R.string.answer_culture_and_ethics_3_1), true,
            83,
            answerExplain = context.getString(R.string.text_explain_answer_culture_and_ethic_3)
        ),
        Answer(8, context.getString(R.string.answer_culture_and_ethics_3_2), false, 83),
        Answer(9, context.getString(R.string.answer_culture_and_ethics_3_3), false, 83)
    )
    listCultureAndEthic4 = mutableListOf(
        Answer(
            10, context.getString(R.string.answer_culture_and_ethics_4_1), true,
            84,
            answerExplain = context.getString(R.string.text_explain_answer_culture_and_ethic_4)
        ),
        Answer(11, context.getString(R.string.answer_culture_and_ethics_4_2), false, 84),
        Answer(12, context.getString(R.string.answer_culture_and_ethics_4_3), false, 84)
    )
    listCultureAndEthic5 = mutableListOf(
        Answer(
            13, context.getString(R.string.answer_culture_and_ethics_5_1), false, 85
        ),
        Answer(14, context.getString(R.string.answer_culture_and_ethics_5_2), false, 85),
        Answer(15, context.getString(R.string.answer_culture_and_ethics_5_3), false, 85),
        Answer(
            16, context.getString(R.string.answer_culture_and_ethics_5_3), true, 85,
            answerExplain = context.getString(R.string.text_explain_answer_culture_and_ethic_5)
        )
    )

    listAnswerCultureAndEthic = mutableListOf(
        listCultureAndEthic1, listCultureAndEthic2, listCultureAndEthic3, listCultureAndEthic4,
        listCultureAndEthic5
    )

    /**Kỹ thuật lái xe 91 -> 102*/
    listDrivingUnique1 = mutableListOf(
        Answer(
            1, context.getString(R.string.answer_driving_unique_1_1), true, 91,
            context.getString(R.string.text_explain_answer_driving_unique_1)
        ),
        Answer(2, context.getString(R.string.answer_driving_unique_1_2), false, 91)
    )
    listDrivingUnique2 = mutableListOf(
        Answer(
            3, context.getString(R.string.answer_driving_unique_2_1), false, 92,
        ),
        Answer(4, context.getString(R.string.answer_driving_unique_2_2), false, 92),
        Answer(5, context.getString(R.string.answer_driving_unique_2_3), false, 92),
        Answer(
            6, context.getString(R.string.answer_driving_unique_2_4), true, 92,
            context.getString(R.string.text_explain_answer_driving_unique_2)
        )
    )
    listDrivingUnique3 = mutableListOf(
        Answer(
            7, context.getString(R.string.answer_driving_unique_3_1), true, 93,
            context.getString(R.string.text_explain_answer_driving_unique_3)
        ),
        Answer(8, context.getString(R.string.answer_driving_unique_3_2), false, 93)
    )
    listDrivingUnique4 = mutableListOf(
        Answer(
            9, context.getString(R.string.answer_driving_unique_4_1),
            false, 94
        ),
        Answer(10, context.getString(R.string.answer_driving_unique_4_2), false, 94),
        Answer(
            11, context.getString(R.string.answer_driving_unique_4_3), true, 94,
            context.getString(R.string.text_explain_answer_driving_unique_4)
        )
    )
    listDrivingUnique5 = mutableListOf(
        Answer(
            12, context.getString(R.string.answer_driving_unique_5_1),
            false, 95
        ),
        Answer(13, context.getString(R.string.answer_driving_unique_5_2), false, 95),
        Answer(
            14, context.getString(R.string.answer_driving_unique_5_3), true, 95,
            context.getString(R.string.text_explain_answer_driving_unique_5)
        )
    )
    listDrivingUnique6 = mutableListOf(
        Answer(
            15, context.getString(R.string.answer_driving_unique_6_1), false, 96,
        ),
        Answer(16, context.getString(R.string.answer_driving_unique_6_2), false, 96),
        Answer(17, context.getString(R.string.answer_driving_unique_6_3), false, 96),
        Answer(
            18, context.getString(R.string.answer_driving_unique_6_4), true, 96,
            context.getString(R.string.text_explain_answer_driving_unique_6)
        )
    )
    listDrivingUnique7 = mutableListOf(
        Answer(
            19, context.getString(R.string.answer_driving_unique_7_1), false, 97,
        ),
        Answer(20, context.getString(R.string.answer_driving_unique_7_2), false, 97),
        Answer(21, context.getString(R.string.answer_driving_unique_7_3), false, 97),
        Answer(
            22, context.getString(R.string.answer_driving_unique_7_4), true, 97,
            context.getString(R.string.text_explain_answer_driving_unique_7)
        )
    )
    listDrivingUnique8 = mutableListOf(
        Answer(
            19, context.getString(R.string.answer_driving_unique_8_1), false, 98,
        ),
        Answer(20, context.getString(R.string.answer_driving_unique_8_2), false, 98),
        Answer(
            21, context.getString(R.string.answer_driving_unique_8_3), true, 98,
            context.getString(R.string.text_explain_answer_driving_unique_8)
        ),
        Answer(
            22, context.getString(R.string.answer_driving_unique_8_4), false, 98
        )
    )

    listDrivingUnique9 = mutableListOf(
        Answer(
            23, context.getString(R.string.answer_driving_unique_9_1), false, 99,
        ),
        Answer(24, context.getString(R.string.answer_driving_unique_9_2), false, 99),
        Answer(
            25, context.getString(R.string.answer_driving_unique_9_3), true, 99,
            context.getString(R.string.text_explain_answer_driving_unique_9)
        ),
        Answer(
            26, context.getString(R.string.answer_driving_unique_9_4), false, 99
        )
    )
    listDrivingUnique10 = mutableListOf(
        Answer(
            27, context.getString(R.string.answer_driving_unique_10_1),
            false, 100
        ),
        Answer(28, context.getString(R.string.answer_driving_unique_10_2), false, 100),
        Answer(
            29, context.getString(R.string.answer_driving_unique_10_3), true, 100,
            context.getString(R.string.text_explain_answer_driving_unique_10)
        )
    )
    //important 34
    listDrivingUnique11 = mutableListOf(
        Answer(
            30, context.getString(R.string.answer_important_34_1), true, 101,
            answerExplain = context.getString(R.string.text_explain_answer_important_34)
        ),
        Answer(31, context.getString(R.string.answer_important_34_2), false, 101),
        Answer(32, context.getString(R.string.answer_important_34_3), false, 101)
    )
    //important 35
    listDrivingUnique12 = mutableListOf(
        Answer(33, context.getString(R.string.answer_important_35_1), false, 102),
        Answer(
            34, context.getString(R.string.answer_important_35_2), true, 102,
            answerExplain = context.getString(R.string.text_explain_answer_important_35)
        ),
        Answer(35, context.getString(R.string.answer_important_35_3), false, 102)
    )

    listAnswerDrivingUnique = mutableListOf(
        listDrivingUnique1, listDrivingUnique2, listDrivingUnique3, listDrivingUnique4,
        listDrivingUnique5, listDrivingUnique6, listDrivingUnique7, listDrivingUnique8,
        listDrivingUnique9, listDrivingUnique10, listDrivingUnique11, listDrivingUnique12
    )
}

/**Khái niệm và quy tắc 41 -> 70*/ //29
var listAnswerConceptAndRule = mutableListOf<MutableList<Answer>>()
var listConceptAndRule1 = mutableListOf<Answer>()
var listConceptAndRule2 = mutableListOf<Answer>()
var listConceptAndRule3 = mutableListOf<Answer>()
var listConceptAndRule4 = mutableListOf<Answer>()
var listConceptAndRule5 = mutableListOf<Answer>()
var listConceptAndRule6 = mutableListOf<Answer>()
var listConceptAndRule7 = mutableListOf<Answer>()
var listConceptAndRule8 = mutableListOf<Answer>()
var listConceptAndRule9 = mutableListOf<Answer>()
var listConceptAndRule10 = mutableListOf<Answer>()
var listConceptAndRule11 = mutableListOf<Answer>()
var listConceptAndRule12 = mutableListOf<Answer>()
var listConceptAndRule13 = mutableListOf<Answer>()
var listConceptAndRule14 = mutableListOf<Answer>()
var listConceptAndRule15 = mutableListOf<Answer>()
var listConceptAndRule16 = mutableListOf<Answer>()
var listConceptAndRule17 = mutableListOf<Answer>()
var listConceptAndRule18 = mutableListOf<Answer>()
var listConceptAndRule19 = mutableListOf<Answer>()
var listConceptAndRule20 = mutableListOf<Answer>()
var listConceptAndRule21 = mutableListOf<Answer>()
var listConceptAndRule22 = mutableListOf<Answer>()
var listConceptAndRule23 = mutableListOf<Answer>()
var listConceptAndRule24 = mutableListOf<Answer>()
var listConceptAndRule25 = mutableListOf<Answer>()
var listConceptAndRule26 = mutableListOf<Answer>()
var listConceptAndRule27 = mutableListOf<Answer>()
var listConceptAndRule28 = mutableListOf<Answer>()
var listConceptAndRule29 = mutableListOf<Answer>()
var listConceptAndRule30 = mutableListOf<Answer>()

/**Văn hóa và đạo đức lái xe 81 -> 85*/ //5 answer_culture_and_ethics_1_1
var listAnswerCultureAndEthic = mutableListOf<MutableList<Answer>>()
var listCultureAndEthic1 = mutableListOf<Answer>()
var listCultureAndEthic2 = mutableListOf<Answer>()
var listCultureAndEthic3 = mutableListOf<Answer>()
var listCultureAndEthic4 = mutableListOf<Answer>()
var listCultureAndEthic5 = mutableListOf<Answer>()

/**Kỹ thuật lái xe 91 -> 102*/ //12

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

