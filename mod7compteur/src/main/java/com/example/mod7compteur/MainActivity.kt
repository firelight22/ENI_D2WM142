package com.example.mod7compteur

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mod7compteur.databinding.ActivityMainBinding

class MainActivity() : AppCompatActivity() {

    lateinit var vm : CompteurViewModel
    lateinit var amb : ActivityMainBinding;
    lateinit var textViewCompteur : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = DataBindingUtil.setContentView(this,R.layout.activity_main)
        vm = ViewModelProvider(this).get(CompteurViewModel::class.java)
        amb.vm = vm

        amb.buttonPlusUn.setOnClickListener {
            vm.plusUn()
            amb.vm=vm
        }
    }
}