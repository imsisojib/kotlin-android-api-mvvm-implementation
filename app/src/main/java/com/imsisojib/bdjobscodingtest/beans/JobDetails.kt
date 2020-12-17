package com.imsisojib.bdjobscodingtest.beans


import com.google.gson.annotations.SerializedName

class JobDetails {
    @SerializedName("ApplyInstruction")
    private var applyInstruction: String = ""

    @SerializedName("CompanyName")
    private var companyName: String = ""

    @SerializedName("LastDate")
    private var lastDate: String = ""

    @SerializedName("Title")
    private var title: String = ""

    fun getApplyInstruction(): String?{
        return applyInstruction;
    }

    fun getCompanyName(): String?{
        return companyName;
    }

    fun getLastDate(): String?{
        return lastDate;
    }

    fun getTittle(): String?{
        return title;
    }

}