package br.com.zup.orangetalents.lista

//data class oferece mais recursos que a class
//recursos como criação automatica de toString
data class Livro (
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    val editora: String? = null,
        )