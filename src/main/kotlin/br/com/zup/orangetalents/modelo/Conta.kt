package br.com.zup.orangetalents.modelo

//Variavel Global pode ser visualizada por todos mas apenas alterada por sua classe
//var totalContas = 0
//    private set

abstract class Conta(
    var titular: Cliente,
    var numero: Int
) {
    var saldo = 0.0
        protected set

    //Object Declarations - Objetos anonimos similares a classes,
    //onde podemos adicionar properties(atributos) e metodos de classes,
    //possui nome, e sempre tem que estão em arquivos,  fora do escopo de uma função
    // o Compainon dá acesso a esse object mesmo estando fora do escopo da classe
    //Lembrando que ele so faz isso na mesma classe que ele está implementado
   companion object Contador{
        var total = 0
            private set
    }

    init {
        println("Criando Conta")

        //foi retirada a variavel global
        // totalContas++

        //Iremos utilizar object declarations ao inves da variavel global
        total++
    }
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