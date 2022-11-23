package com.example.youtubeapi.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Thumbnails(
    val default: Default
): Parcelable