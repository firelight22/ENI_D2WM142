package com.example.mod4demoskt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.textView)
        val editText = findViewById<EditText>(R.id.editText)
        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)
        val button2 = findViewById<Button>(R.id.button2)

        textView.text = "Hello"
        editText.setText("Comment allez-vous?")
        ratingBar.rating = 3f
        button2.setOnClickListener { onClickButton(it) }
    }

    fun onClickButton(view: View){
        Toast.makeText(this,
            "J'ai appuyé sur un bouton :D",
            Toast.LENGTH_SHORT).show()
    }
}