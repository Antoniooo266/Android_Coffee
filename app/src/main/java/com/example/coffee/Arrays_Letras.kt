package com.example.coffee

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Arrays_Letras : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arrays_letras)
        val mostrarVocal=findViewById<TextView>(R.id.textView2)
        val mostarConsonante=findViewById<TextView>(R.id.textView3)
        val separar=findViewById<Button>(R.id.button6)
        val mostrarLetras=findViewById<TextView>(R.id.textView)
        val letras : MutableList<String> = ArrayList()
        val vocales : MutableList<String> = ArrayList()
        val consonantes : MutableList<String> = ArrayList()
        val letra='a'..'z'

        for (i in 0..15){
            letras.add(letra.random().toString())
        }
        mostrarLetras.text=letras.toString()

        separar.setOnClickListener {

            for (i in 0..letras.size-1){
                if (letras[i]=="a"||letras[i]=="e"||letras[i]=="i"||letras[i]=="o"||letras[i]=="u"){
                    vocales.add(letras[i])
                }else{
                    consonantes.add(letras[i])
                }
            }
            mostarConsonante.text=consonantes.toString()
            mostrarVocal.text=vocales.toString()
        }
    }


}