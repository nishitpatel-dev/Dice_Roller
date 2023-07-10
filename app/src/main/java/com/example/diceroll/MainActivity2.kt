package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class MainActivity2 : AppCompatActivity() {

    lateinit var diceImg : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.roll_button)
//        rollButton.text = "Let's Roll"
        rollButton.setOnClickListener {
//            Toast.makeText(this,"Button Clicked",Toast.LENGTH_SHORT).show()
            rollDice()
        }
        diceImg = findViewById(R.id.dice_img)
    }

    private fun rollDice() {
//        val resultText : TextView = findViewById(R.id.result_text)
//
//        var randomInt = kotlin.random.Random.nextInt(6) + 1
//
//        resultText.text = randomInt.toString()

        var drawableRes = when (kotlin.random.Random.nextInt(6) + 1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImg.setImageResource(drawableRes)


    }
}