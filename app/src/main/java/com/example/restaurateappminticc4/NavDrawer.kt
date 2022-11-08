package com.example.restaurateappminticc4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView

class NavDrawer : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nav_drawer)

        setSupportActionBar(findViewById(R.id.toolbar)) //barra

        val drawerLayout:DrawerLayout = findViewById(R.id.drawerLayout)
        val NavigationView: NavigationView = findViewById(R.id.navView)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentonav) as NavHostFragment

        val navController = navHostFragment.navController

        appBarConfiguration = AppBarConfiguration(setOf(R.id.nav_acerca), drawerLayout)

        setupActionBarWithNavController(navController, appBarConfiguration)

        NavigationView.setupWithNavController(navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentonav) as NavHostFragment

        val navController = navHostFragment.navController

        return navController.navigateUp(appBarConfiguration)||super.onSupportNavigateUp()
    }


}