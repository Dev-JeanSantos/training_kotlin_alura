package br.com.zup.orangetalents.colecoes

import br.com.zup.orangetalents.Pedido

fun List<Pedido?>.impressaoFormatada(){

    //joinToString => personifica a saída de uma lista
    val formatada = this
        // .filter{it != null} => Retira os nulls
        .filterNotNull() //Retira os nulls
        .joinToString(separator = "\n") {
            " Numero: ${it.numero} - Preço: ${it.valor}"
        }
    println("**************LISTA DE PEDIDOS*******************\n$formatada")
}