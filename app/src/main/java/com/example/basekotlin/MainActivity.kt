package com.example.basekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import com.example.basekotlin.databinding.ActivityMainBinding
//import com.example.basekotlin.databinding.ActivityMainBinding
import com.example.basekotlin.databinding.TestMainActivityBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
//    private lateinit var binding: TestMainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
//        binding = TestMainActivityBinding.inflate(layoutInflater)
        val rootView = binding.root
        setContentView(rootView)

//        supportActionBar?.apply {
//            setDisplayShowHomeEnabled(true)
//            setDisplayHomeAsUpEnabled(true)
//            setHomeButtonEnabled(true)
//        }
        binding.toolbar.setTitle(R.string.test_name_toolbar)
        binding.toolbar.apply {
            inflateMenu(R.menu.test_menu)
        }
//        binding.toolbar.setNavigationIcon(R.drawable.ic_baseline_clear_24)
        // todo: to add close button
        setSupportActionBar(binding.toolbar)

// to add list with items

//        setSupportActionBar(binding.customToolbar.supportToolbar)
//        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.test_menu, menu)
        return true

    }

}