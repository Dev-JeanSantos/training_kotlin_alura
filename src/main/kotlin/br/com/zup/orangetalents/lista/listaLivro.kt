package br.com.zup.orangetalents.lista

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
val livro5 = Livro(
    titulo = "O Código Maliciosos",
    autor = "Jean Santos",
    anoPublicacao = 2020,
    editora = "Editora Omega"
)
val livro6 = Livro(
    titulo = "Engenharia do Código",
    autor = "Jean Santos",
    anoPublicacao = 2020,
    editora = "Editora Omega"
)
val listaLivros: MutableList<Livro> = mutableListOf(
    Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimaraes Rosa",
        anoPublicacao = 1956
    ),
    Livro(
        titulo = "João Pé de Feijão",
        autor = "Tiririca",
        anoPublicacao = 1996
    ),
    Livro(
        titulo = "O cravo e a Rosa",
        autor = "Barnabé",
        anoPublicacao = 1972,
        editora = "Editora Alpha"
    ),
    Livro(
        titulo = "O Código",
        autor = "Carvalhos Marinho",
        anoPublicacao = 2000,
        editora = "Editora Omega"
    ),
    Livro(
        titulo = "O Código Maliciosos",
        autor = "Jean Santos",
        anoPublicacao = 2020,
        editora = "Editora Omega"
    ),
    Livro(
        titulo = "Engenharia do Código",
        autor = "Jean Santos",
        anoPublicacao = 2020,
        editora = "Editora Omega"
    )
)

val listaLivrosNulos: MutableList<Livro?> = mutableListOf(
    Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimaraes Rosa",
        anoPublicacao = 1956
    ),
    null,
    Livro(
        titulo = "João Pé de Feijão",
        autor = "Tiririca",
        anoPublicacao = 1996
    ),
    Livro(
        titulo = "O cravo e a Rosa",
        autor = "Barnabé",
        anoPublicacao = 1972,
        editora = "Editora Alpha"
    ),
    Livro(
        titulo = "O Código",
        autor = "Carvalhos Marinho",
        anoPublicacao = 2000,
        editora = "Editora Omega"
    ),
    null,
    Livro(
        titulo = "O Código Maliciosos",
        autor = "Jean Santos",
        anoPublicacao = 2020,
        editora = "Editora Omega"
    ),
    null,
    null,
    Livro(
        titulo = "Engenharia do Código",
        autor = "Jean Santos",
        anoPublicacao = 2020,
        editora = "Editora Omega"
    )
)


