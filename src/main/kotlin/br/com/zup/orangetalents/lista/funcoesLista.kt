package br.com.zup.orangetalents.lista
//necessário ? para copilar com possibilidades de dados nulos
fun List<Livro?>.impressaoFormatada(){

    //joinToString => personifica a saída de uma lista
    val formatada = this
        // .filter{it != null} => Retira os nulls
        .filterNotNull() //Retira os nulls
        .joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor}"
    }
    println("**************LISTA DE LIVROS*******************\n$formatada")
}