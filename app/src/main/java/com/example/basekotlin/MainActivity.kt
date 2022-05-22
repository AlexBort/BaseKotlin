package com.example.basekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import com.example.basekotlin.databinding.ActivityMainBinding
//import com.example.basekotlin.databinding.ActivityMainBinding
import com.example.basekotlin.databinding.TestMainActivityBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: TestMainActivityBinding
//    private lateinit var binding: TestMainActivityBinding

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
        binding.toolbar.title = getString(R.string.title)
        binding.toolbar.subtitle = getString(R.string.sub_title)
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