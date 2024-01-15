fun domicilios(compras: List<List<Any>>):List<String>{

   // val domiciliosnorep = mutableSetOf<String>()
    //compras.forEach{ domiciliosnorep.add(it[3].toString())}
    //return domiciliosnorep.toList()
   return compras.map {it[3].toString() }.toSet().toList().sorted()
}

fun main(){
    val compras = listOf<List<Any>>(listOf("Nuria Costa", 5, 12780.78, "Calle Las Flores 355"),
        listOf("Jorge Russo", 7, 699, "Mirasol 218"),
        listOf("Nuria Costa", 7, 532.90, "Calle Las Flores 355"),
        listOf("Julián Rodriguez", 12, 5715.99, "La Mancha 761"),
        listOf("Jorge Russo", 15, 958, "Mirasol 218")
    )
    println( domicilios(compras).joinToString ( " , \n" ))

}