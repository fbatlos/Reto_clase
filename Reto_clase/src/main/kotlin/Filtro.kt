import javax.swing.text.StyledEditorKit.BoldAction

//fun main(){
//    println( lista.filtrer { it > 0}.joinToString (" , " ))
//}

fun List<Int>.filtrer( filtro :(Int) -> Boolean) : List<Int>{//filtro tiene if > 0 como condicion del if ,
    val lista_filtrada = mutableListOf<Int>()
    for (elemento in this) if (filtro(elemento)) lista_filtrada.add(elemento)
    return lista_filtrada
}


fun main(){

    val num: Int? = null

    if ((num ?: 8) > 2) {
        print("w")
    }

    val lista_contodo = listOf(23 ,23.4 , "poco yo" ,5 , true , "dod")

    print( lista_contodo.filter {
        when(it){
            is Int -> true
            is String -> false
            is Boolean -> true
            else -> false
        }
    }.joinToString ( " , " )) //Son */

    //----------------------------------------------------------//elvis

    val nom = null
    val longuitud: Int? = nom ?: 5
    println(longuitud)

    //------------------------------------------------ //Lanzamiento seguro y forzado

    val nume: String? = "23"
    val valor: Int? = nume as? Int // con el as solo hace las conversiones si son de ese tipo
    println(valor)

    val numo: Int? = null

    val longutudALterna: Int = numo ?: -48765432

    println(longutudALterna)

 //------------- to innt or null

    val nums = readln().toIntOrNull() ?: 0

    if (nums < 0 ) println("Negativo") else println("Positivo")
}
