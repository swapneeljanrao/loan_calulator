package com.venter.loan_calulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class activity_dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        Log.d(MY_TAG,"In Dashboard")
    }
}