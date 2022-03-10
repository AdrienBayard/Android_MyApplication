package com.example.mod7compteur

import android.view.View
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CompteurViewModel: ViewModel() {
    val compteur : MutableLiveData<Int> = MutableLiveData(0)


/*    fun plusUn() {
        compteur ++
    }
    fun plusCinq() {
        compteur +=5
    }
    fun moinsCinq() {
        compteur -= 5
    }
    fun plusDix() {
        compteur += 10
    }
    fun moinsDix() {
        compteur -= 10
    }*/


    // ou autre méthode
    fun optionPlus(i :Int){
/*        if(compteur+i > Int.MAX_VALUE)
            return
        compteur += i*/
        compteur.value = compteur.value?.plus(i)
    }

    fun optionMoins(i :Int){
/*        if(compteur-i < Int.MIN_VALUE)
            return
        compteur -= i*/
        compteur.value = compteur.value?.minus(i)

    }



}