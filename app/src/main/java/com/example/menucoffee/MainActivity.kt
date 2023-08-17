package com.example.menucoffee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.CheckBox
import com.example.menucoffee.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOrder.setOnClickListener {
            val i = Intent(this, SplashScreenActivity::class.java)
            startActivity(i)
        }

        binding.checkBrownie.setOnClickListener {}
        binding.checkCake.setOnClickListener {}
        binding.checkCoffee.setOnClickListener {}
        binding.checkTea.setOnClickListener {}
        binding.checkCroissant.setOnClickListener {}
        binding.checkWaffle.setOnClickListener {}
        binding.checkMilkshake.setOnClickListener {}
        binding.checkWater.setOnClickListener {}
    }

    private val browniePrice = 4
    private val cakePrice = 3.5
    private val coffeePrice = 2.5
    private val teaPrice = 2
    private val croissantPrice = 3
    private val wafflePrice = 4
    private val milkshakePrice = 3.5
    private val waterPrice = 1.5


    private fun orderBrownie () {
        if(binding.checkBrownie.isChecked()){
            binding.editAmountBrownie.setText("1")
        }else{
            binding.editAmountBrownie.setText("0")
        }
    }

    private fun orderCake () {
        if(binding.checkCake.isChecked()){
            binding.editAmountCake.setText("1")
        }else{
            binding.editAmountCake.setText("0")
        }
    }

    private fun orderCoffee () {
        if(binding.checkCoffee.isChecked()){
            binding.editAmountCoffee.setText("1")
        }else{
            binding.editAmountCoffee.setText("0")
        }
    }

    private fun orderTea () {
        if(binding.checkTea.isChecked()){
            binding.editAmountTea.setText("1")
        }else{
            binding.editAmountTea.setText("0")
        }
    }

    private fun orderCroissant () {
        if(binding.checkCroissant.isChecked()){
            binding.editAmountCroissant.setText("1")
        }else{
            binding.editAmountCroissant.setText("0")
        }
    }

    private fun orderWaffle () {
        if(binding.checkWaffle.isChecked()){
            binding.editAmountWaffle.setText("1")
        }else{
            binding.editAmountWaffle.setText("0")
        }
    }

    private fun orderMilkshake () {
        if(binding.checkMilkshake.isChecked()){
            binding.editAmountMilkshake.setText("1")
        }else{
            binding.editAmountMilkshake.setText("0")
        }
    }

    private fun orderWater () {
        if(binding.checkWater.isChecked()){
            binding.editAmountWater.setText("1")
        }else{
            binding.editAmountWater.setText("0")
        }
    }
}