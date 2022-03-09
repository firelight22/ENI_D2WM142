package com.example.mod7lancerdes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mod7lancerdes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener{
    lateinit var amb: ActivityMainBinding
    lateinit var vm: LancerDeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = DataBindingUtil.setContentView(this,R.layout.activity_main)
        vm = ViewModelProvider(this)[LancerDeViewModel::class.java]
        amb.vm = vm
        amb.lifecycleOwner = this
        amb.buttonDeClassique.setOnClickListener(this)
        amb.buttonRP.setOnClickListener(this)
    }

    override fun onClick(view : View){
        when(view.id){
            R.id.buttonDeClassique -> vm.lancerDe()
            R.id.buttonRP -> vm.lancerDeRP()
        }
    }
}