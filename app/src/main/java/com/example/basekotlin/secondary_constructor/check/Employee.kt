package com.example.basekotlin.secondary_constructor.check

class Employee {
    val name: String
    val salary: Int

    constructor(name: String, salary: Int) {
        this.name = name
        this.salary = salary
    }
}