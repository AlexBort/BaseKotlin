package com.example.basekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val car = Car(20.5, 10)
        Log.v(localClassName, "car isNew: " + car.isNew.toString())

        car.isNew = true
        car.isNew = false

    }
}