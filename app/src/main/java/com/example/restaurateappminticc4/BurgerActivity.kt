package com.example.restaurateappminticc4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class BurgerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_burger)
    }

    fun llamarHambFragment( view: View ) {
        supportFragmentManager.beginTransaction()
            .setReorderingAllowed(true)
            .add(R.id.fragcontainer, FragmentBurger:: class.java, null,"hamburgesaF")
            .commit()
    }


}