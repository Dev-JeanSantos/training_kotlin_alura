package br.com.zup.orangetalents.colecoes

fun main() {

    //Pair -> padrão primitivo caso queirar inserir muitos dados
    //to -> caso queira inserir muitos dados pode ter problemas de performace
    val pedidos = mapOf(Pair(1, 20.00), Pair(2, 32.11), 3 to 43.44, 4 to 32.00)
    println("--------------Impressão Normal--------------------")
    println(pedidos)

    //imprimir o pedido numero 1
    //impotante utilizar o elvis para evitar nullable

    println("--------------Apenas um pedido--------------------")
    val pedido = pedidos[1]
    pedido?.let {
        println(pedido)
    }

    //imprimir a lista ordenadamente
    println("--------------lista Ordenada--------------------")
    for (pedido in pedidos){
        println("numero do pedido: ${pedido.key}")
        println("numero do valor: ${pedido.value}")
    }
}






