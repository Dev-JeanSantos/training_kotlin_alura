package br.com.zup.orangetalents.teste


fun testaRangers() {
    //-----------------Rangers--------------------
    //Rangers são incrementos (loops) nos arrays com as funções do Kotlin
    //Exemplo:
    val series: IntRange = 1.rangeTo(20)
    println("1 até 20")
    for (s in series) {
        print(" - $s")

    }
    println()
    //Versão mais simplificada
    //Numeros Pares
    val numerosPares = 0..100 step 2
    println("Numeros Pares")
    for (np in numerosPares) {
        print(" - $np")
    }
    println()
    //Versão mais simplificada
    //Numeros Impares
    val numerosImpares = 1..100 step 2
    println("Numeros Impares utilizando ..")
    for (np in numerosImpares) {
        print(" - $np")
    }

    println()
    //Versão mais simplificada usando until para antes do ultimo
    //Numeros de 5 em 5
    val sequencia5 = 0.until(100) step 5
    println("Numeros de 5 em 5 utilizando until")
    for (np in sequencia5) {
        print(" - $np")
    }

    println()
    //Numeros reversos (decrescente) com rangers
    val numeroDecrescentes = 100 downTo 0 step 10
    println("Decrescentes utilizando downTo")

    numeroDecrescentes.forEach {
        print(" - $it")
    }

    println()
    println("-----------------------------------------")
    println("Estrutura Condicional utilizando Rangers - Salarios")
    //Estrutura condicional utilizando rangers
    val intervalo = 1500.0..5000.0
    val salario = 4500.0
    println("O salario de $salario:")

    if (salario in intervalo) {
        println("Esta dentro da faixa salarial")
    } else {
        println("Está fora da faixa salarial")
    }

    println()
    println("-----------------------------------------")
    println("Estrutura Condicional utilizando Rangers - Alfabeto")
    //Estrutura condicional utilizando rangers
    val alfabeto = 'a'..'z'
    val letra = 'x'
    println("A letra ${letra}:")
    if (letra in alfabeto) {
        println("Esta dentro do Alfabeto")
    } else {
        println("Está fora do Alfabeto")
    }
}