package com.example.mod6intent

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.ActivityCompat

class TargetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)
        var id = intent.getIntExtra("id", -1) //getIntExtra car on recherche un int

        val button = findViewById<Button>(R.id.buttonCall)
        button.setOnClickListener {
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CALL_PHONE), 4242)

        }

        val buttonMap = findViewById<Button>(R.id.buttonViewGeo)
        buttonMap.setOnClickListener {
            var intentMap = Intent(Intent.ACTION_VIEW, Uri.parse("geo: 38.45;-0.13"))
            startActivity(intentMap)
        }


    }


    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == 4242 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
            var intentCall = Intent(Intent.ACTION_CALL, Uri.parse("tel:0710203090"))
            startActivity(intentCall)
        }
    }
}