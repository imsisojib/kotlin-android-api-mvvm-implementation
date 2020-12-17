package com.imsisojib.bdjobscodingtest.beans


import com.google.gson.annotations.SerializedName

class Data {
    @SerializedName("deadline")
    private var deadline: String = ""

    @SerializedName("IsFeatured")
    private var isFeatured: Boolean = false

    @SerializedName("jobDetails")
    private var jobDetails: JobDetails = JobDetails()

    @SerializedName("jobTitle")
    private var jobTitle: String = ""

    @SerializedName("logo")
    private var logo: String = ""

    @SerializedName("maxExperience")
    private var maxExperience: Int? = 0

    @SerializedName("maxSalary")
    private var maxSalary: String = ""

    @SerializedName("minExperience")
    private var minExperience: Int? = 0

    @SerializedName("minSalary")
    private var minSalary: String = ""

    @SerializedName("recruitingCompany'sProfile")
    private var companyProfile: String = ""

    fun getDeadLine(): String?{
        return deadline;
    }

    fun isFeatured(): Boolean?{
        return isFeatured;
    }

    fun getJobDetails(): JobDetails?{
        return jobDetails;
    }

    fun getJobTittle(): String?{
        return jobTitle;
    }

    fun getLogo(): String?{
        return logo;
    }

    fun getMaxExperience(): Int?{
        return maxExperience;
    }

    fun getMinExperience(): Int?{
        return minExperience;
    }

    fun getMaxSalary(): String?{
        return maxSalary;
    }

    fun getMinSalary(): String?{
        return minSalary;
    }

    fun getCompanyProfile(): String?{
        return companyProfile;
    }

}