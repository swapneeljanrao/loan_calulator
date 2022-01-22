package com.venter.loan_calulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_clintmaster.*

class activity_clintmaster : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clintmaster)
        rview_aclient_cmaster.setOnClickListener {
            val aclientcall = Intent(this,activity_client_add::class.java)
            startActivity(aclientcall)
        }

        rview_eclient_cmaster.setOnClickListener {
            val aclientcall = Intent(this,activity_client_edit::class.java)
            startActivity(aclientcall)
            //print
        }
    }
}