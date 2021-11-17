package com.example.exerciciobotaointerativo171121

class Dice (private val numSides: Int){

    fun roll(): Int{
        return (1..numSides).random()

    }
}