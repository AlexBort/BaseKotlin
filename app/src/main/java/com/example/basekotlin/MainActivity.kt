package com.example.basekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        dsfdsf
    }

    fun returnInt(): Int {
        return 0
    }

    fun sumNums(a: Int, b: Int) = a + b // скороченная запись для простых методов

}