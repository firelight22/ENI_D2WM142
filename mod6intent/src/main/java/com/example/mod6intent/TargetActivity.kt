package com.example.mod6intent

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.view.View
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat.getSystemService
import java.security.Permission
import java.util.jar.Manifest

class TargetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)
        var id = intent.getIntExtra("id",-1)

        val button =findViewById<Button>(R.id.buttonCall)

        button.setOnClickListener {
            ActivityCompat.requestPermissions(this,
                arrayOf(android.Manifest.permission.CALL_PHONE),
                // new ArrayList<String>(){android.Manifest.permission.CALL_PHONE}
                4242
            )

        }
        val buttonMap =findViewById<Button>(R.id.buttonViewGeo)
        buttonMap.setOnClickListener {
            val intentMap = Intent(Intent.ACTION_VIEW, Uri.parse("geo:41.45,-0.13"))
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
            val intentCall = Intent(Intent.ACTION_CALL, Uri.parse("tel:118218"))
            startActivity(intentCall)

        }
    }
}