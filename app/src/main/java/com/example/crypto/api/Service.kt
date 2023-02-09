package com.example.crypto.api

import com.example.crypto.pojo.CoinInfoListOfData
import com.example.crypto.pojo.CoinPriceRAW
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface Service {
    @GET("top/totalvolfull")
    suspend fun getTopCoinsInfo(
        @Query(QUERY_PARAM_LIM