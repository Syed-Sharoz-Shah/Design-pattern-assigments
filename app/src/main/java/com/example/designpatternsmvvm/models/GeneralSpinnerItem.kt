package com.example.designpatternsmvvm

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GeneralSpinnerItem(
    val id: Int,
    val name: String
) : Parcelable {

    override fun toString(): String {
        return name
    }

}