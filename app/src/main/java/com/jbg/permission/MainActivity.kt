package com.jbg.permission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jbg.permissionfragment.PermissionLogger

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        PermissionLogger.printMessage("hh")

    }
}
