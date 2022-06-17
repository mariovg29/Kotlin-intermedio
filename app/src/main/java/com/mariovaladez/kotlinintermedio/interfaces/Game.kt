package com.mariovaladez.kotlinintermedio.interfaces

interface Game {

    val game : String
    //Pueden o no tener comportamiento
    fun play()

    fun stream(){
        //comportamiento
        println("Estoy haciendo stream")

    }
}