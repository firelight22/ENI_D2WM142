package com.example.mod5nav.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.mod5nav.R
import com.example.mod5nav.databinding.FragmentSignInBinding


class SignInFragment : Fragment() {

    lateinit var fsb : FragmentSignInBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fsb = DataBindingUtil.inflate(inflater,R.layout.fragment_sign_in,container,false)
        return fsb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fsb.buttonSignIn.setOnClickListener{
            if(fsb.editTextEmail.text.isNotEmpty() &&
                fsb.editTextPassword.text.isNotEmpty()
            )
            Navigation.findNavController(it).navigate(R.id.action_signInFragment_to_homeFragment3)

        }

    }
}












