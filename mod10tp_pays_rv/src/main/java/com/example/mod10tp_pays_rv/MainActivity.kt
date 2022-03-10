package com.example.mod10tp_pays_rv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listPays = arrayListOf(Pays("France",65,540000,"€","https://flagcdn.com/160x120/fr.png")
            ,Pays("Belgique",11,30000,"€","https://flagcdn.com/160x120/be.png")
            ,Pays("Suisse",9,41000,"CHF","https://flagcdn.com/160x120/ch.png")
            ,Pays("Espagne",47,505000,"€","https://flagcdn.com/160x120/es.png")
            ,Pays("Italie",60,301000,"€","https://flagcdn.com/160x120/it.png")
            ,Pays("Corée du Nord",25,120000,"KPW","https://flagcdn.com/160x120/kp.png")
            ,Pays("Ukraine",40,603000,"UAH","https://flagcdn.com/160x120/ua.png")
            ,Pays("Corée du Sud",52,90000,"KRW","https://flagcdn.com/160x120/kr.png")
            ,Pays("Chine",1500,9635000,"YUAN","https://flagcdn.com/160x120/cn.png")
            ,Pays("Inde",1400,3287000,"INR","https://flagcdn.com/160x120/in.png")
            ,Pays("Autriche",9,83000,"€","https://flagcdn.com/160x120/at.png")
            ,Pays("Bulgarie",7,110000,"LEV","https://flagcdn.com/160x120/bg.png")
            ,Pays("Moldavie",4,33000,"LEU","https://flagcdn.com/160x120/md.png")
            ,Pays("Estonie",1,45000,"€","https://flagcdn.com/160x120/ee.png")
            ,Pays("Norvège",5,386000,"NOK","https://flagcdn.com/160x120/no.png")
            ,Pays("Luxembourg",1,2586,"€","https://flagcdn.com/160x120/lu.png")
            ,Pays("Suède",10,449000,"€","https://flagcdn.com/160x120/se.png")
            ,Pays("Allemagne",84,357000,"€","https://flagcdn.com/160x120/de.png")
            ,Pays("Pays-Bas",17,42000,"€","https://flagcdn.com/160x120/nl.png")
            ,Pays("Biélorussie",9,207000,"RUB","https://flagcdn.com/160x120/by.png")
            ,Pays("Albanie",3,28000,"LEK","https://flagcdn.com/160x120/al.png")
            ,Pays("Croatie",4,56000,"KUNA","https://flagcdn.com/160x120/hr.png")
            ,Pays("Finlande",5,338000,"€","https://flagcdn.com/160x120/fi.png")
            ,Pays("Irlande",5,70000,"€","https://flagcdn.com/160x120/ir.png")
            ,Pays("Slovénie",2,20000,"€","https://flagcdn.com/160x120/si.png")
            ,Pays("Grèce",10,131000,"€","https://flagcdn.com/160x120/gr.png")
            ,Pays("Portugal",11,92000,"€","https://flagcdn.com/160x120/pt.png")
            ,Pays("Pologne",38,312000,"ZLOTI","https://flagcdn.com/160x120/pl.png")
            ,Pays("République Tchèque",11,78000,"CZK","https://flagcdn.com/160x120/cz.png")
            ,Pays("Hongrie",10,93000,"FORINT","https://flagcdn.com/160x120/hu.png")
            ,Pays("Grande Bretagne",68,262000,"£","https://flagcdn.com/160x120/gb.png")
            ,Pays("Roumanie",19,237000,"LEU","https://flagcdn.com/160x120/ro.png"))

        val rvPays = findViewById<RecyclerView>(R.id.rvPays)
        rvPays.layoutManager = LinearLayoutManager(this)
        rvPays.adapter = PaysAdapter(listPays)

        //bien mettre la permission d'utiliser des liens internet dans le manifest (pour les drapeaux)
        //     <uses-permission android:name="android.permission.INTERNET"/>

    }
}