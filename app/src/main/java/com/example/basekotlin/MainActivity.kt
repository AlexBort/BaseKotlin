package com.example.basekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(Person("Sashs", 15))
        println("=================================")
        println(DataPerson("Sashs", 15))

        val person = DataPerson("Sashs", 15)
        val person2 = person.copy(name = "SASHA")
        println("without copy: " + person)
        println("with copy: " + person2)

        val (age) = person
        println("age= $age")
    }
}