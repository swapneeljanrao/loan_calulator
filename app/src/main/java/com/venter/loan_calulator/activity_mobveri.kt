package com.venter.loan_calulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mobveri.*

class activity_mobveri : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mobveri)
        btn_next_mobveri.setOnClickListener {
            var  logcall = Intent(this, activity_signup::class.java)
            startActivity(logcall)

        }
    }
}