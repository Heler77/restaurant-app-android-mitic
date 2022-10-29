package com.example.restaurateappminticc4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.barra))

        val floating: View = findViewById(R.id.fabatras)

        floating.setOnClickListener{ view->
            val ingreso = Intent( this,logActivity::class.java )
            startActivity(ingreso)
            //Snackbar.make(view,  "configuracion de la snack bar", Snackbar.LENGTH_SHORT).show()
        }




    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_barra, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when(item.itemId) {
        R.id.itmbuscar -> {
            Toast.makeText(this, "Selecion de buscar", Toast.LENGTH_SHORT).show()
            true
        }

        R.id.itmubicacion -> {
            Toast.makeText(this, "Selecion de Ubicacion", Toast.LENGTH_SHORT).show()
            true
        }

        else-> {
            super.onOptionsItemSelected(item)
        }

    }


}