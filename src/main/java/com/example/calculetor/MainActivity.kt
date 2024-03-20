package com.example.calculetor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    private var etNum1 :EditText? = findViewById<EditText>(R.id.etFirst)
    private var etNum2 :EditText? = findViewById<EditText>(R.id.etSecond)
    private var tvAnswer : TextView? = findViewById<TextView>(R.id.tvAnswer)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val btnAddition = findViewById<Button>(R.id.btnAdd)
        btnAddition.setOnClickListener{Add()}

        val btnSub = findViewById<Button>(R.id.btnSubtract)
        btnSub.setOnClickListener{subtract()}

        val btnMult = findViewById<Button>(R.id.btnMultiply)
        btnMult.setOnClickListener{multiply()}

        val btnDiv = findViewById<Button>(R.id.btnDivide)
        btnDiv.setOnClickListener{divide()}


    }






    private fun Add(){
        var answer = etNum1.toString().toInt() + etNum2.toString().toInt()

        tvAnswer?.setText(answer.toString())
    }


    private fun subtract(){
        var answer = etNum1.toString().toInt() - etNum2.toString().toInt()

        tvAnswer?.setText(answer.toString())
    }


    private fun multiply(){
        var answer = etNum1.toString().toInt() * etNum2.toString().toInt()

        tvAnswer?.setText(answer.toString())
    }


    private fun divide(){
        var answer = etNum1.toString().toInt() / etNum2.toString().toInt()

        tvAnswer?.setText(answer.toString())
    }

}