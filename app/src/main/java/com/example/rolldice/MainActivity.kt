package com.example.rolldice

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var resultTextView1: TextView
    private lateinit var resultTextView2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView1 = findViewById(R.id.result1)
        resultTextView2 = findViewById(R.id.result2)

        val rollButton: Button = findViewById(R.id.roll)
        rollButton.setOnClickListener(View.OnClickListener {
            rollDice1()
            rollDice2()
            rollButton.text = "ROLL AGAIN"
        })
    }

    private fun rollDice1() {
        val sides = 6
        val result = Random.nextInt(1, sides + 1)
        resultTextView1.text = "You rolled a $result!"
    }

    private fun rollDice2() {
        val sides = 6
        val result = Random.nextInt(1, sides + 1)
        resultTextView2.text = "You rolled a $result!"
    }
}