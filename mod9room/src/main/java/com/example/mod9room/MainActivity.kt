package com.example.mod9room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.room.Room
import java.time.Duration

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Thread{
            val db: AppDatabase = AppDatabase.getInstance(this@MainActivity)
            //db.personneDao().insert(Personne(id = 1, "Musk", "Elon"))
            Log.i(
                "MainActivity", "onCreate: " +
                        db.personneDao().getById(1).prenom +
                        db.personneDao().getById(1).nom)
        }.start()
    }
}