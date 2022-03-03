package com.example.mod4tpvraifaux

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mod4tpvraifaux.bo.QuestionReponse
import com.example.mod4tpvraifaux.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var amb : ActivityMainBinding
    val arrQR = mutableListOf<QuestionReponse>()
    var score:Int = 0
    var index:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = DataBindingUtil.setContentView(this,R.layout.activity_main)
        feedArray()
        amb.maxNbQ = arrQR.size
        askQuestion()

    }

    fun feedArray(){
        arrQR.add(QuestionReponse("Putine est-il une belle personne?",true))
        arrQR.add(QuestionReponse("Le gras c'est la vie?",true))
        arrQR.add(QuestionReponse("Paris est elle une captiale",true))
        arrQR.add(QuestionReponse("Le covid est-il un virus?",false))
        arrQR.add(QuestionReponse("Le peuple egyptien est il le plus grand de tout les peuples",true))
        arrQR.add(QuestionReponse("Les chats sont-ils des nuisibles",true))
        arrQR.add(QuestionReponse("RT france est-il un média de propagande",true))
        arrQR.add(QuestionReponse("Sputnik est-il un média de propagande",true))
        arrQR.add(QuestionReponse("CNN est-il un média de propagande",true))
    }

    fun askQuestion(){
        amb.indexQ = index +1
        amb.score = score
        amb.qr = arrQR[index]
    }
}