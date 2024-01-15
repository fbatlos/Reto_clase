internal open class supercoche(protected var marca: String?, protected var añocompra: Int, protected var precio: Int) {
    open fun mostrarDatos() {
        println("Marca: $marca")
        println("Año de compra: $añocompra")
        println("Precio: $precio")
    }
}