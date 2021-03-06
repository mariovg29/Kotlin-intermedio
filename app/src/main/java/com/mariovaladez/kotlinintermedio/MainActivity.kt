package com.mariovaladez.kotlinintermedio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.mariovaladez.kotlinintermedio.adapter.superHeroAdapter
import com.mariovaladez.kotlinintermedio.databinding.ActivityMainBinding
import com.mariovaladez.kotlinintermedio.dataclases.Worker
import com.mariovaladez.kotlinintermedio.herencia.Designer
import com.mariovaladez.kotlinintermedio.herencia.Persona
import com.mariovaladez.kotlinintermedio.herencia.Programmer
import com.mariovaladez.kotlinintermedio.nestedandinnerclasses.MyNestedAndInnerClass
import com.mariovaladez.kotlinintermedio.visibility_modifier.Visibility2

typealias  myMapList = MutableMap<Int, ArrayList<String>>
typealias  MyFun = (Int,String, myMapList)->Boolean
typealias myNestedClass = MyNestedAndInnerClass.MyNestedClass

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()



        //Lección 1 Enum Classes

        //enumClases()
        //RepartirCartas()
        //calcular()
        //diasDeLaSemana()

        //lECCIÓN 2 NESTED AND INNER CLASSES
        //nestedAndInnerClasses()

        //LECCIÓN 3 HERENCIA
        //herencia()

        //Leccion 4 Interfaces
        //interfaces()

        //Leccion 5 Modificadores de visibilidad
        //modificadores()

        //Leccion 6 Dataclasses
        //dataClases()

        //Leccion 7 Dataclasses
        //typeAliases()

        //Leccion 8 Destructuring declarations
        destructuring()




    }

    fun initRecyclerView(){
        val manager = LinearLayoutManager(this,)

        val decoration = DividerItemDecoration(this, manager.orientation )
        binding.rvsuperHero.layoutManager = manager
        binding.rvsuperHero.adapter = superHeroAdapter(superHeroProvider.superHeroeList) { superhero ->
            onItemSelected(

                superhero
            )
        }



    }

    fun onItemSelected(superHero: SuperHero){
        Toast.makeText(this, superHero.superHeroName, Toast.LENGTH_SHORT).show()

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
    /////////////// Lección 2 NESTED CLASSES AND INNER CLASSES ////////////////////////////////////////////////////////

private fun nestedAndInnerClasses(){

    //clase Anidada (nested)

    val myNestedClass = MyNestedAndInnerClass.MyNestedClass()
    val sum=myNestedClass.sum(10,5)
    println(sum)

    //Clase Interna (inner)
    val myInnerClass = MyNestedAndInnerClass().MyInnerClass()
    val sumTwo = myInnerClass.sumTwo(10)
    println("El resultado de sumar dos es $sumTwo")
    MyNestedAndInnerClass().MyInnerClass().metodo()

}


}
private fun herencia() {
    val programmer = Programmer("Mario", 17, "Kotlin")
    programmer.work()
    programmer.sayLanguage()
    programmer.goToWork()
    programmer.drive()
    val designer = Designer("Pepe", 33)
    designer.work()

}
private fun interfaces(){
    val gamer = Persona("Mario", 33)
    gamer.play()
    gamer.stream()

}

private fun modificadores(){
    //val visibility = Visibility()
    //visibility.name = "Mario"
    //visibility.sayMyName()
    //visibility.name = null

    val visibility2 = Visibility2()
   // visibility2.sayMyName2

}

private fun dataClases(){
    val trabajador = Worker("Mario", 33, "Nada")
    trabajador.lastWork = "Junior"

    val trabajador2 = Worker()

    val trabajador3 = Worker("Mario", 33, "Nada")
    trabajador.lastWork = "Junior"

    //equals & HasCode
    if(trabajador.equals(trabajador3)){
        println("son iguales")
    }else{
        println("No son iguales")
    }

    //toString
    println("metodo toString: "+trabajador3.toString())

    //copy
    val mario = trabajador3.copy(age =37)
    println("Metodo Copy: "+trabajador.toString())
    println(mario.toString())

    //componentN
    val (name,age) = trabajador3
    println(name)
    println(age)

}

/////////////////////////////////////////////////////
////Lección 7 Kotlin Intermedio Type Aliases

private var myMap: myMapList = mutableMapOf()

private fun typeAliases(){
    var myNewMap : myMapList = mutableMapOf()
    myNewMap[1] = arrayListOf("Mario", "Valadez")
    myNewMap[2] = arrayListOf("Pepe", "Grillo")

    myMap = myNewMap

}
/////////////////////////////////////////////////////
////Lección 8 Kotlin Intermedio  Destructuring

private fun destructuring(){
    val (name, age, work) = Worker("Mario Valadez", 33, "programmer")
    println("$name, $age, $work")

    //evitar una variable que no se usará con underscore
    val (name1, _, work1) = Worker("Mario Valadez", 33, "programmer")
    println("$name1,$work1")

    val mario = Worker ("mario valadez", 34, "Flojo")
    println(mario.component1())

    val (marioName, marioAge, marioWork)= myWorker()
    println("$marioName, $marioAge, $marioWork")

    val myMap = mapOf(1 to "Mario", 2 to "Pepe", 3 to "Ana")
    println("destructuring 1")
    for (name in myMap){

        println("${name.key}, ${name.value}")
    }
    println("destructuring 2")
    for (element in myMap){
        println("${element.component1()}, ${element.component2()}")
    }
    println("destructuring 3")
    for ((id, name) in myMap){
        println("$id, $name")
    }



}
private fun myWorker():Worker{
    return Worker("mario valadez", 34, "Flojo")
}