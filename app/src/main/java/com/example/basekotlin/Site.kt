package com.example.basekotlin

class Site(val address: String = "reddit.com", val foundationYear: Int = 2005)

fun makeReddit(): Site {
    return Site()
}