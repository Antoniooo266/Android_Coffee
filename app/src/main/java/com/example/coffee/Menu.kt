package com.example.coffee

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_menu)

        val boton1 = findViewById<Button>(R.id.button2)

        boton1.setOnClickListener {

            val cambiando = Intent(this, Mensaje::class.java)

            startActivity(cambiando)

        }

        val boton2 = findViewById<Button>(R.id.button3)

        boton2.setOnClickListener {

            val cambiando = Intent(this, Calc::class.java)

            startActivity(cambiando)

        }

        val boton3 = findViewById<Button>(R.id.button7)

        boton3.setOnClickListener {

            val cambiando = Intent(this, Arrays_Letras::class.java)

            startActivity(cambiando)

        }
    }
}