package com.example.myapirit.api

import com.example.myapirit.datamodel.StudentRespond
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MyRestApi {

    companion object{
        val BASE_URL:String = "http://demo.onmyfinger.com/"
    }

    @GET("home/getById")
    fun getById(@Query("id") id:String) : Call<StudentRespond>

}