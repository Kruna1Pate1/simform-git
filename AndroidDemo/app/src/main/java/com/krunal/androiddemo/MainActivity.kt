package com.krunal.androiddemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate: Change 1")
        Log.d(TAG, "onCreate: Change 2")
        Log.d(TAG, "onCreate: Small Change")
        Log.d(TAG, "onCreate: Major change together")
    }
    
    companion object {
        private const val TAG = "MainActivity"
    }
}