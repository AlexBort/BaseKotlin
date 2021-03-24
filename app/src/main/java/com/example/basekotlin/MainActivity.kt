package com.example.basekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // var - ячейка памяти, в которую можно складывать какие-то значения
        //
        var a1: String = "123" // динамический тип данных, поэтому разные строки будут занимать разное количество памяти

        var a0: Byte = 12 // 8
        var a2: Int = 123 // статический тип- 32 бита
        var a3: Long = 123 // также статический тип - 64

        var a4: Double = .1 // 64
        var a5: Float = .1F // 32
//        Эти типы не есть примитивами, а являются классами

        var convertVar: Long = a2.toLong()
    }
}