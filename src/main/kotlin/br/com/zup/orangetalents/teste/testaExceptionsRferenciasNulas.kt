package br.com.zup.orangetalents.teste

import br.com.zup.orangetalents.modelo.Endereco
import java.lang.IllegalArgumentException

fun testaExceptionsRferenciasNulas() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua Manoel", complemento = "predio lascado")
    //Utilizando a interrogação (Safe Call) para evitar NullPointException
    println(enderecoNulo?.logradouro)
    val logredouroNovo: String? = enderecoNulo?.logradouro

    //ou podemos utilizar o let
    enderecoNulo?.let { end: Endereco ->
        println(end.logradouro)
        println(end.logradouro.length)

        //Elvis Operator => ?:
        val tamanhoComplemento: Int =
            end.complemento?.length ?: throw IllegalArgumentException("O Complemento não deve ser vazio!!!")
        println(tamanhoComplemento)
    }
}
