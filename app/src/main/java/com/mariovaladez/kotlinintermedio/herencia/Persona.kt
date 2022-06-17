package com.mariovaladez.kotlinintermedio.herencia

import com.mariovaladez.kotlinintermedio.interfaces.Game

open class Persona (val nombre:String, edad:Int) : Work(), Game {
    //cualquier clase tiene una superclase en comun llamada any

    open fun work(){
        println("Esta persona esta trabajando")

    }

    override fun goToWork() {
       println("$nombre va al trabajo")
    }

    //Game Interface
    override val game: String = "Among Us"

    override fun play() {
        println("$nombre esta jugando $game")
    }


}
