package com.example.basekotlin


/**
 * https://github.com/Kirchhoff-/Android-Interview-Questions/blob/master/Kotlin/What's%20init%20block.md
 *
 */
class Constructor(string: String, string4: String,string5: String) {

    constructor(string: String, string2: String) : this(string,"","")  /*this(string,string2 = )*/ {
        println("order ")
    }


}