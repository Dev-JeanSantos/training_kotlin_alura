package br.com.zup.orangetalents.functions

import br.com.zup.orangetalents.modelo.Cliente
import br.com.zup.orangetalents.modelo.ContaPoupanca

fun testandoRun() {
    println("---------------************----------------")
    println("Trabalhando com Run")
    println("---------------************----------------")
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    println("Taxa de Rendimentos Mensal: $taxaMensal")


    val contaPoupanca = Cliente(nome = "Jean Santos", cpf = "000.000.000-00", senha = 123).let { clienteNovo: Cliente ->
        ContaPoupanca(clienteNovo, 3000)
    }
    contaPoupanca.run {
        deposita(1000.0)
        println("---------------************----------------")
        println("Saldo Atualizado: $saldo")
        val saldoAtualizado = saldo * taxaMensal
        saldoAtualizado
        //}.let(::println)     //Opção 1
    }.let { rendimentoMensal -> //Opção 2
        println("---------------************----------------")
        println("Rendimento Mensal: $rendimentoMensal")
    }

    val rendimentosAnuais = run {
        var saldo = contaPoupanca.saldo
        repeat(12) { indice ->
            saldo += saldo * taxaMensal
        }
        saldo
    }
    println("---------------************----------------")
    println("Rendimento Anual: $rendimentosAnuais")
}
