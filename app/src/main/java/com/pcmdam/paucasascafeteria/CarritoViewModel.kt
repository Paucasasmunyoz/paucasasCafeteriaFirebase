package com.pcmdam.paucasascafeteria

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CarritoViewModel : ViewModel() {

    private val productosSeleccionados = mutableListOf<Producto>()

    val productos = MutableLiveData<List<Producto>>()
    val total = MutableLiveData<Double>()

    fun agregarProducto(producto: Producto) {
        productosSeleccionados.add(producto)
        productos.value = productosSeleccionados
        actualizarTotal()
    }

    fun vaciarCarrito() {
        productosSeleccionados.clear()
        productos.value = productosSeleccionados
        actualizarTotal()
    }

    private fun actualizarTotal() {
        val sumaTotal = productosSeleccionados.sumOf { it.precio }
        total.value = sumaTotal
    }
}
