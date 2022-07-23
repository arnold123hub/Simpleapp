package com.example.realtech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MYTAG","MainActivity : OnCreate")
        val greetingTextView = findViewById<TextView>(R.id.tvHello)
        val inputField = findViewById<EditText>(R.id.tvName)
        val submitButton = findViewById<Button>(R.id.btnsubmit)
        val offersButton=findViewById<Button>(R.id.btnoffers)
        var enteredName= ""
        submitButton.setOnClickListener {
             enteredName = inputField.text.toString()
            if (enteredName == "") {
                greetingTextView.text = ""
                Toast.makeText(this@MainActivity, "please enter your name", Toast.LENGTH_SHORT)
                    .show()
            } else {
                val message = "Welcome $enteredName"
                greetingTextView.text = message
                inputField.text.clear()
                offersButton.visibility=VISIBLE
            }


        }
        offersButton.setOnClickListener {
            val intent= Intent(this,SecondActivity::class.java)
            intent.putExtra("USER",enteredName)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("MYTAG","MainActivity : OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MYTAG","MainActivity : OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MYTAG","MainActivity : OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MYTAG","MainActivity : OnStop")
    }
    override fun onDestroy(){
        super.onDestroy()
        Log.i("MYTAG","MainActivity : OnDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MYTAG","MainActivity : OnRestart")
    }
}