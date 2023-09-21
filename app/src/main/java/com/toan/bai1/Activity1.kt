package com.toan.bai1


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Activity1 : AppCompatActivity() {

    private val TAG = "Activity1Log"
    override protected fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity1)

        Log.i(TAG, "onCreate")
        val button: Button = findViewById(R.id.Ac1_button)
        button.setOnClickListener {
            nextActivity()
        }
    }

    private fun nextActivity() {
        Toast.makeText(this, "Activity2!", Toast.LENGTH_SHORT).show()
        val textViewString = findViewById<TextView>(R.id.text_bai1).text.toString()
        val intent = Intent(this, Activity2::class.java)
        intent.putExtra("Ac1_2Key", textViewString)
        startActivity(intent)
    }

    override protected fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart")
    }

    override protected fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume")
        val editText = intent
        if (editText.hasExtra("Ac2_1Key")) {
            val editTextString = editText.getStringExtra("Ac2_1Key")

            val textView = findViewById<TextView>(R.id.text_bai1)
            textView.text = editTextString
        }
    }

    override protected fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause")
    }

    override protected fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart")
    }

    override protected fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop")
    }

    override protected fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy")
    }

}