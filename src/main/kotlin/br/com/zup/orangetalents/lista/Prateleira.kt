package br.com.zup.orangetalents.lista

class Prateleira (
    val genero: String,
    val livros:MutableList<Livro>
){
    fun organizaPorAutor(): MutableList<Livro>{
        livros.sortBy { it.autor }
        return livros
    }
    fun organizarPorPublicacao():MutableList<Livro>{
        livros.sortBy { it.anoPublicacao }
        return livros
    }
}