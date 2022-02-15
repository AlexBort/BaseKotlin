package com.example.basekotlin.functions

class Exanple1 {
    data class User(var isAdmin: Boolean) {
        fun login(password: String): Unit {
// some code
        }
    }
    fun main() {
        val admin = User(isAdmin = true)
        val allUsers: List<User> = listOf(admin, User(isAdmin = false))
        val admins = allUsers.filter(User::isAdmin)
        val setter: (Boolean) -> Unit = admin::isAdmin::set
        setter(true)
        val loginFunction: (User, String) -> Unit = User::login
        loginFunction(admin, "secret")
        val adminLoginFunction: ((String) -> Unit)? = admin::login
        adminLoginFunction?.invoke("secret")
    }

    fun String.f(){
        this.trim().plus("12")
    }

}