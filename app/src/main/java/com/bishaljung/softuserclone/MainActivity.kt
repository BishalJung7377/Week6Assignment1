package com.bishaljung.softuserclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import com.bishaljung.softuserclone.Fragments.AddStdntFragment
import com.bishaljung.softuserclone.Fragments.HomeFragment
import com.bishaljung.softuserclone.Fragments.AboutUsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var fragmentcont: FrameLayout
    private lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragmentcont = findViewById(R.id.fragmentcont)
        bottomNav = findViewById(R.id.bottomNav)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)
        bottomNav.setOnNavigationItemSelectedListener(navListener)

        supportFragmentManager.beginTransaction().replace(R.id.fragmentcont, HomeFragment())
            .commit()
    }

    private val navListener =
        BottomNavigationView.OnNavigationItemSelectedListener {
                item ->
            var selectedFragment: Fragment? = null
            when (item.itemId) {
                R.id.nav_home -> selectedFragment = HomeFragment()
                R.id.nav_add -> selectedFragment = AddStdntFragment()
                R.id.nav_user -> selectedFragment = AboutUsFragment()
            }
            if (selectedFragment != null) {
                getSupportFragmentManager().beginTransaction().replace(
                    R.id.fragmentcont,
                    selectedFragment
                ).commit()
            }
            true
        }
}