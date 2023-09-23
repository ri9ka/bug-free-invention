package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun buttonChangeVisible (view: View)
    {
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)

        button1.setOnClickListener{
            button2.visibility = View.VISIBLE
            button1.visibility = View.INVISIBLE
        }
        button2.setOnClickListener{
            button1.visibility = View.VISIBLE
            button2.visibility = View.INVISIBLE
        }

    }
}