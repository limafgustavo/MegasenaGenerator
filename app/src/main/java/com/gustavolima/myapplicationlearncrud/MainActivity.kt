package com.gustavolima.myapplicationlearncrud

import android.annotation.SuppressLint
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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

        binding.imageCopy.setOnClickListener {
            copyNumbers()
        }
    }


    private fun generateNumbers() {
        var numbers = generateRandomNumbers()
        binding.editTextNumber1.setText(numbers[0].toString())
        binding.editTextNumber2.setText(numbers[1].toString())
        binding.editTextNumber3.setText(numbers[2].toString())
        binding.editTextNumber4.setText(numbers[3].toString())
        binding.editTextNumber5.setText(numbers[4].toString())
        binding.editTextNumber6.setText(numbers[5].toString())
    }


    private fun generateRandomNumbers(): List<Int> {
        val randomNumbers = mutableSetOf<Int>()
        while (randomNumbers.size < 6) {
            val randomNumber = Random.nextInt(1, 60)
            randomNumbers.add(randomNumber)
        }
        return randomNumbers.toList().sorted()
    }

    private fun copyNumbers() {

        var numbersCopy =
            binding.editTextNumber1.text.toString() + "." + binding.editTextNumber2.text.toString() + "." + binding.editTextNumber3.text.toString() + "." + binding.editTextNumber4.text.toString() + "." + binding.editTextNumber5.text.toString() + "." + binding.editTextNumber6.text.toString()
        val clipboardManager = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        clipboardManager.setPrimaryClip(ClipData.newPlainText("label", numbersCopy))
        Toast.makeText(this, "Copiado com sucesso.", Toast.LENGTH_SHORT).show()
    }


}