package com.example.mod7compteur

import android.view.View
import androidx.lifecycle.ViewModel

class CompteurViewModel : ViewModel(){
    public var compteur = 0

    fun plusUn() {
        compteur++
    }
}