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

    lateinit var fw: FragmentWhiteBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fw = DataBindingUtil.inflate(inflater, R.layout.fragment_white, container, false)
        return  fw.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fw.buttonWhite.setOnClickListener {
            if(
                fw.editTextWhite.text.isNotEmpty()
                &&
                fw.editTextWhite.text.toString().hashCode()/1000000 > 150
                ){
                    Navigation.findNavController(it).navigate(R.id.action_whiteFragment_to_redFragment)
            }else{
                    Navigation.findNavController(it).navigate(R.id.action_whiteFragment_to_pinkFragment)
            }
        }

    }


}