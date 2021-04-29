package br.com.zup.orangetalents.functions

fun main(){
    println("*********************Chamada de uma Função************************")
    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao())
    println("*********************Chamada de uma Classe************************")
    val minhaFuncaoClasse: () -> Unit = Teste()
    println(minhaFuncaoClasse())
}

fun teste(){
    println("Testa a Função")
}

class Teste : () -> Unit{
    override fun invoke() {
        println("Testando a Classe")
    }

}