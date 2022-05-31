package com.example.veganhouse.service

import com.example.veganhouse.model.RestockNotification
import retrofit2.Retrofit
import retrofit2.Call
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

interface EventManagerRestockService {


    @POST("restock-subscribe")
    fun createSubscription(@Body restockNotification: RestockNotification): Call<RestockNotification>

    companion object {

        var BASE_URL = "https://veganhouseback.ddns.net/"

        fun getInstance() : EventManagerRestockService {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(EventManagerRestockService::class.java)
        }
    }
}