package com.example.lab8mysql_queryinsert


import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface StudentAPI {
    @GET("allstd")
    fun retrieveStudent(): Call<List<Student>>

    @FormUrlEncoded
    @POST("std")
    fun  insertStd(
        @Field("Std_id") std_id :String,
        @Field("Std_name") std_name :String,
        @Field("Std_age") std_age :Int

    ):Call<Student>

}