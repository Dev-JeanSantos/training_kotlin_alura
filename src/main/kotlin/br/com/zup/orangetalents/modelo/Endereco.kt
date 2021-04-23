package br.com.zup.orangetalents.modelo

class Endereco (
    var logradouro: String = "",
    var numero: Int = 0,
    var bairro: String = "",
    var cidade: String = "",
    var estado: String = "",
    var cep: String = "",
    var complemento: String = ""
        ){

    //SobreEscrita do metodo toString

    override fun toString(): String {
        return """Endereco(logradouro='$logradouro',
            | numero=$numero, 
            | bairro='$bairro', 
            | cidade='$cidade',
            | Estado='$estado',
            | cep='$cep', 
            | complemento='$complemento')""".trimMargin()
    }
}
