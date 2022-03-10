package com.example.generator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var editTextMinimum: EditText
    lateinit var editTextMaximum: EditText
    lateinit var buttonGenerate: Button
    lateinit var textViewResultatGenerate: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textViewTitre = findViewById<TextView>(R.id.textViewTitre)
        editTextMinimum = findViewById<EditText>(R.id.editTextMinimum)
        editTextMaximum = findViewById<EditText>(R.id.editTextMaximum)
        var textViewResultat = findViewById<TextView>(R.id.textViewResultat)
        //var textViewResultatGenerate = findViewById<TextView>(R.id.textViewResultatGenerate)
        buttonGenerate = findViewById<Button>(R.id.buttonGenerate)

        textViewTitre.text = "True Random Number Generator"
        editTextMinimum.hint = "Minimum"
        editTextMaximum.hint = "Maximum"
        textViewResultat.text = "Résultat: "
        //var textViewResultatGenerate =
        buttonGenerate.setOnClickListener { computeRandom() }


    }

    fun computeRandom(){
        var minString = editTextMinimum.text.toString()  //.text.toString : .text permet de récuperer de l'éditable et .string le contenu
        var maxString = editTextMaximum.text.toString()
        var randomInt = Random.nextInt(minString.toInt(), maxString.toInt())
        textViewResultatGenerate.text = randomInt.toString()


    }

}