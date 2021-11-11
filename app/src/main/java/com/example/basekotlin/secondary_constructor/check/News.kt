package com.example.basekotlin.secondary_constructor.check

class News {
    var title: String = "-"
    var text: String = "-"
    var tag: String = "-"

    constructor(title: String, text: String) {
        this.title = title
        this.text = text
        this.tag = "no tags"
    }
}

fun main(){
    News()
    News("Title")
    val news = News("Title", "Text")

}