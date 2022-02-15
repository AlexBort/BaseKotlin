package com.example.basekotlin.contracts

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

data class MyEvent(val message: String)

@ExperimentalContracts
fun processEvent(event: Any?) {
    if (isInterested(event)) {
        println(event.message)
    }
}

@ExperimentalContracts
fun isInterested(event: Any?): Boolean {
    contract {
        returns(true) implies (event is MyEvent)
    }
    return event is MyEvent
}