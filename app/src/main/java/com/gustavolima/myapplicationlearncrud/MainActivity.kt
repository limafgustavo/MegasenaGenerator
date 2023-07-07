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

       // binding.button.setOnClickListener {

         //   var number = Random.nextInt(1,100).toString()
        //    binding.textView.text=number

    //    }

    }
}