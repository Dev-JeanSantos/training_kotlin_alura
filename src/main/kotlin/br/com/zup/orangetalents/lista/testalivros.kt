package br.com.zup.orangetalents

import br.com.zup.orangetalents.lista.*

fun testalivros(){
    //Criação de uma Lista com os livros
//mutableListOf => cria uma lista com objetos
    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4, livro5, livro6)

//Com o add adcionamos um novo item em nossa lista
    livros.add(
        Livro(
            titulo = "Vamos Programar",
            autor = "Jean Santos",
            anoPublicacao = 2021,
            editora = "Tanguá News"
        )
    )

    println("Lista de livros:")
    livros.impressaoFormatada()
//Com remove removeremos um item de nossa lista
    livros.remove(livro1)
    println("Lista com o primeiro livro removido:")
    livros.impressaoFormatada()

//Com o sorted faremos a ordenção de nossa lista
//lembrando que tem que implmentar a extensão do comparable
    val ordenadoAnoPublicação: List<Livro> = livros.sorted()
    println("Lista Ordenada por Ano de publicação:")
    ordenadoAnoPublicação.impressaoFormatada()

//Com o sortedBy faremos a ordenção de nossa lista mais simplificada
    val ordenadoTitulo = livros.sortedBy { it.titulo }
    println("Lista Ordenada por Título:")
    ordenadoTitulo.impressaoFormatada()

    //Pesquisar um livro com filter
    livros.filter { it.autor == "Jean Santos" }.sortedBy { it.anoPublicacao }.impressaoFormatada()
    //Pesquisar um livro com startWith => Baseado em strings
    livros.filter { it.autor.startsWith("J") }.sortedBy { it.titulo }.impressaoFormatada()
    //Resultado da pesquisa apenas o titulo do livro
    val titulo = livros.filter { it.autor.startsWith("T") }.sortedBy { it.titulo }.map { it.titulo }
    println("--------------***********-------------------------")
    println("Pesquisa por nome que só traz o titulo:")
    println(titulo)

    //Trata campos nulos no objeto
    //GroupBy
    println("--------------***********-------------------------")
    println("Tratamento dos campos nulos do Objeto:")
    listaLivros.groupBy { it.editora ?: "Editora Desconhecida " }.
    forEach{(editora: String?, livros: List<Livro>) ->
        println("$editora: ${livros.joinToString { it.titulo }}")
    }
}


