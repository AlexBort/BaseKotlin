package com.example.basekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import animals.dogs.*
import superMethod2


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        superMethod2()
//        superMethod1()
//        superMethod2()
    }
}