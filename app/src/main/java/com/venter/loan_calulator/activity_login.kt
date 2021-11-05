package com.venter.loan_calulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.time.LocalDate

class activity_login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        try
        {

            val d1= LocalDate.now()
            if(d1.compareTo(exp_date)<=0)
            {
                var  logcall = Intent(this, activity_dashboard::class.java)
                startActivity(logcall)
            }
        }
        catch (e:Exception)
        {
            Log.d(MY_TAG,"   "+e.message)
        }
    }
}