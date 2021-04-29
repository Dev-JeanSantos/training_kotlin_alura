package br.com.zup.orangetalents.functions

fun main(){
    testeTipoFuncaoLambda()
    testeTipoFuncaoAnonima()
    testerVariosReturnsLambda()
    testeVariosRetornosAnonima()

}

fun testeVariosRetornosAnonima() {
    println("*********************Calculo com varios returns função Anonima************************")
    val calculaBonificacaoAnonima: (Salario: Double) -> Double = fun(salario): Double {
        if (salario > 5000) {
            return salario + 2000.00
        }
        return salario + 1000.00
    }
    println(calculaBonificacaoAnonima(1000.00))
}

fun testerVariosReturnsLambda() {
    println("*********************Calculo com varios returns utilizando função Lambda************************")
    val calculaBonificacaoLambda: (Salario: Double) -> Double = testeLambda@{ salario ->

        if (salario > 5000) {
            return@testeLambda salario + 2000.00
        }
        return@testeLambda salario + 1000.00
    }
    println(calculaBonificacaoLambda(6000.00))
}

fun testeTipoFuncaoAnonima() {
    println("*********************Chamada de uma Anônima************************")
    val minhaFuncaoAnonima = fun(a: Int, b: Int, _: Int): Int {
       return a + b
    }
    println(minhaFuncaoAnonima(2, 3 ,1))
}

fun testeTipoFuncaoLambda() {
    println("*********************Chamada de um Lambda************************")
    //Caso vc tenha parametros opcionais é necessário colocar o "UNDERLINE _"
    val minhaFuncaoLambda = { a: Int, b: Int, _: Int ->
        a + b
    }
    println(minhaFuncaoLambda(10, 90, 1))
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