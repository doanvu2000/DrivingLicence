package com.example.drivinglicense.app.entity

data class Answer(
    val answerId: Int,
    val answerContent: String,
    val isCorrect: Boolean,
    val questionId: Int,
    val answerExplain: String? = null,
    var flag: Int? = 1
)
