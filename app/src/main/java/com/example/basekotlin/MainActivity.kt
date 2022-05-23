package com.example.basekotlin

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.example.basekotlin.databinding.ActivityMainBinding
//import com.example.basekotlin.databinding.ActivityMainBinding
import com.example.basekotlin.databinding.TestMainActivityBinding
import com.google.android.material.appbar.AppBarLayout
import kotlin.math.abs


class MainActivity : AppCompatActivity() {

    private lateinit var binding: TestMainActivityBinding
//    private lateinit var binding: TestMainActivityBinding

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TestMainActivityBinding.inflate(layoutInflater)
//        binding = TestMainActivityBinding.inflate(layoutInflater)
        val rootView = binding.root
        setContentView(rootView)

//        supportActionBar?.apply {
//            setDisplayShowHomeEnabled(true)
//            setDisplayHomeAsUpEnabled(true)
//            setHomeButtonEnabled(true)
//        }

        binding.toolbar.apply {
            title = ""
            inflateMenu(R.menu.test_menu)
        }
//        binding.toolbar.setNavigationIcon(R.drawable.ic_baseline_clear_24)
        // todo: to add close button
        setSupportActionBar(binding.toolbar)

        binding.collapsing.setOnScrollChangeListener { v, scrollX, scrollY, oldScrollX, oldScrollY ->
            Toast.makeText(baseContext, "", Toast.LENGTH_SHORT).show()
        }


        binding.appbar.addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener { appBarLayout, verticalOffset ->

//            val toolbarCollapsed = abs(verticalOffset) >= appBarLayout.totalScrollRange
//            if (toolbarCollapsed){
//                binding.toolbar.title = "Rate your courier"
//                binding.linear.visibility = GONE
//            }
//            else {
//                binding.linear.visibility = VISIBLE
//            }

/*            val toolbarCollapsed = abs(verticalOffset) >= appBarLayout.totalScrollRange
            if (toolbarCollapsed) {
//                binding.toolbar.setTitle(R.string.title)
//                binding.toolbar.inflateMenu(R.menu.test_menu)
                binding.title.visibility = GONE
                binding.subtitle.visibility = GONE
//                Toast.makeText(baseContext,"COLLAPSED",Toast.LENGTH_SHORT).show()
            }
            else {
//                binding.toolbar.setTitle(" ")
                binding.title.visibility = VISIBLE
                binding.subtitle.visibility = VISIBLE
//                Toast.makeText(baseContext,"NOT COLLAPSED",Toast.LENGTH_SHORT).show()
            }*/

        })

// to add list with items

//        setSupportActionBar(binding.customToolbar.supportToolbar)
//        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.test_menu, menu)
        return true

    }

}