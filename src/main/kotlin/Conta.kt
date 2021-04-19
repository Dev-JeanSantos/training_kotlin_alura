class Conta(
    var titular: String,
    var numero: Int
) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        println("------Movimentação de Depósito------")
        this.saldo += valor
    }

    fun saque(valor: Double) {
        println("------Movimentação de Saque------")
        if (saldo >= valor) {
            saldo -= valor
            println("Saque efetuado com sucesso!")
        } else {
            println("Voce não possui saldo suficiente!")
        }
    }

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