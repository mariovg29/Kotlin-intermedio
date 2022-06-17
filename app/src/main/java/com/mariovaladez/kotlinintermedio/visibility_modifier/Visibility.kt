package com.mariovaladez.kotlinintermedio.visibility_modifier

private class Visibility {
    var name : String? =  null

    private fun sayMyName(){
        name?.let {
            println("Mi nombre es: $it")
        } ?: run {
            println("No tengo nombre")
        }
    }
}
open class Visibility2{
    protected fun sayMyName2(){
        val visibility= Visibility()
        visibility.name = "Mario"
    }

}
class Visibility3: Visibility2(){
    val age : Int? = null
    fun sayMyName3(){
        sayMyName2()
    }

}