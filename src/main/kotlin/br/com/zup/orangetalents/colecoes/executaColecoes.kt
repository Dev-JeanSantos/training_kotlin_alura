package br.com.zup.orangetalents.colecoes

import br.com.zup.orangetalents.Pedido

fun main() {

    val pedidos = listOf(
        Pedido(1, 20.00),
        Pedido(2, 30.00),
        Pedido(3, 40.00),
        Pedido(4, 50.00),
        Pedido(5, 60.00),
    )
    pedidos.impressaoFormatada()
    //Uso dos Associates
    val pedidosMapeados: Map<Int, Pedido> = pedidos.associateBy { pedido -> pedido.numero }

    println("******************Imprime todos os pedidos Mapeados******************")
    println(pedidosMapeados)
    println("******************Imprime apenas um os dos pedidos Mapeados******************")
    println(pedidosMapeados[1])

    val pedidosFreteGratis = pedidos.associateWith { pedido -> pedido.valor > 50.00 }
    println("******************Imprime todos os pedidos Mapeados maiores que 50 ******************")
    println(pedidosFreteGratis)

    val pedidosEspecificoFreteGratis = pedidos.associateWith { pedido -> pedido.valor > 50.00 }
    println("******************Imprime se um pedido em especifico tem frete gratis ******************")
    println(pedidosEspecificoFreteGratis[Pedido(2, valor = 30.00)])

}








