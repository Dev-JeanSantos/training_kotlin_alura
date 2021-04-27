package br.com.zup.orangetalents.teste

fun testaOperacoesAgregadoras() {
    //Operações Agregadoras
    val idades: IntArray = intArrayOf(10, 23, 49, 21, 36, 74, 23)

    val array = idades.filter { it > 0 }
    println("-------------------------------")
    println("Meu Array: $array")
    println("-------------------------------")

    val maiorIdade = idades.maxOrNull()
    println("Utilizando a função maxOrNUll")
    println("Maior idade: $maiorIdade")

    println("-------------------------------------")
    val menorIdade = idades.minOrNull()
    println("Utilizando a função minOrNUll")
    println("Menor Idade: $menorIdade")

    println("-------------------------------------")
    val mediaIdade: Double = idades.average()
    println("Utilizando a função average")
    println("Média das idades: $mediaIdade")

    println("-------------------------------------")
    val todosMaiores = idades.all { it > 1 }
    println("Utilizando a função all - todos que atendam a condição")
    println("Todos são maiores: $todosMaiores")

    println("-------------------------------------")
    val algunsAtendem = idades.any { it >= 43 }
    println("Utilizando a função any - retorna true ou false se alguns atendam a condição")
    println("Alguns atendem : $algunsAtendem")

    println("-------------------------------------")
    val maiores = idades.filter { it > 40 }
    println("Utilizando a função filter - retorna uma lista todos que atendam a condição")
    println("Todos são maiores: $maiores")

    println("-------------------------------------")
    val busca = idades.find { it == 74 }
    println("Utilizando a função find - faz uma busca e devolve o elemento caso seja encontrado")
    println("Todos são maiores: $busca")
}
