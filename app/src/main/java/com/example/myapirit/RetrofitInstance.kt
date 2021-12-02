package com.example.myapirit

import com.example.myapirit.api.MyRestApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private val retorfit by lazy {
        Retrofit.Builder()
            .baseUrl(MyRestApi.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: MyRestApi by lazy {
        retorfit.create(MyRestApi::class.java)
    }
}