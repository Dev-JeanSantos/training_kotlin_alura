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

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Endereco

        if (cep != other.cep) return false

        return true
    }

    override fun hashCode(): Int {
        return cep.hashCode()
    }

    fun completo(): String {
        return """
*********************************************************************
ENDEREÇO:
RUA: $logradouro  NÚMERO: $numero, COMPLEMENTO: $complemento, BAIRRO: $bairro,
CIDADE: $cidade - ESTADO: $estado, 
CE: $cep 
""".trimIndent()
    }


}
