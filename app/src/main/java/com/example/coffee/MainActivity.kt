package com.example.coffee

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val boton1 = findViewById<Button>(R.id.button)

        boton1.setOnClickListener {

            val cambiando = Intent(this, Menu::class.java)

            startActivity(cambiando)

        }
    }
}