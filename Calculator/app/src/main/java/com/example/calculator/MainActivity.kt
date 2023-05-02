package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val First_input= findViewById<EditText>(R.id.editTextTextPersonName)
        val Second_input= findViewById<EditText>(R.id.editTextTextPersonName2)


    }

    fun addition(First_input:EditText,Second_input:EditText) {


    }
    fun substraction(view: View) {}
    fun multiplication(view: View) {}
    fun divide(view: View) {}
}