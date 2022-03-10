package com.example.mod5nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.mod5nav.databinding.FragmentSignInBinding

class SignInFragment : Fragment() {

    lateinit var fsb: FragmentSignInBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fsb = DataBindingUtil.inflate(inflater, R.layout.fragment_sign_in, container, false)
        return fsb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // écriture sans le mail ni mdp
/*        fsb.buttonSignIn.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_signInFragment_to_homeFragment))*/

        // écriture avec demande d'entrer mail et mdp pour accéder à la suite
        fsb.buttonSignIn.setOnClickListener {
            if (fsb.editTextTextEmailAddress.text.isNotEmpty() &&
                fsb.editTextTextPassword.text.isNotEmpty()
            ) {

                var dir = SignInFragmentDirections.actionSignInFragmentToHomeFragment(
                    User(email = fsb.editTextTextEmailAddress.text.toString(),
                    password = fsb.editTextTextPassword.text.toString()),
                )
                Navigation.findNavController(it).navigate(dir)
            }

        }
    }
}