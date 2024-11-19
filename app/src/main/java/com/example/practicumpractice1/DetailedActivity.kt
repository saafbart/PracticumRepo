package com.example.practicumpractice1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailedActivity : AppCompatActivity() {
    lateinit var backbutton: Button
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed)
        backbutton = findViewById(R.id.backButton)
        textView = findViewById(R.id.textView2)

        //back button to take you back to the main screen
        val clearButton = findViewById<Button>(R.id.backButton)
        clearButton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }


        //Parallel arrays
        val days =
            arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
        val morningKilometers = arrayOf(1, 2, 4, 3, 5, 0, 0) //in kms
        val afternoonKilometers = arrayOf(2, 3, 5, 4, 3, 1, 2) //in kms
        val activityNotes = arrayOf(
            "Really try to push",
            "Tried my best",
            "Best Run",
            "Really Pushed",
            "Went the distance",
            "Was too tired",
            "Woke up late"
        )

        //Finding TextView from layout
        val textView: TextView = findViewById(R.id.textView2)

        //Building a display string for the data
        val stringBuilder = StringBuilder()
        for (i in days.indices) {
            stringBuilder.append("Day: ${days[i]}\n")
            stringBuilder.append("Morning Kilometers: ${morningKilometers[i]}kms\n")
            stringBuilder.append("Afternoon Kilometers: ${afternoonKilometers[i]}kms\n")
            stringBuilder.append("Notes: ${activityNotes[i]}\n\n")
        }

        //display the data in the textView
        textView.text = stringBuilder


    }

}