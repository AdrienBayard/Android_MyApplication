package com.example.mod12requetes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import okhttp3.*
import java.io.IOException


// ajouter dans build.gradle:   'com.squareup.okhttp3:okhttp:4.9.3'
// ajouter dans AndroidManifest.xml:        <uses-permission android:name="android.permission.INTERNET"/>

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val okHttpClient = OkHttpClient()
        val requestListPlanets = Request.Builder()
            .url("https://swapi.dev/api/planets")
            .build()  // .build pour retourner la requête suite au Request.Builder

        okHttpClient.newCall(requestListPlanets).enqueue(object : Callback{
            //enqueue permet de mettre en file d'attente afin de ne pas bloquer l'UI

            override fun onFailure(call: Call, e: IOException) {
                Log.e("MainActivity", "onFailure: ")
            }

            override fun onResponse(call: Call, response: Response) {
                Log.i("MainActivity", "onResponse: " + response.body?.string())
            }
        })
    }
}