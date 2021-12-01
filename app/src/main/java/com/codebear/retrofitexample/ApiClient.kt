package com.codebear.retrofitexample

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

object ApiClient {
    private val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("https://raw.githubusercontent.com/icei2021/Fake-Jsons/master/")
        .build()

    val service = retrofit.create(Service::class.java)
}

interface Service {
    @GET("jsonExample.json")
    fun getData(): Call<ResponseModel>
}