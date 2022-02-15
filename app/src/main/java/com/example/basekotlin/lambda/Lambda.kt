package com.example.basekotlin.lambda

val block: String.() -> Unit = {

}

class Lambda {

    // with return type
    val square: (Int) -> (Int) = { number ->
        number * number // the last line will be returned.
        // So we don't need to write return but it will be done automatically
    }

    // without return type
    val withoutReturnType: (Int) -> (Unit) = {
        println("print input parameter $it" )
    }

    // lambda with receiver
    val block: String.() -> Unit = {

    }
}

fun main() {
    var returnType = Lambda().square(4)
    println(returnType)
    var withoutReturnType = Lambda().withoutReturnType(4) // we see "16" because we have return line: that is multiplication of 2 nums
    print(withoutReturnType) // we see only this "kotlin.Unit" because we return nothing

    var str = ""
    str.block()
}