package com.example.mod5tpcolorme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.mod5tpcolorme.databinding.FragmentWhiteBinding


class WhiteFragment : Fragment() {
    lateinit var fwb : FragmentWhiteBinding;

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fwb = DataBindingUtil.inflate(inflater,R.layout.fragment_white, container, false)
        return fwb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //TODO Aller écouter l'appui sur le bouton
        fwb.buttonWhiteFrag.setOnClickListener {
            //TODO aller vérifier que le hashCode prenom est > à 150
            if(fwb.editTextPrenom.text.toString().hashCode() / 1000000 > 150){
                //TODO Si oui fragment Rouge
                Navigation.findNavController(view).navigate(R.id.action_whiteFragment_to_redFragment)
            }else{
                //TODO si non rose
                Navigation.findNavController(view).navigate(R.id.action_whiteFragment_to_pinkFragment)
            }

        }

    }
}