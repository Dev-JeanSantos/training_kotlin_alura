package br.com.zup.orangetalents.lista

class Prateleira (
    val genero: String,
    val livros:List<Livro>
){
    fun organizaPorAutor(): List<Livro> {
        return livros.sortedBy { it.autor }
    }
    fun organizarPorPublicacao(): List<Livro> {
        return livros.sortedBy { it.anoPublicacao }
    }
}