package com.imsisojib.bdjobscodingtest.api

import com.imsisojib.bdjobscodingtest.beans.ResponseData
import retrofit2.Call
import retrofit2.http.GET

interface ApiMethods {

    @GET(ApiEndPoints.GET_INTERVIEW_JSON)
    fun getJobJsonData() : Call<ResponseData>
}