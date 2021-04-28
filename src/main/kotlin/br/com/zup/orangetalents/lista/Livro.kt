package br.com.zup.orangetalents.lista

//data class oferece mais recursos que a class
//recursos como criação automatica de toString
data class Livro (
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    val editora: String? = null,
        ): Comparable<Livro> { //Para que possamos ordenar é necessário extends Comparable
    override fun compareTo(other: Livro): Int {
        return this.anoPublicacao.compareTo(other.anoPublicacao)
    }
}