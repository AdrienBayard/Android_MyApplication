package com.example.mod9room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        thread{
            val db: AppDatabase = AppDatabase.getInstance(this@MainActivity)

            db.personneDAO().insert(Personne(id = 1,"Musk", "Elon"))

            Log.i("MainActivity", "onCreate: "+
            db.personneDAO().getById(1).prenom +
            db.personneDAO().getById(1).nom
            )
        }
    }
}