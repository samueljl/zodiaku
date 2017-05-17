package com.zodiaku.rest;

import com.zodiaku.models.Zodiak;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface ApiInterface {

    @GET("zodiak")
    Call<Zodiak> getZodiak(@Query("nama") String nama, @Query("tgl") String tgl);
}
