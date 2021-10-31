package com.example.basekotlin.secondary_constructor

fun main(){
    Size() // I couldn't call this without params. But if I set default param in constructor I could
}

class Size(_width: Int, _height: Int) {
    var width: Int = 0
    var height: Int = 0

    constructor(_width: Int, _height: Int) { // custom constructor
        width = _width
        height = _height
    }
}