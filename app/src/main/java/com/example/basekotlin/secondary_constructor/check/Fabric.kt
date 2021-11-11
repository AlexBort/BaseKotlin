package com.example.basekotlin.secondary_constructor.check

fun main(){
    Fabric()
}

class Fabric(var color: String) {
    var pattern: String = "none"
    var patternColor: String = "none"

    init {

    }

    constructor(color: String, pattern: String, patternColor: String):this(color){
        this.pattern = pattern
        this.patternColor = patternColor
        println("$color fabric is created")
        println("$patternColor $pattern pattern is printed on fabric"  )
    }
}