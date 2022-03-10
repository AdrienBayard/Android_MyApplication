package com.example.mod5tp02unehistoire

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.mod5tp02unehistoire.databinding.FragmentStoryBinding


class StoryFragment : Fragment() {

    lateinit var fsb: FragmentStoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fsb = DataBindingUtil.inflate(inflater, R.layout.fragment_story, container, false)
        return fsb.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val storyFragmentArgs = arguments?.let { StoryFragmentArgs.fromBundle(it) }
        fsb. story = storyFragmentArgs?.story
    }
}