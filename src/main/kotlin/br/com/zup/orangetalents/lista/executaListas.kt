package br.com.zup.orangetalents.lista

import br.com.zup.orangetalents.testalivros

fun main(){
    listaLivros.groupBy { it.editora ?: "Editora Desconhecida " }.
            forEach{(editora: String?, livros: List<Livro>) ->
                println("$editora: ${livros.joinToString { it.titulo }}")
            }
}