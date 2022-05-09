package com.mariovaladez.kotlinintermedio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Lección 1 Enum Classes
        //enumClases()
        //RepartirCartas()
        //calcular()
        diasDeLaSemana()
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

    /////////////////////////////////JUEGO DE CARTAS///////////////////////////

    enum class PaloNaipe {DIAMANTES, TREBOLES, CORAZONES, PICAS}
    class Carta( val carta: PaloNaipe, val valor : Int){
        fun mostrar(){
            println("Mario $valor de $carta")
        }

    }
    fun RepartirCartas(){
        fun getCarta () = PaloNaipe.values().random()
        fun getValor () = (1..12).random()
        for(i in 1..100){
            Carta(getCarta(),getValor()).mostrar()

        }
    }

    /////////////////////////CALCULADORA///////////////////////////////////////////


enum class operacion(val tipo : String ){
    SUMA("+"),
    RESTA("-"),
    MULTIPLICACION("*"),
    DIVISION("/")

}
    class Calculo(val valor1: Int, val valor2 : Int, val operation : operacion){
       fun calcule(){
           val resultado = when(operation){
               operacion.SUMA -> valor1+valor2
               operacion.RESTA -> valor1-valor2
               operacion.MULTIPLICACION -> valor1*valor2
               operacion.DIVISION -> valor1/valor2


           }
           println("$valor1 ${operation.tipo} $valor2  es igual a $resultado")
       }

    }
private fun calcular(){
    val calculo1 = Calculo(20,30,operacion.SUMA)
    calculo1.calcule()
    val calculo2 = Calculo(20,30,operacion.RESTA)
    calculo2.calcule()
    val calculo3 = Calculo(20,30,operacion.MULTIPLICACION)
    calculo3.calcule()
    val calculo4 = Calculo(20,30,operacion.DIVISION)
    calculo4.calcule()

}
    ////////////////////////////////////////////DIAS DE LA SEMANA////////////////////////////////////////////////
    enum class Dias(val dia: Int){
        LUNES(1),
        MARTES(2),
        MIERCOLES(3),
        JUEVES(4),
        VIERNES(5),
        SABADO(6),
        DOMINGO(7)

    }
private fun diasDeLaSemana(){
    for(dia in Dias.values()){
       val diaSemana = Dias.valueOf(dia.name)
        println("${diaSemana.dia} "+"$diaSemana")
    }

}


}