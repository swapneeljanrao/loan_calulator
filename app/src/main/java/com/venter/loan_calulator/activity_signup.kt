package com.venter.loan_calulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_signup.*

class activity_signup : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        btn_next_signup.setOnClickListener {
            //var  logcall = Intent(this, activity_forgotpassset::class.java)
            //startActivity(logcall)

        }
    }
}