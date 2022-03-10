package com.example.mod4tp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.mod4tp1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var amb: ActivityMainBinding;
    val arrQR = mutableListOf<QuestionReponse>()//tableau de questions réponses, mutablelistof: la liste peut évoluer
    var score:Int = 0
    var index:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        amb = DataBindingUtil.setContentView(this, R.layout.activity_main)
        feedArray()
        amb.maxNbQ = arrQR.size
        askQuestions()
        amb.buttonFalse.setOnClickListener { checkAnswers(it) }
        amb.buttonTrue.setOnClickListener { checkAnswers(it) }

    }
    // (v: View) fonction qui réagit à ce qui se passe sur la vue
    fun checkAnswers(v: View){
        val answerUser : Boolean = v.id == R.id.buttonTrue        // on vérifie si user appuye sur true
        if(answerUser == arrQR[index].reponse){   // si answerUser match avec reponse de la question, alors: score++ et index++
            score++
            index++
        }else{
            index++
        }
        askQuestions()
    }

   // fonction avec ensemble de questions réponses
   fun feedArray(){
       arrQR.add(QuestionReponse("Potine est-il une belle personne?", false))
       arrQR.add(QuestionReponse("Le gras, c'est la vie?", true))
       arrQR.add(QuestionReponse("Bleu = vert?", false))
       arrQR.add(QuestionReponse("Le bleu est il bleu?", true))
       arrQR.add(QuestionReponse("1 + 1 = 7 ?", false))
       arrQR.add(QuestionReponse("12 + 12 = 24 ?", true))

   }

   fun askQuestions(){
       amb.score = score
       if(index == arrQR.size){
           Toast.makeText(this, "Il n'y a plus de questions!", Toast.LENGTH_SHORT).show()
           amb.buttonTrue.isEnabled = false
           amb.buttonFalse.isEnabled = false
          return
       }
       amb.indexQ = index +1
       amb.qr = arrQR[index]
   }


}