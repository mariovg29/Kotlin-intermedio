package com.mariovaladez.kotlinintermedio.herencia

class Programmer( nombre: String, edad: Int, val languaje:String)
    : Persona(nombre, edad), Vehiculo {

    override fun work() {
        println("$nombre persona esta programando en $languaje")
    }
    fun sayLanguage(){
        println("$nombre es experta en $languaje")
    }

    override fun goToWork() {
        println("$nombre va a Google")
    }

    override fun drive() {
        println("$nombre conduce un auto")
    }

}