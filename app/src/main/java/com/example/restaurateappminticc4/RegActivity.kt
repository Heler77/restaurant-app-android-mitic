package com.example.restaurateappminticc4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RegActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)
    }
    fun ingresar1(btnlogin: View) {
        val ingreso = Intent( this,logActivity::class.java )
        startActivity(ingreso)
    }
}