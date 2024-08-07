package com.example.musicapplication

import android.telecom.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiInterface {
/*
    @Headers("x-rapidapi-key : b618274971msh0b0b9c92966098bp11580bjsn52e584025104",
    "x-rapidapi-host :deezerdevs-deezer.p.rapidapi.com")
    @GET("search")
    fun getData(@Query("q")query: String): retrofit2.Call<MyData>

 */

    @Headers(
        "x-rapidapi-key: b618274971msh0b0b9c92966098bp11580bjsn52e584025104",
        "x-rapidapi-host: deezerdevs-deezer.p.rapidapi.com"
    )
    @GET("search")
    fun getData(@Query("q") query: String): retrofit2.Call<MyData>
}