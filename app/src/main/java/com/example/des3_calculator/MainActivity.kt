package com.example.des3_calculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private fun calcular(stri: String): Float {
        var str: String = stri
        var res: String = ""
        var lista = mutableListOf<Any>()
        var resultado: Float? = null
        for (crt in str) {
            if (crt.isDigit()) {
                //res = res + crt
            } else {
                if (crt == '.') {
                    //res = res + crt
                } else {
                    resultado = res.toFloatOrNull()
                    if (crt == '+') {
                        lista.add(str.substring(0, str.indexOf('+')).toFloat())
                        str = str.substring(str.indexOf('+') + 1)
                        lista.add('+')
                        continue
                    } else if (crt == '-') {
                        lista.add(str.substring(0, str.indexOf('-')).toFloat())
                        str = str.substring(str.indexOf('-') + 1)
                        lista.add('-')
                        continue
                    } else if (crt == 'x') {
                        lista.add(str.substring(0, str.indexOf('x')).toFloat())
                        str = str.substring(str.indexOf('x') + 1)
                        lista.add('x')
                        continue
                    } else if (crt == '/') {
                        lista.add(str.substring(0, str.indexOf('/')).toFloat())
                        str = str.substring(str.indexOf('/') + 1)
                        lista.add('/')
                        continue
                    }
                }
            }


        }


    }


    private lateinit var display: TextView
    private lateinit var resultado: TextView
    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var btn4: Button
    private lateinit var btn5: Button
    private lateinit var btn6: Button
    private lateinit var btn7: Button
    private lateinit var btn8: Button
    private lateinit var btn9: Button
    private lateinit var btn10: Button
    private lateinit var btn11: Button
    private lateinit var btn12: Button
    private lateinit var btn13: Button
    private lateinit var btn14: Button
    private lateinit var btn15: Button
    private lateinit var btn16: Button
    private lateinit var btn17: Button
    private lateinit var btn18: Button
    private lateinit var btn19: Button
    private lateinit var btn20: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        display = findViewById(R.id.display)
        resultado = findViewById(R.id.resultado)
        btn1 = findViewById(R.id.ponto)
        btn2 = findViewById(R.id.zero)
        btn3 = findViewById(R.id.apagar)
        btn4 = findViewById(R.id.igual)
        btn5 = findViewById(R.id.um)
        btn6 = findViewById(R.id.dois)
        btn7 = findViewById(R.id.tres)
        btn8 = findViewById(R.id.somar)
        btn9 = findViewById(R.id.quatro)
        btn10 = findViewById(R.id.cinco)
        btn11 = findViewById(R.id.seis)
        btn12 = findViewById(R.id.subtrair)
        btn13 = findViewById(R.id.sete)
        btn14 = findViewById(R.id.oito)
        btn15 = findViewById(R.id.nove)
        btn16 = findViewById(R.id.mult)
        btn17 = findViewById(R.id.limpar)
        btn18 = findViewById(R.id.maismenos)
        btn19 = findViewById(R.id.porcento)
        btn20 = findViewById(R.id.dividir)
        var str1: String = ""
        var str2: String = ""
        var resu1: Float? = null
        var resu2: Float? = null

        btn2.setOnClickListener { str1 = str1 + "0" }
        btn5.setOnClickListener { str1 = str1 + "1" }
        btn6.setOnClickListener { str1 = str1 + "2" }
        btn7.setOnClickListener { str1 = str1 + "3" }
        btn9.setOnClickListener { str1 = str1 + "4" }
        btn10.setOnClickListener { str1 = str1 + "5" }
        btn11.setOnClickListener { str1 = str1 + "6" }
        btn13.setOnClickListener { str1 = str1 + "7" }
        btn14.setOnClickListener { str1 = str1 + "8" }
        btn15.setOnClickListener { str1 = str1 + "9" }
        btn12.setOnClickListener { str1 = str1 + "-" }
        btn8.setOnClickListener { str1 = str1 + "+" }
        btn16.setOnClickListener { str1 = str1 + "x" }
        btn20.setOnClickListener { str1 = str1 + "/" }
        btn1.setOnClickListener { str1 = str1 + "." }
        btn17.setOnClickListener {
            str1 = "" //limpar}
            btn18.setOnClickListener {
                str1 = "" //maismenos}
                btn19.setOnClickListener {
                    str1 = "" //porcento}
                    btn4.setOnClickListener {
                        str1 = str1 + "/" //igual}
                        btn3.setOnClickListener {
                            str1 = str1 + "/" //apagar}
                        }
                    }
                }