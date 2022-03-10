package com.example.mod4demos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textView = findViewById<TextView>(R.id.textView)
        var editText = findViewById<EditText>(R.id.editText)
        var ratingBar = findViewById<RatingBar>(R.id.ratingBar)
        textView.text = "Hello"
        editText.setText("Comment allez-vous?")
        ratingBar.rating = 3f

        var button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener { onClickButton(it) }

    }

    fun onClickButton(view: View){
        Toast.makeText(this, "J'ai appuyé sur un bouton", Toast.LENGTH_SHORT).show()    //toast -> ligne auto-générée

    }

}