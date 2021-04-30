package br.com.zup.orangetalents.functions

import br.com.zup.orangetalents.modelo.Endereco


fun testeWith() {
    with(Endereco()) {
        logradouro = "Rua Manoel Novis"
        numero = 201
        bairro = "Centro"
        cidade = "Tanguá"
        estado = "Rio de Janeiro"
        complemento = ""
        cep = "24890-000"
        completo()
    }.let { enderecoCompleto: String ->
        println(enderecoCompleto)
    }
}
