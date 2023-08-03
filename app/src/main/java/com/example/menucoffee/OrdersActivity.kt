package com.example.menucoffee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.menucoffee.databinding.ActivityOrdersBinding

class OrdersActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOrdersBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityOrdersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent


    }
}