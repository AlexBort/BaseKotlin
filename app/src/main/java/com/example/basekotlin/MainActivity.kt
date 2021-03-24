package com.example.basekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val str: String = ""

        val strNull: String?
        strNull = getStrNull()

        val size = strNull!!.length // should write "!!" because it waits that we can get null, therefore we should say that we are confident that strNull not be null
        println(size) // it will be crash- KotlinNullPointerException
        // это все помогает нам обезопаситься с тем, чтобы не создать nullPointerException

        // Но мы можем не понять или null, или нет, если мы будем вызывать джавовский класс
    }

    fun getStrNull(): String? {
        return null
    }
}