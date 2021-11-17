package com.example.coffee

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Mensaje : AppCompatActivity() {
    lateinit var boton: Button
    lateinit var caja: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mensaje)
        boton = findViewById(R.id.button5)
        caja = findViewById(R.id.textView)
    }
    fun onClickboton1(view: View){
        MostrarMensaje("Pulsalte el boton")
        caja.text = "El Richard"
    }

    private fun MostrarMensaje(mensage: String){
        Toast.makeText(this, mensage, Toast.LENGTH_SHORT).show()
    }
}