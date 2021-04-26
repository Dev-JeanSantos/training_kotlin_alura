package br.com.zup.orangetalents.teste

import funcao1

fun testaExpressao() {
    println("Inicio main")

    val entrada: String = "1"

    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Não é possivel realizar essa conversão")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }



    if (valorComTaxa != null) {
        println("valor recebido: $valorComTaxa")
    } else {
        println("valor recebido inválido")
    }
}