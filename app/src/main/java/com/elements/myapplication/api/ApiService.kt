package com.elements.myapplication.api


import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("weather")
    fun getWeatherDetail(): Call<ResponseBody>

}