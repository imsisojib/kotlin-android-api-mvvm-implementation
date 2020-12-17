package com.imsisojib.bdjobscodingtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.imsisojib.bdjobscodingtest.adapters.JobsAdapter
import com.imsisojib.bdjobscodingtest.beans.Data
import com.imsisojib.bdjobscodingtest.beans.ResponseData
import com.imsisojib.bdjobscodingtest.viewmodels.JobDataViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: JobDataViewModel
    private lateinit var adapter: JobsAdapter
    private var jobs = mutableListOf<Data>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        adapter = JobsAdapter(jobs)
        recyclerview.layoutManager = LinearLayoutManager(this);
        recyclerview.adapter = adapter

        viewModel = ViewModelProviders.of(this).get(JobDataViewModel::class.java)

    }

    override fun onResume() {
        super.onResume()

       /* jobs.clear();
        for (i: Int in 1..15) {
            var data: Data = Data();
            jobs.add(data);
        }*/

        getJobData();

    }

    private fun getJobData() {

        viewModel.getJobData().observe(this, object : Observer<ResponseData> {

            override fun onChanged(responseData: ResponseData?) {

                jobs.clear()
                if (responseData != null) {

                    for (data in responseData.getData()!!){
                        jobs.add(data)
                    }
                    adapter.notifyDataSetChanged()

                    Log.d("LOG_DASHBOARD", "observer: msg:"+responseData.getMessage()+" response code: "+responseData.getStatusCode())
                    Log.d("LOG_DASHBOARD", "list size: "+ responseData.getData()!!.size)
                }

                progressbar.visibility = View.GONE

            }
        })
    }

}