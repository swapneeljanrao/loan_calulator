package com.venter.loan_calulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_vendormaster.*

class activity_vendormaster : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vendormaster)
        rview_avendor_vmaster.setOnClickListener{
            val avendorcall = Intent(this,activity_vendor_add::class.java)
            startActivity(avendorcall)
        }
        rview_evendor_vmaster.setOnClickListener{
            val avendorcall = Intent(this,activity_vendor_edit::class.java)
            startActivity(avendorcall)
        }
    }
}