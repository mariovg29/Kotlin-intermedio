package com.mariovaladez.kotlinintermedio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Lección 1 Enum Classes
        enumClases()
    }

    enum class Direccion(val dir : Int){
        NORTH(1) , SOUTH(2), EAST(3), WEST(4);
        fun description() : String{
            return when(this){
                NORTH -> "La dirección es Norte"
                SOUTH -> "La dirección es sUR"
                EAST -> "La dirección es Este"
                WEST -> "La dirección es Oeste"
                //else -> "No sabemos la dirrección"
            }


        }

    }

    private fun enumClases() {

        //Asignación de valores
        var userDirection : Direccion? = null
        println("Dirección: $userDirection")

        userDirection = Direccion.NORTH
        println("Dirección: $userDirection")

        userDirection = Direccion.EAST
        println("Dirección: $userDirection")

        //Propiedades por defecto
        println("Propiedad name: ${userDirection.name}")
        println("Propiedad name: ${userDirection.ordinal}")

        //Funciones
        println(userDirection.description())

        //Inicialización
        println(userDirection.dir)






    }


}