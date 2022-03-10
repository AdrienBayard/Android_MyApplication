package com.example.mod6nemoubliepas

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.telephony.SmsManager
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityCompat
import androidx.databinding.DataBindingUtil
import com.example.mod6nemoubliepas.databinding.FragmentRelanceBinding


class RelanceFragment : Fragment() {
    //private static final String REQUEST_CODE_RELANCE = 456;
    companion object {
        private const val REQUEST_CODE_RELANCE : Int = 456
    }

    lateinit var frb : FragmentRelanceBinding;

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        frb = DataBindingUtil.inflate(inflater,R.layout.fragment_relance, container, false)
        return frb.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        frb.buttonRelance.setOnClickListener {
            if(ActivityCompat.checkSelfPermission(
                    requireContext(),
                    Manifest.permission.SEND_SMS) == PackageManager.PERMISSION_GRANTED ){
                sendSmsRelance()
            }else
                ActivityCompat.requestPermissions(
                    requireActivity(),
                    arrayOf(Manifest.permission.SEND_SMS),
                    Companion.REQUEST_CODE_RELANCE
                )
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == REQUEST_CODE_RELANCE && grantResults[0] == PackageManager.PERMISSION_GRANTED ) {
            // for (int i = 0; i<=9: i++)
            for(i in 0..9){
                sendSmsRelance()
            }
        }
    }

    private fun sendSmsRelance() {
        SmsManager.getDefault().sendTextMessage(
            frb.editTextPhone.text.toString(),
            null,
            "N'oublie pas que tu as qqch à me ramener :)",
            null, null
        )
        startActivity(
            Intent(
                Intent.ACTION_VIEW,
                Uri.parse("sms:${frb.editTextPhone.text.toString()}")
            )
        )
        //On demande la permission d'envoyer des SMS
    }


}