package com.example.mod4tpvraifaux

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
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
        amb.buttonFalse.setOnClickListener { checkAnswers(it) }
        amb.buttonTrue.setOnClickListener { checkAnswers(it) }
    }

    fun checkAnswers(v : View){
        val answerUser : Boolean = v.id == R.id.buttonTrue
        if(answerUser == arrQR[index].reponse){
            score++
            index++
        }else{
            index++
        }
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
        amb.score = score
        if(index == arrQR.size){
            Toast.makeText(this, "Questionnaire finit", Toast.LENGTH_SHORT).show()
            amb.buttonTrue.isEnabled = false
            amb.buttonFalse.isEnabled = false
            return
        }
        amb.indexQ = index +1
        amb.qr = arrQR[index]
    }
}