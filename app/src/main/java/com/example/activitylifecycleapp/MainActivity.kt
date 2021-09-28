package com.example.activitylifecycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("life_cycle","the app is on create")
    }

    override fun onStart() {
        super.onStart()
        Log.d("life_cycle","the app is on start")
    }

   override fun onResume()
    {
        super.onResume()
        Log.d("life_cycle","the app is on resume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("life_cycle","the app is on pause")
    }
    override fun onStop()
    {
        super.onStop()
        Log.d("life_cycle","the app is on stop")

    }


     override fun onDestroy()
     {
         super.onDestroy()
         Log.d("life_cycle","the app is on destroy")
     }


}