package com.example.youtubeapi.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Id(
    val kind: String,
    val videoId: String
): Parcelable