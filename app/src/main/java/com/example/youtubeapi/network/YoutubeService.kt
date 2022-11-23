package com.example.youtubeapi.network

import com.example.youtubeapi.model.YoutubeModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface YoutubeService {
    @GET("search")
    fun getAllData(
        @Query("key") key: String = "AIzaSyDx_LXaImPNKzEtM07MO2J5BzQwHn3n-II", // apiKey
        @Query("channelId") channelId: String = "UCZHmokDNJIEDs-3zEpYsrvA", // channel ID
        @Query("order") order: String = "date",
        @Query("maxResult") maxResults: String = "20",
        @Query("part") part: String = "snippet,id"
    ): Call<YoutubeModel>
}