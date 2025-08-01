package com.example.mylifecycle

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class MainActivity : ComponentActivity(){
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Activity life cycle event "+"onCreate")
        enableEdgeToEdge()
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Activity life cycle event "+"onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Activity life cycle event "+"onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Activity life cycle event "+"onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Activity life cycle event "+"onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Activity life cycle event "+"onDestroy")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Activity life cycle event "+"onRestart")
    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "Activity life cycle event "+"onSaveInstanceState")
    }



}











