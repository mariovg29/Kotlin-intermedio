package com.mariovaladez.kotlinintermedio.herencia

open class Persona (val nombre:String, edad:Int) : Work(){
    //cualquier clase tiene una superclase en comun llamada any

    open fun work(){
        println("Esta persona esta trabajando")

    }

    override fun goToWork() {
       println("$nombre va al trabajo")
    }


}
