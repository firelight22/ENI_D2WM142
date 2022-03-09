package com.example.mod7lancerdes

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LancerDeViewModel : ViewModel() {
    val resultat : MutableLiveData<Byte> = MutableLiveData(0)

    fun lancerDe(){
        resultat.value = (1..6).random().toByte()
    }
    fun lancerDeRP(){
        resultat.value = (1..12).random().toByte()
    }
}