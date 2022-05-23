package com.example.basekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ToolbarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.collapsing_toolbar)
    }
}