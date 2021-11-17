package com.example.coffee

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Fibonacci : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fibonacci)
        val calcular=findViewById<Button>(R.id.button9)
        val mostar = findViewById<TextView>(R.id.textView5)
        val fibonacci : MutableList<Int> = ArrayList()

        fibonacci.add(0)
        fibonacci.add(1)

        calcular.setOnClickListener {

            fibonacci.add(fibonacci[fibonacci.size-2]+fibonacci[fibonacci.size-1])
            if (fibonacci.size>=25){
                mostar.text=":("
                calcular.setEnabled(false)
            }
            mostar.text=fibonacci.toString()

        }
    }
}