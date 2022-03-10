package com.example.mod6intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Intent Explicite = On connait déjà la destination
        var targetIntent = Intent(this, TargetActivity::class.java) //on récupère le path
        targetIntent.putExtra("id", 42)
        startActivity(targetIntent)

    }
}