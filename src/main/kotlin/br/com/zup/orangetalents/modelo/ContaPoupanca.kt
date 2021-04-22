package br.com.zup.orangetalents.modelo

class ContaPoupanca(
    titular: Cliente,
    numero: Int,
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saque(valor: Double) {
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }
}