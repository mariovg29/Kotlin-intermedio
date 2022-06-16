package com.mariovaladez.kotlinintermedio.herencia

class Designer(nombre: String, edad: Int) : Persona(nombre, edad) {

    override fun work() {
        println("$nombre persona esta Diseñamdo")
    }
}