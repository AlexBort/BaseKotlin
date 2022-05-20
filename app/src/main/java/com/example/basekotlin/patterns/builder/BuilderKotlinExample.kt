package com.example.basekotlin.patterns.builder

import android.content.Context

fun main() {
    Example.Builder(null).addDescrip("Description").show()
}

data class Example(val name: String, val description: String, val sex: String) {

    class Builder(context: Context?) {
        var name: String = ""
        var description: String = ""
        var sex: String = ""

//        fun addName(name: String): Builder {
//            this.name = name
//            return this
//        }

        fun addName(name:String) = apply {
            this.name = name
        }

        fun addDescrip(description: String) = apply {
            this.description = description
        }

        fun addSex(sex: String) = apply {
            this.sex = sex
        }

        fun show() = apply {  }
    }
}

