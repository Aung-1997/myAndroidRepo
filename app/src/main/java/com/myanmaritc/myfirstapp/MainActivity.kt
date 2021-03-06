package com.myanmaritc.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnToast.setOnClickListener {
            Toast.makeText(
                this,
                "This is a toast.",
                Toast.LENGTH_LONG).show()

        }
        btnCount.setOnClickListener {
            var count: Int =txtCount.text.toString().toInt()
            count+=1
            txtCount.text=count.toString()
        }
        btnRandom.setOnClickListener {
            var randomNum: Int =(0..100).random()
            txtCount.text=randomNum.toString()




        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("ActivityLifeCycle:>>>>>","Activity stared........")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ActivityLifeCycle:>>>>>","Activity resumed....................")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ActivityLifeCycle:>>>>","Activity pause...................")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ActivityLifeCycle:>>>>","Activity stop....................")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("ActivityLifeCycle:>>>>","Activity restart...................")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActivityLifeCycle:>>>>","Activity destory...................")
    }

}