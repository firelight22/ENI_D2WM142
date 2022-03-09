package com.example.mod7plusoumoins

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mod7plusoumoins.databinding.ActivityMainBinding
//public class MainActivity extends AppCompatActivity implements View.OnClickListener
class MainActivity : AppCompatActivity(), View.OnClickListener{
    lateinit var amb : ActivityMainBinding
    lateinit var vm : CompteurViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = DataBindingUtil.setContentView(this,R.layout.activity_main)
        vm = ViewModelProvider(this)[CompteurViewModel::class.java]
        amb.lifecycleOwner = this
        amb.vm = vm
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.buttonPlus5 -> vm.plus(5)
            R.id.buttonMoins5 -> vm.moins(5)
            R.id.buttonPlus10 -> vm.plus(10)
            R.id.buttonMoins10 -> vm.moins(10)
            R.id.buttonPlus -> vm.plus(Integer.parseInt(amb.editTextNumber.text.toString()))
            R.id.buttonMoins -> vm.moins(Integer.parseInt(amb.editTextNumber.text.toString()))
        }
        //amb.vm = vm
    }
}