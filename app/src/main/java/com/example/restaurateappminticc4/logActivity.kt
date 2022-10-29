package com.example.restaurateappminticc4

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class logActivity : AppCompatActivity() {
    private var etUsuario: EditText? = null
    private var etContrasena: EditText? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log)
        //setSupportActionBar(findViewById(R.id.barra))

        etUsuario = findViewById(R.id.etUsuario)
        etContrasena = findViewById(R.id.etContrasena)


    }

    fun ingresar(btnlogin: View) {

        val usuario: String = etUsuario!!.text.toString()
        val contra: String = etContrasena!!.text.toString()

        val botonPositivo = {
            xx:DialogInterface, yy:Int->
            val ingreso = Intent( this,MainActivity::class.java )
            startActivity(ingreso)
        }

        val botonNegativo = {
            nombre1:DialogInterface, nombre2:Int->

        }

        if ( usuario == "usuariox" && contra == "123" ){
            val dialog = AlertDialog.Builder(this)
                .setTitle("Bienvenido " + usuario)
                .setMessage("Quieres pasar al menú")
                .setPositiveButton("Confirmar", botonPositivo)
                .setNegativeButton("Cancelar", botonNegativo)
                .create().show()
        }
        else {
            val dialogW = AlertDialog.Builder(this)
                .setTitle(R.string.alert_title)
                .setMessage(R.string.alert_text)
                .create().show()
        }




       // if (etUsuario!!.text.toString()=="usuariox") {
         //   if (etContrasena!!.text.toString()=="123") {
           //     val ingreso = Intent( this,MainActivity::class.java )
             //   startActivity(ingreso)
           // }
       // }
       // else{
         //   val dialog = AlertDialog.Builder(this)
           //     .setTitle(R.string.alert_title)
             //   .setMessage(R.string.alert_text)
               // .create().show()
       // }

        //val ingreso = Intent( this,MainActivity::class.java )
        //startActivity(ingreso)
    }

    fun registrar(btnlogin: View) {
        val registro = Intent( this,RegActivity::class.java )
        startActivity(registro)
    }

}