package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var resultTextView:TextView
    private var operand: Double = 0.0
    private var operation : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.resultTextview)
        findViewById<TextView>(R.id.clearButton).setOnClickListener {
            operand = 0.0
            operation = ""
            resultTextView.text = ""
        }
    }

    fun numberClick(view: View){

        if (view is TextView){
            val number:String = view.text.toString()
            val result:String = resultTextView.text.toString()

            if (result =="0"){
            result == ""

            }
            resultTextView.text = result + number
        }
    }
    fun operationClick(view: View){
        if (view is Text){
            if(!TextUtils.isEmpty(resultTextView.text)){
                operand=resultTextView.text.toString().toDouble()
            }
         resultTextView.text= ""
         operation = view.text.tostring()
        }
        fun equalsClicl(view: View){
            val secondOperand : String = resultTextView.text.toString()
            var secoperand = 0.0
         if (!TextUtils.isEmpty(secondOperand)){
             secoperand= secondOperand.toDouble()
         }
            when(operation){
                "+"-> resultTextView.text = (operand + secondOperand).tostring()
                "-"-> resultTextView.text = (operand - secondOperand).tostring()
                "*"-> resultTextView.text = (operand * secondOperand).tostring()
                "/"-> resultTextView.text = (operand / secondOperand).tostring()


            }
        }
    }
}
