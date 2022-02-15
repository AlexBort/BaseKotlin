package com.example.basekotlin.contracts

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

data class Request(val arg: String)


/**
 * not compilable variant
 */
//class ServiceWithoutContract {
//
//    fun process(request: Request?) {
//        validateWithoutContract(request)
//        println(request.arg) // Compiles fine now
//    }
//}
//
//
//private fun validateWithoutContract(request: Request?) {
//    if (request == null) {
//        throw IllegalArgumentException("Undefined request")
//    }
//    if (request.arg.isBlank()) {
//        throw IllegalArgumentException("No argument is provided")
//    }
//}



@ExperimentalContracts
class ServiceWithContract {

    fun process(request: Request?) {
        validate(request)
        println(request.arg) // Compiles fine now
    }
}

@ExperimentalContracts
private fun validate(request: Request?) {
    contract {
        returns() implies (request != null)
    }
    if (request == null) {
        throw IllegalArgumentException("Undefined request")
    }
    if (request.arg.isBlank()) {
        throw IllegalArgumentException("No argument is provided")
    }
}
/**
 * Such contracts are implemented 'under the hood'  in such scope functions as: run, with, apply, etc
 */
/**
 * Therefore will rewrite this example using scope fun
 */

class ServiceWithScope {

    fun process(request: Request?) {
        request?.let {
            validateWithScope(it)
            println(it.arg)
        }
//        validate(request)
//        println(request.arg) // Compiles fine now
    }
}


private fun validateWithScope(request: Request?) {
    if (request == null) {
        throw IllegalArgumentException("Undefined request")
    }
    if (request.arg.isBlank()) {
        throw IllegalArgumentException("No argument is provided")
    }
}
