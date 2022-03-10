package com.example.mod10recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listTel : ArrayList<Telephone> = arrayListOf(
            Telephone("Apple","iPhone 13 Pro Max", 512,"bleu"),
            Telephone("Apple","iPhone 12 Pro Max", 256,"vert"),
            Telephone("Apple","iPhone 13 Pro", 512,"bleu"),
            Telephone("Apple","iPhone 13 Pro ", 256,"bleu"),
            Telephone("Apple","iPhone SE", 64,"noir"),
            Telephone("OnePlus","7 pro", 256,"bleu"),
            Telephone("OnePlus","8 pro", 256,"noir"),
            Telephone("OnePlus","9 pro", 256,"gris"),
            Telephone("Wiko","U30", 4,"bleu"),
            Telephone("Huawei","P40 pro", 8,"noir"),
        )

        // Récupérer la RV
        val rvTel = findViewById<RecyclerView>(R.id.rvTelephones)

        //Dire à la RV comment elle doit afficher ses items
        // LinearLayoutManager affiche tousnles items les un en dessous des autres
        // par défaut LinearLayoutManager affiche lesitems en vertical
        rvTel.layoutManager = LinearLayoutManager(this)

        // Associer l'adapter à noter rv
        rvTel.adapter = TelephoneAdapter(listTel)


    }
}