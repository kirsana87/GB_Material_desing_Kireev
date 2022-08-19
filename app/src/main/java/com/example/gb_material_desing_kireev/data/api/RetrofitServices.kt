package com.example.gb_material_desing_kireev.data.api

import android.telecom.Call
import com.example.gbmaterialdesign.data.model.PODServerResponseData


interface RetrofitServices {
    @GET("planetary/apod")
    fun getPictureOfTheDay(): Call<PODServerResponseData>
}
