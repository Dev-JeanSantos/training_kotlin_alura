import br.com.zup.orangetalents.modelo.Endereco

//*******IMPORTANTE****************
//Tudo no Kotlin são objetos (Classes)


fun main() {

    //Sobrecargas
//    println()
//    println(1)
//    println(1.0)
//    println(false)
//    println("Olá")

    var endereco = Endereco()

    imprime(Unit)
    imprime(1)
    imprime(1.0)
    imprime(endereco)


    testaFuncionarios()

}

fun imprime(valor: Any): Unit{
    println(valor)
}







