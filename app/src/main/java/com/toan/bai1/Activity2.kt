package com.toan.bai1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Activity2: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)

        val textView: TextView = findViewById(R.id.textView)
        textView.setText(intent.getStringExtra("Ac1_2Key"))

        val button: Button = findViewById(R.id.Ac2_button)
        button.setOnClickListener{
            backActivity()
        }
    }
    private fun backActivity() {
        Toast.makeText(this,"Activity1!",Toast.LENGTH_SHORT).show()
        val intent = Intent(this, Activity1::class.java)
        val editTextString = findViewById<EditText>(R.id.EditText).text.toString()
        intent.putExtra("Ac2_1Key",editTextString)
        startActivity(intent)
    }
}