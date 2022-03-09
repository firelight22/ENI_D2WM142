package com.example.mod7plusoumoins

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CompteurViewModel : ViewModel(){
    val compteur : MutableLiveData<Int> = MutableLiveData(0)

    fun moins(i : Int){
        //if(compteur-i < Int.MIN_VALUE)
        //    return
        compteur.value = compteur.value?.minus(i)
    }
    fun plus(i : Int){
        //Log.i("compteur view model", "plus: " +Int.MAX_VALUE)
        //if(compteur+i > Int.MAX_VALUE)
        //    return
        compteur.value = compteur.value?.plus(i)

    }
}