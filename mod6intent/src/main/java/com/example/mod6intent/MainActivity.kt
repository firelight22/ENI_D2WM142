package com.example.mod6intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Intent Explicite = On connait déjà la destination
        val targetIntent = Intent(this,TargetActivity::class.java)
        //Intent targetIntent = new Intent(this, TargetActivity.java);
        targetIntent.putExtra("id",42)
        startActivity(targetIntent)
    }
}