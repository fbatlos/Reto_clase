class perro (){//val nombre: String , val raza: String , val peso: Int){
    var nombre: String =""
    var raza: String =""
    var peso: Int = 0

    constructor(nombre: String):this(){
        this.nombre = nombre
    }
    //set(value) {field = value } lo que obtenemos , get() = field lo que mostramos
    fun ladrar(){
        println("GUAU")
    }

}

fun main(){
    //val perro1 = perro("Dobby", "Bostón" , 10200)
    val perro1 = perro()
    val perro2 = perro()

    perro2.nombre = "ahsf"
    perro2.raza = "iysgf"


    perro1.nombre = "Dobii"
    perro1.raza = "JApon"
    perro1.peso = 1222200

    perro1.ladrar()
    //perro1.nombre = "Dobbito"

}