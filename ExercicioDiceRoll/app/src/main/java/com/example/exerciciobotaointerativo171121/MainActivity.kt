package com.example.exerciciobotaointerativo171121

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val roolButton: Button = findViewById(R.id.buttonRolled)

        roolButton.setOnClickListener { rollDice() } //otimizando os códigos abaixo

        /* roolButton.setOnClickListener{
             //val toast = Toast.makeText(this, "Dice Rollea!", Toast.LENGTH_SHORT)
             //toast.show()
             //var resultTextView: TextView = findViewById(R.id.textViewRolled)
             //resultTextView.text = "6"

             rollDice()
         }*/

    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        //val resultTextView: TextView = findViewById(R.id.textViewRolled)
        //resultTextView.text = diceRoll.toString()
        val diceImage: ImageView = findViewById(R.id.imageView)

        when(diceRoll){
            1-> diceImage.setImageResource(R.drawable.dice_1)
            2-> diceImage.setImageResource(R.drawable.dice_2)
            3-> diceImage.setImageResource(R.drawable.dice_3)
            4-> diceImage.setImageResource(R.drawable.dice_4)
            5-> diceImage.setImageResource(R.drawable.dice_5)
            6-> diceImage.setImageResource(R.drawable.dice_6)
        }

    }

    }
