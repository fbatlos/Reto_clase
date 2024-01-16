fun main() {
    //array tamaño fijo pero se pueden cambiar ,  con  pocos datos es bueno

    val miArray = arrayOf(1, 2, 3, 4, 5)
    miArray[0] = 2

    for (i in miArray) {
        println(i)
    }

    for (i in miArray.indices) {
        miArray[i]++
        println(miArray[i])
    }
    //step salto , para que te coja solo los necesarios util y num..num para poner rango
///for ((i in 0..miArray.size).reversed()){
    //     println(miArray[i])
    // }

    for ((i, valor) in miArray.withIndex()) {
        println("${i + 1} -> $valor")
    }

    //para ¡ meter una clase
    fun String.grito(nom: String) {
        println(("$nom!"))
    }
    "".grito("jas")
    //funciones tipo y asignacion de tipo en funcion

    val gandor: (String) -> Unit = ::muestra

    //filtrar cosas



}

fun muestra(txt:String){
println(txt)
}




