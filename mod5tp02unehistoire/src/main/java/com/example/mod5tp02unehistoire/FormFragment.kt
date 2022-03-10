package com.example.mod5tp02unehistoire

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import com.example.mod5tp02unehistoire.databinding.FragmentFormBinding


class FormFragment : Fragment() {

    lateinit var ffb : FragmentFormBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        ffb = DataBindingUtil.inflate(inflater, R.layout.fragment_form, container, false)
        return ffb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ffb.formButton.setOnClickListener {
        val navStory =
            FormFragmentDirections.actionBeginFragmentToHistoireFragment(
                Histoire(
                    ffb.editTextFormPrenom.text.toString(),
                    ffb.editTextFormLieu.text.toString(),
                )
            )
            Navigation.findNavController(it).navigate(navStory)

        }
    }
}