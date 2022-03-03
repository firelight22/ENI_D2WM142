package com.example.mod5tpcolorme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.mod5tpcolorme.databinding.FragmentRedBinding


class RedFragment : Fragment() {

    lateinit var frb :  FragmentRedBinding;

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        frb = DataBindingUtil.inflate(inflater,R.layout.fragment_red, container, false)
        return frb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        frb.buttonRed.setOnClickListener {
            //TODO aller vérifier que le hashCode prenom est > à 150
            if((frb.editTextNom.text.toString().hashCode() +
                frb.editTextMotHasard.text.toString().hashCode())/1000000>300
                    ){
                //TODO Si oui fragment Orange
                Navigation.findNavController(view).navigate(R.id.action_redFragment_to_orangeFragment)
            }else{
                //TODO si non Bleu
                Navigation.findNavController(view).navigate(R.id.action_redFragment_to_blueFragment)
            }

        }
    }
}