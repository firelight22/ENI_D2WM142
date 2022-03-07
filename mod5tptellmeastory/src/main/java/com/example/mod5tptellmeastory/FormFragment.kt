package com.example.mod5tptellmeastory

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import com.example.mod5tptellmeastory.bo.Histoire
import com.example.mod5tptellmeastory.databinding.FragmentFormBinding


class FormFragment : Fragment() {
    lateinit var ffb : FragmentFormBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        ffb = DataBindingUtil.inflate(inflater, R.layout.fragment_form, container, false)
        return ffb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ffb.buttonStory.setOnClickListener {
            val navStory  =
                FormFragmentDirections.actionFormFragmentToStoryFragment(Histoire(
                    ffb.editTextPrenom.text.toString(),
                    ffb.editTextLieu.text.toString(),
                ))
            Navigation.findNavController(it).navigate(navStory)


        }

    }
}