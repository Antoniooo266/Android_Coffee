package com.example.coffee

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.lang.Integer.parseInt

class Calc : AppCompatActivity() {
    lateinit var spinnerdeoperaciones: Spinner
    lateinit var mostraresultado: TextView
    lateinit var num1: EditText
    lateinit var num2: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc)
        // spinnerdeoperaciones!!.SetOnItemSelectedListener(this)
        spinnerdeoperaciones = findViewById(R.id.spinnerdeoperaciones)
        num1 = findViewById(R.id.textnum1)
        num2 = findViewById(R.id.textnum2)
        var auxnum1: Int = 0
        var auxnum2: Int = 0
        var resultado: Int = 0
        mostraresultado = findViewById(R.id.textView3)
        val arrayparaspinner = mutableListOf<String>("Elige:","Sumar", "Restar","Multiplicar","Dividir","Resto")
        if (spinnerdeoperaciones != null) {
            val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, arrayparaspinner)
            spinnerdeoperaciones.adapter = adapter

            spinnerdeoperaciones.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    /*Toast.makeText(this@CalculadoraActivity,
                        getString(R.string.text_elige) + " " +
                                "" + arrayparaspinner[position], Toast.LENGTH_SHORT).show()*/
                    //aquí va el código para la selección del spinner
                    when (arrayparaspinner[position]){
                        "Sumar" -> {
                            auxnum1=parseInt(num1.text.toString())
                            auxnum2=parseInt(num2.text.toString())
                            resultado=auxnum1+auxnum2
                            mostraresultado.text="El resultado de la suma es: "+resultado.toString()
                        }
                        "Restar" -> {
                            auxnum1=parseInt(num1.text.toString())
                            auxnum2=parseInt(num2.text.toString())
                            resultado=auxnum1-auxnum2
                            mostraresultado.text="El resultado de la resta es: "+resultado.toString()
                        }
                        "Multiplicar" -> {
                            auxnum1=parseInt(num1.text.toString())
                            auxnum2=parseInt(num2.text.toString())
                            resultado=auxnum1*auxnum2
                            mostraresultado.text="El resultado de la multi es: "+resultado.toString()
                        }
                        "Dividir" -> {
                            auxnum1=parseInt(num1.text.toString())
                            auxnum2=parseInt(num2.text.toString())
                            if (auxnum2 !=0){
                                resultado=auxnum1/auxnum2
                                mostraresultado.text="El resultado de la división es: "+resultado.toString()
                            }
                            else {
                                mostraresultado.text="Divisor cero. No puede obtenerse el resultado"
                            }
                        }
                        "Resto" -> {
                            if (auxnum2 !=0){
                                resultado=auxnum1%auxnum2
                                mostraresultado.text="El resultado de la división es: "+resultado.toString()
                                arrayparaspinner[position]="Elige"
                            }
                            else {
                                mostraresultado.text="Divisor cero. No puede obtenerse el resultado"
                                arrayparaspinner[position]="Elige"
                            }
                        }
                        else -> {
                            mostraresultado.text="Esperando que elijas..."
                            arrayparaspinner[position]="Elige"
                        }
                    }


                }
                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }//if !=null

        }//OnCreate
    }
}