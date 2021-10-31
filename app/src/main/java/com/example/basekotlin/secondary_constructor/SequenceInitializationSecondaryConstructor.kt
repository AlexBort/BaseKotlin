package com.example.basekotlin.secondary_constructor

class SequenceInitializationSecondaryConstructor(val width: Int) {

//    val string:String

    constructor(width: Int, string: String) : this(width)  { // 1- in the first place params of primary will be initialized
//        this.string = string
        // some code // 3- and then body of secondary constructor will be executed
        println("SequenceInitializationSecondaryConstructor " + "secondary constructor body: ")

    }

    init {
        // some code // 2- in the second place code from init block will be executed
        println("SequenceInitializationSecondaryConstructor " + "init block body: ")
    }

    fun test(){
    }
}