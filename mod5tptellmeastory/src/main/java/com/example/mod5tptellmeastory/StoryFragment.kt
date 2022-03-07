package com.example.mod5tptellmeastory

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.mod5tptellmeastory.bo.Histoire
import com.example.mod5tptellmeastory.databinding.FragmentStoryBinding


class StoryFragment : Fragment() {
    lateinit var fsb  : FragmentStoryBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fsb = DataBindingUtil.inflate(inflater, R.layout.fragment_story, container, false)
        return fsb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val storyFragmentArgs = arguments?.let { StoryFragmentArgs.fromBundle(it) }
        fsb.story = storyFragmentArgs?.story
    }
}










