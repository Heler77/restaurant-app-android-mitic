package com.example.restaurateappminticc4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class logActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log)
    }

    fun ingresar(btnlogin: View) {
        val ingreso = Intent( this,MainActivity::class.java )
        startActivity(ingreso)
    }

    fun registrar(btnlogin: View) {
        val registro = Intent( this,RegActivity::class.java )
        startActivity(registro)
    }

}