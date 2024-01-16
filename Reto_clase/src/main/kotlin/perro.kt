import java.awt.Color
import java.lang.IllegalArgumentException

class perro (){//val nombre: String , val raza: String , val peso: Int){
    var nombre: String =""
    var raza: String =""
        get() = field.uppercase()
        set(value) {
            require(value.isNotEmpty()){"Raza no valida"}
            //if (value.isEmpty()) throw IllegalArgumentException("Raza no valida")
            field = value.lowercase()
        }
    private var color:String = ""
    fun getColor():String{
        return this.color.uppercase()
    }

    fun setColor(color: String){
        if (color.isNotEmpty()){
            this.color = color
        }
    }

    var peso: Int = 0
    init {
        this.peso = 34
    }
    constructor(nombre: String):this(){
        this.nombre = nombre
    }
    //set(value) {field = value } lo que obtenemos , get() = field lo que mostramos, para propiedad
    fun ladrar(){
        println("GUAU")
    }

    override fun toString():String{ //Esto es lo que debemos subir
        return "${this.nombre} de color ${this.color} raza ${this.raza} y peso ${this.peso}"
    }

}

fun main(){
    //val perro1 = perro("Dobby", "Bostón" , 10200)
    val perro1 = perro()
    val perro2 = perro()

    perro1.getColor()




    perro2.nombre = "Mario"
    perro2.raza = "Perro"
    perro2.setColor("Carne")


    perro1.nombre = "Dobii"
    perro1.raza = "JApon"
    perro1.peso = 1222200
    perro1.setColor("Azul")

    println(perro1.toString())

    println(perro2.toString())
    perro1.ladrar()
    //perro1.nombre = "Dobbito"

}