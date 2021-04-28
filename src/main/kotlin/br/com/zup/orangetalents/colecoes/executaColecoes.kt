package br.com.zup.orangetalents.colecoes

fun main() {

    //Pair -> padrão primitivo caso queirar inserir muitos dados
    //to -> "inflix" caso queira inserir muitos dados pode ter problemas de performace
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.00),
        Pair(2, 32.11),
        3 to 43.44,
        4 to 32.00
    )
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
    for (p in pedidos){
        println("numero do pedido: ${p.key}")
        println("numero do valor: ${p.value}")
    }

    //Inserir um valor no map
    pedidos[5] = 40.30
    pedidos.put(6, 43.09)
    println("--------------imprimindo novos valores inserido no Map--------------------")
    println(pedidos)
    pedidos.put(1, 100.00)
    println("--------------imprimindo updates dos valores inserido no Map--------------------")
    println(pedidos)
    //putIfAbsent => somente modifica chaves vazias
    pedidos.putIfAbsent(1, 22.90)
    println("--------------imprimindo testes com putIfsent--------------------")
    println(pedidos)

    //Remoçao item do map
    println("Remoçao do item 6 com remove")
    pedidos.remove(6)
    pedidos.remove(1, 10.0)
    println(pedidos)

}






