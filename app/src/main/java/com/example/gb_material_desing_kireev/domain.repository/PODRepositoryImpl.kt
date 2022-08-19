package com.example.gb_material_desing_kireev.domain.repository

import android.telecom.Call
import com.example.gb_material_desing_kireev.data.api.RetrofitClient
import com.example.gbmaterialdesign.data.model.PODServerResponseData
import retrofit2.Call

class PODRepositoryImpl : PODRepository {
    private val retrofit = RetrofitClient()

    override fun getPOD(): Call<PODServerResponseData> {
        return retrofit.getClient().getPictureOfTheDay()
    }

}
