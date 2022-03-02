package com.example.mod4tprandom

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var editTextMin: EditText
    lateinit var editTextMax:EditText
    lateinit var textViewResultat: TextView
    lateinit var buttonGenerate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextMin = findViewById<EditText>(R.id.editTextMin)
        editTextMax = findViewById<EditText>(R.id.editTextMax)
        textViewResultat = findViewById<TextView>(R.id.textViewResul)
        buttonGenerate = findViewById<Button>(R.id.buttonGenerate)
        buttonGenerate.setOnClickListener { computeRandom() }
    }

    fun computeRandom(){
        var minString = editTextMin.text.toString()
        var maxString = editTextMax.text.toString()
        var randomInt = Random.nextInt(minString.toInt(), maxString.toInt())
        textViewResultat.text = randomInt.toString()
    }
}