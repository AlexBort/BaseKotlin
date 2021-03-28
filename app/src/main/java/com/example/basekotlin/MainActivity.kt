package com.example.basekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.v("","RED")
        Log.v("","BLACK")
        Log.v("","GREEN")

        println(Colors.BLACK)
        println(Colors.GREEN)
        println(Colors.RED)
        println(Colors.WHITE)

    }
}