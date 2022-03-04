package com.example.mod5nav.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.mod5nav.R


class HomeFragment : Fragment() {
    private val TAG = "HomeFragment"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //if(arguments !=null){
        //    var args: HomeFragmentArgs = HomeFragmentArgs.fromBundle(requireArguments())
        //}
        val args2 = arguments?.let { HomeFragmentArgs.fromBundle(it) }
        Log.i(TAG, "onViewCreated: " + args2?.user?.email +":" + args2?.user?.password)
        view.findViewById<TextView>(R.id.textView).setText("Bonjour : " + args2?.user?.email)

    }
}








