package com.example.drivinglicence.app.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Demo(
    val id: Int,
    val name: String
) : Parcelable