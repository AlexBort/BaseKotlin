package com.example.basekotlin.secondary_constructor.check

class Rectangle {
    val width: Int
    val length: Int

    constructor(_width: Int, _length: Int) {
        width = _width
        length = _length
    }
}

val rectangle = Rectangle()