internal class subcoche(marca: String?, añocompra: Int, precio: Int, private val antiguedad: Int) :
    supercoche(marca, añocompra, precio) {
    private var venta = (-2500 * antiguedad).toDouble()

    init {
        venta = venta
    }

    override fun mostrarDatos() {
        super.mostrarDatos()
        println("El precio bajó: $venta")
    }
}