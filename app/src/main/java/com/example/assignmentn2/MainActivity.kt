package com.example.assignmentn2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun getNumberOne(): Double {
        return findViewById<EditText>(R.id.editTextNumber1).text.toString().toDouble();
    }

    private fun getNumberTwo(): Double {
        return findViewById<EditText>(R.id.editTextNumber2).text.toString().toDouble()
    }

    fun onClickMultiply(view: View) {
        openSecondActivity(getNumberOne() * getNumberTwo())
    }

    fun onClickDivide(view: View) {
        openSecondActivity(getNumberOne() / getNumberTwo())
    }

    fun onClickAppend(view: View) {
        openSecondActivity(getNumberOne() + getNumberTwo())
    }

    fun onClickDeduct(view: View) {
        openSecondActivity(getNumberOne() - getNumberTwo())
    }

    private fun openSecondActivity(answer: Double) {
        val secondActivityIntent = Intent(this, MainActivity2::class.java)
        secondActivityIntent.putExtra("answer", answer)
        startActivity(secondActivityIntent)
    }
}