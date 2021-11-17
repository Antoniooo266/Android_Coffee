package com.example.coffee

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class Arrays_Numeros : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arrays_numeros)
        val calcular=findViewById<Button>(R.id.button8)
        val MostrarNumeros=findViewById<TextView>(R.id.textView6)
        val MostarPares=findViewById<TextView>(R.id.textView7)
        val MostrarImpares=findViewById<TextView>(R.id.textView8)
        val Numeros:MutableList<Int> = ArrayList()
        val Pares:MutableList<Int> = ArrayList()
        val Impares:MutableList<Int> = ArrayList()

        for (i in 0..25){
            Numeros.add(Random.nextInt(1, 100))
        }
        MostrarNumeros.text=Numeros.toString()
        calcular.setOnClickListener {
            for (i in 0..Numeros.size-1){
                if (Numeros[i]/2==0){
                    Pares.add(Numeros[i])
                }else{
                    Impares.add(Numeros[i])
                }

            }
            MostarPares.text=Pares.toString()
            MostrarImpares.text=Impares.toString()
        }
    }
}