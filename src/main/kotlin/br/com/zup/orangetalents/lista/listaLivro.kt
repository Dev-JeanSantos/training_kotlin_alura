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

    println(livros)
    println("-------------------****************---------------------------")
    //Com remove removeremos um item de nossa lista
    livros.remove(livro1)
    println(livros)
}