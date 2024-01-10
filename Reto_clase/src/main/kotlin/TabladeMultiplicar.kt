import kotlin.math.max
import kotlin.math.min

/**
 * Solicita un número entero en un rango.
 *
 * @param
 * min Int - valor mínimo
 * @param max Int - valor máximo
 *
 * @return Int - número entero válido dentro del rango especificado
 */
fun pedirNum(): Int {
    print("Introducción de un número entre 1 y 100 : ")
    val numero = readln().toInt()
    if (numero>=1 && numero<=100){
        return numero
    }else{
        error(" ")
    }
}

/**
 * Realiza una pregunta para contestar con s/si ó n/no
 *
 * @param text String - Texto de la pregunta
 *
 * @return Boolean - true/false dependiendo de la respuesta válida a la pregunta
 */


fun pregunta(): Boolean {
    print("Quieres hacerlo otra vez ? s/si ó n/no: ")
    val comprobante=readln().lowercase()
    if (comprobante == "s" || comprobante == "si"){
        return true
    }else
    if (comprobante == "n" || comprobante == "no"){
        print("Adios")
        return false
    }else{
        error(" ")
    }
}

fun main() {
    //TODO: Solicitar la introducción de un número entre 1 y 100 y mostrar su table de multiplicar...
   try {
       var repuesta = true
       do {
           val numero = pedirNum()
           println("La tabla de multiplicar del número ${numero} es: ")
           val tabla = IntArray(10) { i -> i + 1 }
           for (i in tabla) {
               println("${i} -> ${numero} x ${i} = ${i * numero}")
           }
           repuesta = pregunta()
       }while (repuesta == true)
   }catch (_:Exception){
       println("**ERROR**")
   }
    //Hasta que se responda negativamente a la pregunta "¿Desea generar otra tabla de multiplicación? (s/n)"
}