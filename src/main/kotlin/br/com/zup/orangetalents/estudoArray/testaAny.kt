package br.com.zup.orangetalents.teste

import br.com.zup.orangetalents.modelo.Endereco

fun testaAny() {
    //Uso do Equals com Any = Compara as variveis
    //Uso do hashCode com Any = mostra a identidade do Objeto
    //Uso do toString com Any = mostra a impressão do Objeto
    //
    var endereco = Endereco(logradouro = "Rua Manoel Novis",
        numero = 201,
        bairro = "Centro",
        cidade = "Tangua",
        estado = "RJ",
        cep = "2490-000")

    var enderecoNovo = Endereco(
        logradouro = "Praça Mauá",
        numero = 2009,
        bairro = "Copacabana",
        cidade = "Rio de Janeiro",
        estado = "RJ",
        cep = "2490-000"
    )
    println(endereco.equals(enderecoNovo))
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())
    println(endereco.toString())
    println(enderecoNovo.toString())
}