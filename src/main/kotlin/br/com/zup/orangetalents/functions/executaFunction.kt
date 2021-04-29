package br.com.zup.orangetalents.functions

fun main(){

    testeTipoFuncaoReferencia()
    testeTipoFuncaoClasse()
}

fun testeTipoFuncaoAnonima() {
    println("*********************Chamada de uma Anônima************************")
    val minhaFuncaoAnonima: () -> Unit = fun() {
        println("Minha função Anonima!")
    }
    println(minhaFuncaoAnonima())
}

fun testeTipoFuncaoLambda() {
    println("*********************Chamada de uma Lambda************************")
    val minhaFuncaoLambda = {
        println("Minha função Lambda!")
    }
    println(minhaFuncaoLambda())
}

fun testeTipoFuncaoReferencia() {
    println("*********************Chamada de uma Função************************")
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(5, 5))
}
fun testeTipoFuncaoClasse() {
    println("*********************Chamada de uma Classe************************")
    val minhaFuncaoClasse: (Int, Int) -> Int = Soma()
    println(minhaFuncaoClasse(10, 30))
}

fun soma(a: Int, b: Int) : Int{
    return a + b
}

class Soma : (Int, Int) -> Int{
    override fun invoke(p1: Int, p2: Int): Int {
        return p1 + p2
    }
}