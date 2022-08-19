package com.example.gb_material_desing_kireev.domain.repository

import android.telecom.Call
import com.example.gbmaterialdesign.data.model.PODServerResponseData
import retrofit2.Call

interface PODRepository {
    fun getPOD(): Call<PODServerResponseData>
}
