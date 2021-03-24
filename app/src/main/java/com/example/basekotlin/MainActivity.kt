package com.example.basekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name: String = "Alex"
        println("Hello $name")// it will understand it as var
        println("Hello \$name") // it will understand it as word "name" not var

        var var1: Int = 1
        var var2: Int = 2
        println("var1 + var2= ${var1 + var2} ") // it will understand as sum of this Int vars

    }
}