package com.example.basekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.basekotlin.example_sealed.Expr

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        println(SealedClass.Sum())

        val e1 = Expr.Const(1.2) // Expr.Sum(
        val e2 = Expr.Const(2.2)
        val sum = Expr.Sum(e1, e2)
        Log.v("MainActivity", sum.toString())

//                val e2 = Expr.Const (2.8)
//        println(e1)
        Log.v("MainActivity", eval(sum).toString())
    }

    fun eval(expr: Expr): Double = when (expr) {
        is Expr.Const -> expr.number
        is Expr.Sum -> eval(expr.e1) + eval(expr.e2)

        Expr.NotNumber -> Double.NaN
    }
}