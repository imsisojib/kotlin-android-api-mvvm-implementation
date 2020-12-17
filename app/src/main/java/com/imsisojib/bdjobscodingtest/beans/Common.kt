package com.imsisojib.bdjobscodingtest.beans


import com.google.gson.annotations.SerializedName

class Common{
    @SerializedName("total_records_found")
    private var totalRecordsFound: Int? = 0
    @SerializedName("totalpages")
    private var totalpages: Int? = 0

    fun getTotalRecordsFound(): Int?{
        return totalRecordsFound;
    }

    fun getTotalPages(): Int?{
        return totalpages;
    }
}