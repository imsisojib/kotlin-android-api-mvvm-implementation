package com.imsisojib.bdjobscodingtest.adapters

import android.os.Build
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.imsisojib.bdjobscodingtest.R
import com.imsisojib.bdjobscodingtest.beans.Data
import com.imsisojib.bdjobscodingtest.viewholders.JobItemViewHolder

class JobsAdapter(private var jobs: List<Data>): RecyclerView.Adapter<JobItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobItemViewHolder {
        val v: View = LayoutInflater.from(parent.context).inflate(R.layout.sampleview_ad_info,parent,false);
        return JobItemViewHolder(v);
    }

    override fun getItemCount(): Int {
        return jobs.size;
    }

    override fun onBindViewHolder(holder: JobItemViewHolder, position: Int) {

        holder.tvTittle.text = jobs[position].getJobTittle()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            holder.tvApplicationProcess.text = Html.fromHtml(jobs[position].getJobDetails()
                ?.getApplyInstruction()?.replaceFirst("<br><br>",""), Html.FROM_HTML_MODE_COMPACT)
        } else {
            holder.tvApplicationProcess.text = Html.fromHtml(
                jobs[position].getJobDetails()
                    ?.getApplyInstruction()?.replaceFirst("<br><br>","")
            )
        }

        //salary range
        if(!jobs[position].getMinSalary().isNullOrEmpty() && !jobs[position].getMaxSalary().isNullOrEmpty()){
            holder.tvSalary.text = jobs[position].getMinSalary()+"-"+jobs[position].getMaxSalary()
        }else holder.tvSalary.text = "Negotiable"

        holder.tvCompanyName.text = jobs[position].getCompanyProfile()
        Glide.with(holder.itemView.context)
            .load(jobs[position].getLogo())
            .into(holder.logo)


        //animation
        holder.linearContainer.animation = AnimationUtils.loadAnimation(holder.linearContainer.context,R.anim.fade_transition_animation)
        holder.logo.animation = AnimationUtils.loadAnimation(holder.logo.context,R.anim.fade_scale_animation)

    }
}