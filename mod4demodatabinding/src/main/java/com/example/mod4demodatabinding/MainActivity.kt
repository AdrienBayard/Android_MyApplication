package com.example.mod4demodatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mod4demodatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var activityMainBinding: ActivityMainBinding;

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
            activityMainBinding.user = Utilisateur(1, "Bruce", "Wayne")




/*            val utilisateur = Utilisateur(0, "Cosson", "Anthony")
            activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
            activityMainBinding.utilisateurACharger = utilisateur
            activityMainBinding.btnValider.setOnClickListener {
                Toast.makeText(this@MainActivity, amb.tvNom.text, Toast.LENGTH_SHORT).show()
            }*/

        }





}