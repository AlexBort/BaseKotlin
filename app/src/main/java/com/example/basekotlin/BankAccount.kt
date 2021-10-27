package com.example.basekotlin


/**
 * Implement the BankAccount class which receives
 * two Longs called deposited and withdrawn in the constructor and sets these properties:
deposited (the copy),
withdrawn (the copy),
balance (the difference).

 */

data class BankAccount(val _deposited: Long, val _withdrawn: Long) {
    val deposited = _deposited
    val withdrawn = _withdrawn
    val balance = deposited - withdrawn
}