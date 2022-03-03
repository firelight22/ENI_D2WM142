package com.example.mod5tpcolorme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.mod5tpcolorme.databinding.FragmentPinkBinding

class PinkFragment : Fragment() {
    lateinit var fpb: FragmentPinkBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fpb = DataBindingUtil.inflate(inflater,R.layout.fragment_pink, container, false)
        return fpb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fpb.buttonPink.setOnClickListener {
            //TODO aller vérifier que le hashCode prenom est > à 150
            if((fpb.editTextNom.text.toString().hashCode() +
                        fpb.editTextBirthYear.text.toString().hashCode())/1000000>300
            ){
                //TODO Si oui fragment Orange
                Navigation.findNavController(view).navigate(R.id.action_pinkFragment_to_yellowFragment)
            }else{
                //TODO si non Bleu
                Navigation.findNavController(view).navigate(R.id.greenFragment)
            }

        }
    }
}