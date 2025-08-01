package com.example.mylifecycle

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.mylifecycle.databinding.ActivityTestBinding
import com.example.mylifecycle.`interface`.Animal
import com.example.mylifecycle.utils.clear
import com.example.mylifecycle.utils.hide

class TestActivity : AppCompatActivity(), Animal {
    private lateinit var binding: ActivityTestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
       binding= ActivityTestBinding.inflate(layoutInflater)
       setContentView(binding.root)
        // ✅ Set included toolbar as app bar
        setSupportActionBar(binding.includeToolbar.toolbar)
        binding.includeToolbar.toolbar.setTitle("Test Activity")
        binding.tvText.hide()
        binding.etText.clear()
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show()


        val dog: Animal = this
        Log.d("AnimalInfo", "Name: ${dog.name()}")
        Log.d("AnimalInfo", "Bark: ${dog.bark()}")
        Log.d("AnimalInfo", "Color: ${dog.color()}")

       
    }
    override fun bark(): String {
        return "Vow"
    }
    override fun color(): String {
        return "Brown"
    }
    override fun name(): String {
     return "Dog"
    }


}



