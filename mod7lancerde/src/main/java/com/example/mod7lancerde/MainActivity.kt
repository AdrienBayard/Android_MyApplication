package com.example.mod7lancerde

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mod7lancerde.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var vm: DeViewModel
    lateinit var amb: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = DataBindingUtil.setContentView(this, R.layout.activity_main)
        vm = ViewModelProvider(this).get(DeViewModel::class.java)
        amb.lifecycleOwner = this
        amb.vm = vm
    }

    fun onClick(p0: View?) {
        // penser à bien ajouter android:onClick="onClick" dans le activity_main.xml button
        when(p0?.id){
            R.id.button6faces -> vm.lanceDeSix()
            R.id.button20faces -> vm.lanceDeVingt()
            R.id.button100faces -> vm.lanceDeCent()
        }
    }


}