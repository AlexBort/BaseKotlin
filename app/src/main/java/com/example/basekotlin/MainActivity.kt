package com.example.basekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.basekotlin.secondary_constructor.SequenceInitializationSecondaryConstructor

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SequenceInitializationSecondaryConstructor(0)
        SequenceInitializationSecondaryConstructor(0,"check")
    }
}