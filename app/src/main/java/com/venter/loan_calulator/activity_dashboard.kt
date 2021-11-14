package com.venter.loan_calulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_dashboard.*

class activity_dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        Log.d(MY_TAG,"In Dashboard")

        rview_client_dashboard.setOnClickListener{
            val clienmaster= Intent(this,activity_clintmaster::class.java)
            startActivity(clienmaster)
        }
        rview_vendor_dashboard.setOnClickListener{
            val vendormaster= Intent(this,activity_vendormaster::class.java)
            startActivity(vendormaster)
        }
    }
}