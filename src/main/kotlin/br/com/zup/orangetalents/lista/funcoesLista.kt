package br.com.zup.orangetalents.lista

fun List<Livro>.impressaoFormatada(){

    //joinToString => personifica a saída de uma lista
    val formatada = this.joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor}"
    }
    println("**************LISTA DE LIVROS*******************\n$formatada")
}