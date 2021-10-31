package com.example.basekotlin.secondary_constructor

class OrderOfCalling {

    class Size(val width: Int, val height: Int) {
        var area: Int = width * height

        init {
            println("Object with area equal to $area is created")
        }

        constructor(width: Int, height: Int, outerSize: Size) : this(width, height) {
            outerSize.area -= this.area
            println("Updated outer object's area is equal to ${outerSize.area}")
        }
    }

    fun main() {
        val outerObject = Size(5, 8)
        val innerObject = Size(2, 3, outerObject)
    }

}