package com.imsisojib.bdjobscodingtest.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.imsisojib.bdjobscodingtest.api.Api
import com.imsisojib.bdjobscodingtest.beans.ResponseData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.Exception

class JobDataViewModel : ViewModel() {

private lateinit var jobsMutualLiveData : MutableLiveData<ResponseData>

     fun getJobData() : LiveData<ResponseData>{

        jobsMutualLiveData = MutableLiveData()

        Api.getInstance().getJobJsonData().enqueue(object : Callback<ResponseData>{

            override fun onResponse(call: Call<ResponseData>, response: Response<ResponseData>) {
                try {
                    jobsMutualLiveData.postValue(response.body())
                }catch (e: Exception){
                    Log.d("LOG_DASHBOARD", "onResponse: persisting error.")
                }
            }

            override fun onFailure(call: Call<ResponseData>, t: Throwable) {
                Log.d("LOG_DASHBOARD", "onFailure: api response error.")
            }
        })

        return jobsMutualLiveData
    }
}