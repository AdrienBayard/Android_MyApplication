package com.example.mod5nav

import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class HomeFragment : Fragment() {
    private val TAG = "HomeFragment"  // logt+entrée (on enlève le "const")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

/*        // on crée une variable "args" de type HomeFragmentArgs. Mais arguments peut être null: donc on vérifie avant
        if(arguments != null) {
            var args: HomeFragmentArgs = HomeFragmentArgs.fromBundle(requireArguments())
        }*/

        // même chose que la ligne ci-dessus, le let vérifie le non null
        val args2 = arguments?.let{HomeFragmentArgs.fromBundle(it)}

        //Log.i(TAG, "onViewCreated: " + args2?.email +":" + args2?.password) //logi+entrée
        Log.i(TAG, "onViewCreated: " + args2?.user?.email +":" + args2?.user?.password) //logi+entrée
        view.findViewById<TextView>(R.id.textviewHome).setText("Bonjour: "+args2?.user?.email)
    }
}