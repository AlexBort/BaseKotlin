package com.example.basekotlin.filtering_string

fun main() {
    FilterManager().filterStringList()
}

class FilterManager {

    fun filterStringList(){
        val list = StringListForFiltering.list
        var filteredList = ArrayList<String>()
        for (i in list.indices){
            val str = list[i].filterWithoutSpecialChars().replaceSpaceToUnderline()
            filteredList.add(str)
        }

        println(filteredList.toString())
//        val string:String
    }
}