package com.example.menucoffee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.menucoffee.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binging: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binging=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binging.root)
    }
}