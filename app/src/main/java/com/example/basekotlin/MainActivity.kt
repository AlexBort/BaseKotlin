package com.example.basekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userJava = UserJava("user_java@gmail.com")
        val userKotlin = UserKotlin("user_kotlin@gmail.com")

        println("example java: ${userJava.email}")
        println("example kotlin: ${userKotlin.email}")
//        userKotlin.email = "email"

        // val - means that this parameter is final (unmutable)
        // var - means otherwise

    }
}