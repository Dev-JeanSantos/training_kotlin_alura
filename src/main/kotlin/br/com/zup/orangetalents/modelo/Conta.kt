package br.com.zup.orangetalents.modelo

abstract class Conta(
    var titular: String,
    var numero: Int
) {
    var saldo = 0.0
        protected set

    fun deposita(valor: Double) {
        println("------Movimentação de Depósito------")
        this.saldo += valor
        println("Valor Depósito: ${valor}")
    }

    abstract fun saque(valor: Double)

    fun tranfere(valor: Double, contaDestino: Conta): Boolean {

        println("------Movimentação de Transferência------")
        if (saldo >= valor) {
            saldo -= valor
            contaDestino.deposita(valor)
            print("Valor depositado = ")
            println(valor)
            return true
        }
        // println("Voce não possui saldo suficiente!")
        return false
    }
}