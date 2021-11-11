package com.example.basekotlin.secondary_constructor.check

import kotlin.math.roundToInt

//fun main(){
//    var machine = EspressoMachine()
//}

class EspressoMachine( var costPerServing: Float) {

    constructor(costPerServing: Float, coffeeCapsulesCount: Int, totalCost: Float) : this(costPerServing) {
        this.costPerServing = totalCost / coffeeCapsulesCount
    }

    constructor (costPerServing: Float, coffeeBeansWeight: Float, totalCost: Float) : this(costPerServing) {
        this.costPerServing = totalCost / (coffeeBeansWeight / 10)
        val result = println("text")
    }

    fun f(){}
}

//data class EspressoMachine(private var costPerServing: Float) {
//
//
//    constructor(costPerServing: Float, coffeeCapsulesCount: Int, totalCost: Float) : this(
//        costPerServing
//    ) {
//        this.costPerServing = totalCost / coffeeCapsulesCount
//    }
//
//    constructor (costPerServing: Float, coffeeBeansWeight: Float, totalCost: Float) : this(
//        costPerServing
//    ) {
//
//        this.costPerServing = totalCost / (coffeeBeansWeight / 10)
//    }
//}
