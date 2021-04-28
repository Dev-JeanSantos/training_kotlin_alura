package br.com.zup.orangetalents.lista

import br.com.zup.orangetalents.testalivros

fun main(){
    val organizaPorAutor = prateleira.organizaPorAutor()
    val organizarPorPublicacao = prateleira.organizarPorPublicacao()

    organizaPorAutor.impressaoFormatada()
    organizarPorPublicacao.impressaoFormatada()
}