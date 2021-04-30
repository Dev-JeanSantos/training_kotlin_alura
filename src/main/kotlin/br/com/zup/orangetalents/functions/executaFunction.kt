package br.com.zup.orangetalents.functions

import br.com.zup.orangetalents.modelo.Autenticavel
import br.com.zup.orangetalents.modelo.SistemaInterno

fun main() {

    somaLambda(30, 40, resultado = {
        println(it)
    })

    somaReceiver(10, 30, resultado = {
        println("Total soma: $this")
    })
}


fun somaLambda(a: Int, b: Int, resultado: (Int) -> Unit){
    println("*************Utilizando Lambda*******************")
    println("Antes da Soma")
    resultado(a+b)
    println("Após a Soma")
}


fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit) {
    println("*************Utilizando Receiver*******************")
    println("Antes da Soma")
    val valorTotal = a+b
    resultado(valorTotal)
    println("Após a Soma")
}