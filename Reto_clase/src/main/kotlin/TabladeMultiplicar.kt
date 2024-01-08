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
    val numero = readln().toInt()
    return numero
}

/**
 * Realiza una pregunta para contestar con s/si ó n/no
 *
 * @param text String - Texto de la pregunta
 *
 * @return Boolean - true/false dependiendo de la respuesta válida a la pregunta
 */


fun pregunta(){

}

fun main() {
    //TODO: Solicitar la introducción de un número entre 1 y 100 y mostrar su table de multiplicar...
    print("Introducción de un número entre 1 y 100 : ")
    val numero = pedirNum()
    println("La tabla de multiplicar del número ${numero} es: ")
    val tabla  = IntArray(10 ){i -> i + 1 }
    for (i in tabla){
        println("${i} -> ${numero} x ${i} = ${i*numero}")
    }
    //Hasta que se responda negativamente a la pregunta "¿Desea generar otra tabla de multiplicación? (s/n)"
}