package com.example.basekotlin.mvi_simple_approach.data

import kotlin.collections.ArrayList

class ListRepository : Repository {

    private var mockList = ArrayList<MockData>()

    init {
        getMockData()
    }

    private fun getMockData(): ArrayList<MockData> {
        for (i in 0 until 20) {
            mockList.add(MockData("id $i", "TITLE: $i"))
        }
        return mockList
    }

    fun fetchData() = getMockData()
}