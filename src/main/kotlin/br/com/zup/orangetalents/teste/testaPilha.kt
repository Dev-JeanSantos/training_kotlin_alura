package br.com.zup.orangetalents.teste

import br.com.zup.orangetalents.exception.SaldoInsuficienteException

fun funcao1() {
    println("Inicio funçao 1")
    try {
        funcao2()
    }catch (e: SaldoInsuficienteException){
        e.printStackTrace()
        println("Minha Exception foi estourada")
    }
    println("Fim funçao 1")
}

fun funcao2() {
    println("Inicio funçao 2")
    for (i in 1..5) {
        println(i)
        val endereco = Any()
        //Lançamento das exceptions
        throw SaldoInsuficienteException()
    }
    println("Fim função 2")
}
