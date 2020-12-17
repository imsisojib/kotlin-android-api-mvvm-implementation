package com.imsisojib.bdjobscodingtest.viewholders

import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.imsisojib.bdjobscodingtest.R
import com.imsisojib.bdjobscodingtest.beans.Data

class JobItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val tvTittle: TextView = itemView.findViewById(R.id.tv_tittle);
        val tvSalary: TextView = itemView.findViewById(R.id.tv_salary);
        val tvCompanyName: TextView = itemView.findViewById(R.id.tv_company_name);
        val tvDeadline: TextView = itemView.findViewById(R.id.tv_deadline);
        val tvApplicationProcess: TextView = itemView.findViewById(R.id.tv_application_process)

        val logo: ImageView = itemView.findViewById(R.id.img_user)
        val container: ConstraintLayout = itemView.findViewById(R.id.constraintlayout_container);

}