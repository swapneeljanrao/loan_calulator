package com.venter.loan_calulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.provider.Settings
import android.util.Log
import java.time.LocalDate

class MainActivity : AppCompatActivity() {
    var v = 0
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)  //main activity
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        Handler().postDelayed(
            {
                try
                {


                       var  logcall = Intent(this, activity_login::class.java)


                    startActivity(logcall)
                    this.finish() //useful for not working back in next activity

                }
                catch (e:Exception)
                {
                    //Log prints here
                    Log.d(MY_TAG,"Erro is in..."+e.message)
                }

            }, 2000
        )
    }
}