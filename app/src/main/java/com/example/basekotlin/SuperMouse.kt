package com.example.basekotlin

internal class SuperMouse : Mouse() { // it makes this class private from calling from other module even if such module is included to that

    fun funB() {
        println("Super text")
        funA()
    }
}