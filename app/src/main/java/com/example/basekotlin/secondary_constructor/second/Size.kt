package com.example.basekotlin.secondary_constructor.second

class Size(val width: Int, val height: Int) { // 1- params of primary constructor are the first
    var area: Int = width * height // 2- then will be these params (in order of writing)

    init {
        println("Object with area equal to $area is created") // 3- then will be init block (in order of writing)
    }

    constructor(width: Int, height: Int, outerSize: Size) : this(width, height) {
        // 5- then will be executed secondary constructor as the last one that should be called after primary constructor, init block and fields of the class
        outerSize.area -= this.area
        println("Updated outer object's area is equal to ${outerSize.area}")
    }

    init {
        println("Though it's written after secondary " +
                "constructor but it's continuation " +
                "of the primary constructor" +
                " therefore it will be called earlier than secondary") // 3- then will be init block (in order of writing)
    }

}

fun main() {
    val outerObject = Size(5, 8)
    val innerObject = Size(2, 3, outerObject)
}
