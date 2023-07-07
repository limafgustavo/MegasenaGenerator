package com.gustavolima.myapplicationlearncrud

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gustavolima.myapplicationlearncrud.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonGenerate.setOnClickListener {


            generateNumbers()



        }

    }


    private fun generateNumbers() {
        binding.editTextNumber1.setText(Random.nextInt(1, 60).toString())
        binding.editTextNumber2.setText(Random.nextInt(1, 60).toString())
        binding.editTextNumber3.setText(Random.nextInt(1, 60).toString())
        binding.editTextNumber4.setText(Random.nextInt(1, 60).toString())
        binding.editTextNumber5.setText(Random.nextInt(1, 60).toString())
        binding.editTextNumber6.setText(Random.nextInt(1, 60).toString())
    }

}