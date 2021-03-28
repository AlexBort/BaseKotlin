package com.example.basekotlin

import android.print.PrintAttributes

class Car(private var weight: Double, private var years: Int) {

    var isNew: Boolean = false
        get() {
            return years <= 10
        }
        set(value) { // value - it's internal param of method
            if (value){
                println("Yeeeeeesss !!!")
            }
            else {
                println("Nooooooottt !!!")
            }
            field = value // 'field' like 'this'
        }
}