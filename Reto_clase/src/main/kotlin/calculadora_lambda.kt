/** realiza una operacion de pendiendo de lo que elijamos.
 *
 * @param num1 es el 1º numero de la operacion
 * @param num2 es el 2º numero de la operación
 * @param funcion toma 2 Int y devuelve 1 Int
 *
 * @return Devuelve el resultado de num1 y num2 aplicados a la funcion seleccionada.
 */
fun main(){
    fun operacion(num1: Int , num2: Int , funcion:(Int , Int) ->Int ):Int{
        return funcion(num1,num2)
    }
    val suma_fun = fun (num1: Int , num2: Int):Int = num1 + num2
    val multi_fun = fun (num1: Int , num2: Int):Int = num1 * num2
    val resta_fun = fun (num1: Int , num2: Int):Int = num1 - num2
    val division_fun = fun (num1: Int , num2: Int):Int = (num1/num2).toInt()

    print("Dime si quieres 1 sumar , 2 multiplicar , 3 restar o 4 dividir: ")
    val respuesta = readln()?.toIntOrNull() ?: 0
    when (respuesta){
        1 -> println(operacion(pedirnum() , pedirnum() , suma_fun))
        2 -> println(operacion(pedirnum() , pedirnum() , multi_fun))
        3 -> println(operacion(pedirnum(), pedirnum() , resta_fun))
        4 -> println(operacion(pedirnum() , pedirnum() , division_fun))
        else -> println("Opción no valida.")
    }
}

/**La funcion le dice al usuario que le introduzca un num .
 *
 * @return El numero es un Int
 */
fun pedirnum() : Int{
    print("Ingresa un numero : ")
    return readln()?.toIntOrNull() ?: 0
}