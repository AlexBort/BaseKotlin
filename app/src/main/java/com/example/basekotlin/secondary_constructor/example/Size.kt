package com.example.basekotlin.secondary_constructor.example

class Size {
    val width: Int
    val height: Int
    val area: Int

    constructor(width: Int, height: Int) {
        this.width = width
        this.height = height
        this.area = width * height
    }
}
