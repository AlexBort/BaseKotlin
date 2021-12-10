package com.example.basekotlin.filtering_string

const val SPACE = ' '
const val UNDERLINE = '_'

fun String.filterWithoutSpecialChars(): String {
    return this.toLowerCase().filter {
        it.isLetter() || it.isWhitespace()
    }
}

fun String.replaceSpaceToUnderline(): String {
    if (this.first()!= SPACE && this.last()!= SPACE ){
        return this.replace(SPACE, UNDERLINE)
    }
    return this
}

//    return this.toLowerCase().filter {
//      it.isLetter()
//    }


fun List<String>.filter() {

}