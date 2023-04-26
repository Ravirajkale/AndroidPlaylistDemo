package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDark = findViewById<Button>(R.id.btndark)
        val buttonRead = findViewById<Button>(R.id.btnread)
        val layout=findViewById<LinearLayout>(R.id.LinearLayout)
        val clickMe=findViewById<Button>(R.id.btnclickme)


        buttonDark.setOnClickListener {
            layout.setBackgroundResource(R.color.black)
        }
        buttonRead.setOnClickListener {
            layout.setBackgroundResource(R.color.Yellow)
        }
        clickMe.setOnClickListener {

            intent= Intent(applicationContext,secondActivity::class.java)
            startActivity(intent)
        }
    }
}