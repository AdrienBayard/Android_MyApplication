package com.example.mod7compteur

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mod7compteur.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener{
    // View.OnClickListener puis sur class MainActivity: import member,
    // ça génère la partie en bas override fun onClick

    lateinit var vm : CompteurViewModel  //vm = viewModel
    lateinit var amb: ActivityMainBinding
    //lateinit var textViewCompteur:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = DataBindingUtil.setContentView(this, R.layout.activity_main)
        vm = ViewModelProvider(this).get(CompteurViewModel::class.java)
        amb.lifecycleOwner = this //lyfecycleOwner participe au rafraichissement de l'UI en allant travailler avec le xml
        amb.vm = vm

/*        val buttonPlusUn = findViewById<Button>(R.id.buttonPlusUn)
        textViewCompteur = findViewById<TextView>(R.id.textViewCompteur)
        textViewCompteur.text = vm.compteur.toString()

        amb.buttonPlusUn.setOnClickListener {
            vm.plusUn()
            amb.vm = vm
        }*/
    }

    // On écoute les boutons avec OnClick (cf: ajout ligne  android:onClick="onClick" dans activity_main.xml

    override fun onClick(p0: View?) {
        when(p0?.id){
/*            R.id.buttonPlusCinq -> vm.plusCinq()
            R.id.buttonMoinsCinq -> vm.moinsCinq()
            R.id.buttonPlusDix -> vm.plusDix()
            R.id.buttonMoinsDix -> vm.moinsDix()*/
            // ou autre méthode
            R.id.buttonPlusCinq -> vm.optionPlus(5)
            R.id.buttonMoinsCinq -> vm.optionMoins(5)
            R.id.buttonPlusDix -> vm.optionPlus(10)
            R.id.buttonMoinsDix -> vm.optionMoins(10)
            R.id.buttonOptionMoins -> vm.optionMoins(Integer.parseInt(amb.editTextValeurOptionnelle.text.toString()))
            R.id.buttonOptionPlus -> vm.optionPlus(Integer.parseInt(amb.editTextValeurOptionnelle.text.toString()))
        }
            // amb.vm = vm
            // cette ligne n'est plus nécessaire avec l'ajout du MutableLiveData sur "compteurViewModel"
            // plus besoin de recharger la page car le compteur est devenue un LiveData
    }


}