package com.example.basekotlin


/**
 * There is a program that reads a number. If the number is less than -128, then the property time of a ByteTimer class must be -128.
 * If it's greater than 127, then it must be 127, otherwise, it must be its raw value.
Fix the ByteTimer class.
 */

fun main() {
    val timerValue = readLine()!!.toInt()
    val timer = ByteTimer(timerValue)
    println(timer.time)
}

class ByteTimer(var time: Int) {
    init {
        if(time<-128) {
            time = -128
        }
        else if (time>127){
            time = 127
        }
    }

    fun f(){}
}