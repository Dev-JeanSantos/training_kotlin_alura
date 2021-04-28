package br.com.zup.orangetalents.lista

fun main(){
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimaraes Rosa",
        anoPublicacao = 1956
    )
    val livro2 = Livro(
        titulo = "João Pé de Feijão",
        autor = "Tiririca",
        anoPublicacao = 1996
    )
    val livro3 = Livro(
        titulo = "O cravo e a Rosa",
        autor = "Barnabé",
        anoPublicacao = 1972,
        editora = "Editora Alpha"
    )
    val livro4 = Livro(
        titulo = "O Código",
        autor = "Carvalhos Marinho",
        anoPublicacao = 2000,
        editora = "Editora Omega"
    )

    //Criação de uma Lista com os livros
    //mutableListOf => cria uma lista com objetos
    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

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

}

fun List<Livro>.impressaoFormatada(){

    //joinToString => personifica a saída de uma lista
    val formatada = this.joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor}"
    }

    println("**************LISTA DE LIVROS*******************\n$formatada")
}