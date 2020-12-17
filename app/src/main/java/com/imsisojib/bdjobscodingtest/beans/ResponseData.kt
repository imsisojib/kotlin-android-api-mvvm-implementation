package com.imsisojib.bdjobscodingtest.beans


import com.google.gson.annotations.SerializedName

class ResponseData{
    @SerializedName("common")
    private var common: Common = Common()
    @SerializedName("data")
    private var data: List<Data> = listOf()
    @SerializedName("message")
    private var message: String = ""
    @SerializedName("statuscode")
    private var statuscode: String = ""

    fun getCommon(): Common?{
        return common;
    }

    fun getData(): List<Data>?{
        return data;
    }

    fun getMessage(): String?{
        return message;
    }

    fun getStatusCode(): String?{
        return statuscode;
    }

}