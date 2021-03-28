package com.example.basekotlin

import android.util.Log

interface TestInterface {

    val prop1: Int
    get() {
        return 0
    }

    // we can not to create instance of interface, because it's simple pattern

    // default implementation
    fun fun1() {
        Log.v("", "default implementation")
    }

    fun fun2()

    // Отличия интерфейса от абстрактного класса:
    /**
     * Абстрактные классы могут хранить состояния, интерфейсы не хранят.
     * Но интерфейсы могут хранить какие-то свойства.
     */


}