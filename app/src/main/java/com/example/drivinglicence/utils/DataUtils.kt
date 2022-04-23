package com.example.drivinglicense.utils

import android.content.Context
import android.content.res.Resources
import com.example.drivinglicense.R
import com.example.drivinglicense.app.entity.Answer
import com.example.drivinglicense.app.entity.Question

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

var listAnswer = mutableListOf<MutableList<Answer>>()
var list1 = mutableListOf<Answer>()
var list2 = mutableListOf<Answer>()
var list3 = mutableListOf<Answer>()
var list4 = mutableListOf<Answer>()
fun initList(context: Context) {
    list1 = mutableListOf(
        Answer(1, context.getString(R.string.answer_important_1_1), false, 1),
        Answer(2, context.getString(R.string.answer_important_1_2), false, 1),
        Answer(
            3, context.getString(R.string.answer_important_1_3), true,
            1, context.getString(R.string.text_explain_answer_1)
        ),
        Answer(4, context.getString(R.string.answer_important_1_4), false, 1)
    )
    list2 = mutableListOf(
        Answer(1, context.getString(R.string.answer_important_2_1), false, 2),
        Answer(
            2,
            answerContent = context.getString(R.string.answer_important_2_2),
            true,
            2,
            answerExplain = context.getString(R.string.text_explain_answer_2)
        ),
        Answer(3, context.getString(R.string.answer_important_2_3), false, 2),
        Answer(4, context.getString(R.string.answer_important_2_4), false, 2)
    )

    list3 = mutableListOf(
        Answer(1, context.getString(R.string.answer_important_1_1), false, 1),
        Answer(2, context.getString(R.string.answer_important_1_2), false, 1),
        Answer(
            3, context.getString(R.string.answer_important_1_3), true,
            1, context.getString(R.string.text_explain_answer_3)
        ),
    )
    listAnswer = mutableListOf(list1, list2, list3)
}

/**Khái niệm và quy tắc*/ //83

/**Văn hóa và đạo đức lái xe*/ //5

/**Kỹ thuật lái xe*/ //12

/**Biển báo đường bộ*/ //65

/**Sa hình*/ //35