package com.example.basekotlin.secondary_constructor.multiple_constructors

class Size {
    var width: Int = 0
    var height: Int = 0

    constructor(_height: Int) {
        height = _height
    }

    constructor(_width: Int, _height: Int) {
        width = _width
        height = _height
    }

    constructor(_width: Int, _height: Double) {
        width = _width
        height = _height.toInt()
    }

    constructor(_height: Double, _width: Int) {
        width = _width
        height = _height.toInt()
    }
}