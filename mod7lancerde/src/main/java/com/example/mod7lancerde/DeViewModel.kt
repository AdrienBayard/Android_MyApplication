package com.example.mod7lancerde

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DeViewModel: ViewModel() {
    val de : MutableLiveData<Byte> = MutableLiveData(0)
    // on utilise byte plutot que int afin d'économiser de la ressource (byte va de -128 à + 128)

    fun lanceDeSix(){
        val randomSix = (1..6).random().toByte()
        de.value = randomSix
    }

    fun lanceDeVingt(){
        val randomVingt = (1..20).random().toByte()
        de.value = randomVingt
    }

    fun lanceDeCent(){
        val randomCent = (1..100).random().toByte()
        de.value = randomCent
    }


}