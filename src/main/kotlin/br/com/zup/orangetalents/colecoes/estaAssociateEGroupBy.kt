package br.com.zup.orangetalents.colecoes

import br.com.zup.orangetalents.Pedido

fun testaAssociateEGroupBy() {
    val pedidos = listOf(
        Pedido(1, 20.00),
        Pedido(2, 30.00),
        Pedido(3, 40.00),
        Pedido(4, 50.00),
        Pedido(5, 60.00),
    )

    val nomes = listOf(
        "Alex",
        "Fran",
        "Gui",
        "Ana",
        "Paulo",
        "Maria",
        "Mario",
        "Gisele"
    )

    pedidos.impressaoFormatada()
    //Uso dos Associates associate, associateBy e associateWith
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

    val mapa: Map<Boolean, Pedido> = pedidos.associateBy { pedido -> pedido.valor > 50.0 }
    println("******************Imprime um pedido que tem e não tem frete ******************")
    println(mapa)

    val todosOsPedidosNaoPagamFrete: Map<Boolean, List<Pedido>> =
        pedidos.groupBy { pedido: Pedido -> pedido.valor > 50.0 }
    println("******************Imprime todos os nomes dos Pedidos que pagam ou não o frete ******************")
    println(todosOsPedidosNaoPagamFrete)

    println("******************Imprime todos os nomes dos Pedidos que pagam o frete ******************")
    println(todosOsPedidosNaoPagamFrete[false])

    println("******************Imprime todos os nomes dos Pedidos que não pagam o frete ******************")
    println(todosOsPedidosNaoPagamFrete[true])


    val agenda: Map<Char, List<String>> = nomes.groupBy { nome ->
        nome.first()
    }
    println("******************Imprime todos as iniciais com os nomes de uma agenda ******************")
    println(agenda)
    println("******************Imprime todos nomes que iniciam com a letra A on ******************")
    println(agenda['A'])
}