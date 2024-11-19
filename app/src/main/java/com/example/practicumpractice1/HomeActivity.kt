package com.example.practicumpractice1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    //declare variables

    lateinit var textView: TextView
    lateinit var editText1: EditText
    lateinit var editText2: EditText
    lateinit var editText3: EditText
    lateinit var editText4: EditText
    lateinit var nextBtn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val nextButton = findViewById<Button>(R.id.nextButton)
        nextButton.setOnClickListener {
            val intent = Intent(this, DetailedActivity::class.java)
            startActivity(intent)
        }
        textView=findViewById(R.id.textView)
        editText1=findViewById(R.id.editTextDay)
        editText2=findViewById(R.id.editTextMorning)
        editText3=findViewById(R.id.editTextAfternoon)
        editText4=findViewById(R.id.editTextNotes)
        nextBtn=findViewById(R.id.nextButton)





            }

        }








