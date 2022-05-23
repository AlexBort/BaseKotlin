package com.example.basekotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import androidx.constraintlayout.motion.widget.MotionLayout


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_start)

        val button = findViewById<ImageButton>(R.id.close_button)
        val motion = findViewById<MotionLayout>(R.id.motion)
        button.setOnClickListener {
            motion.transitionToEnd()
        }

//        val motion = findViewById<MotionLayout>(R.id.motion)
        motion.setTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {
                Toast.makeText(baseContext, "", Toast.LENGTH_SHORT).show()
            }

            override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {
                Toast.makeText(baseContext, "", Toast.LENGTH_SHORT).show()
            }

            override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                Toast.makeText(baseContext, "", Toast.LENGTH_SHORT).show()
            }

            override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {
                Toast.makeText(baseContext, "", Toast.LENGTH_SHORT).show()
            }
        })
    }

    fun launchActivity(view: View) {
        startActivity(Intent(this, ToolbarActivity::class.java))
    }

//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.test_menu, menu)
//        return true
//    }

}