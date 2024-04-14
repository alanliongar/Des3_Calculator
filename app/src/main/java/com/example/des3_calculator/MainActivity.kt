package com.example.des3_calculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private fun calcular(expressao: String): Float {
        val ops = mutableListOf<Char>()
        val nums = mutableListOf<Float>()
        var currentNum = ""
        var lastChar = ' '

        for (char in expressao) {
            if (char.isDigit() || char == '.') {
                currentNum += char
            } else {
                if (currentNum.isNotEmpty()) {
                    nums.add(currentNum.toFloat())
                    currentNum = ""
                }
                while (ops.isNotEmpty() && shouldProcess(char, lastChar)) {
                    realizarOperacao(nums, ops.removeAt(ops.size - 1))
                }
                ops.add(char)
            }
            lastChar = char
        }

        if (currentNum.isNotEmpty()) {
            nums.add(currentNum.toFloat())
        }

        // Only process remaining operations if the last character is not an operator needing more input
        if (shouldCompleteCalculations(lastChar)) {
            while (ops.isNotEmpty()) {
                realizarOperacao(nums, ops.removeAt(ops.size - 1))
            }
        }

        return nums.lastOrNull() ?: 0f
    }

    fun shouldProcess(currentChar: Char, lastChar: Char): Boolean {
        return !((currentChar == '+' || currentChar == '-' || currentChar == 'x' || currentChar == '/') && (lastChar == '+' || lastChar == '-' || lastChar == 'x' || lastChar == '/'))
    }

    fun shouldCompleteCalculations(lastChar: Char): Boolean {
        return !(lastChar == '+' || lastChar == '-' || lastChar == 'x' || lastChar == '/')
    }

    fun realizarOperacao(nums: MutableList<Float>, op: Char) {
        if (nums.size < 2) return
        val right = nums.removeAt(nums.size - 1)
        val left = nums.removeAt(nums.size - 1)
        when (op) {
            '+' -> nums.add(left + right)
            '-' -> nums.add(left - right)
            'x' -> nums.add(left * right)
            '/' -> nums.add(left / right)
        }
    }

    fun precedencia(op: Char): Int = when (op) {
        '+', '-' -> 1
        'x', '/' -> 2
        else -> -1
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

        btn2.setOnClickListener {
            str1 = str1 + "0"
            resultado.text = calcular(str1).toString()
            display.text = str1
        }
        btn5.setOnClickListener {
            str1 = str1 + "1"
            resultado.text = calcular(str1).toString()
            display.text = str1
        }
        btn6.setOnClickListener {
            str1 = str1 + "2"
            resultado.text = calcular(str1).toString()
            display.text = str1
        }
        btn7.setOnClickListener {
            str1 = str1 + "3"
            resultado.text = calcular(str1).toString()
            display.text = str1
        }
        btn9.setOnClickListener {
            str1 = str1 + "4"
            resultado.text = calcular(str1).toString()
            display.text = str1
        }
        btn10.setOnClickListener {
            str1 = str1 + "5"
            resultado.text = calcular(str1).toString()
            display.text = str1
        }
        btn11.setOnClickListener {
            str1 = str1 + "6"
            resultado.text = calcular(str1).toString()
            display.text = str1
        }
        btn13.setOnClickListener {
            str1 = str1 + "7"
            resultado.text = calcular(str1).toString()
            display.text = str1
        }
        btn14.setOnClickListener {
            str1 = str1 + "8"
            resultado.text = calcular(str1).toString()
            display.text = str1
        }
        btn15.setOnClickListener {
            str1 = str1 + "9"
            resultado.text = calcular(str1).toString()
            display.text = str1
        }
        btn12.setOnClickListener {
            str1 = str1 + "-"
            display.text = str1
            resultado.text = calcular(str1).toString()
        }
        btn8.setOnClickListener {
            str1 = str1 + "+"
            display.text = str1
            resultado.text = calcular(str1).toString()
        }
        btn16.setOnClickListener {
            str1 = str1 + "x"
            display.text = str1
            resultado.text = calcular(str1).toString()
        }
        btn20.setOnClickListener {
            str1 = str1 + "/"
            resultado.text = calcular(str1).toString()
            display.text = str1
        }
        btn1.setOnClickListener {
            str1 = str1 + "."
            resultado.text = calcular(str1).toString()
            display.text = str1
        }
        btn17.setOnClickListener {
            str1 = "" //limpar
            resultado.text = str1
            display.text = str1
        }
        btn18.setOnClickListener {
            str1 = str1 //maismenos
        }
        btn19.setOnClickListener {
            str1 = str1 //porcento
        }
        btn4.setOnClickListener {
            display.text = str1
            resultado.text = calcular(str1).toString()
        }
        btn3.setOnClickListener {
            str1 = str1 + "/" //apagar
        }
    }
}