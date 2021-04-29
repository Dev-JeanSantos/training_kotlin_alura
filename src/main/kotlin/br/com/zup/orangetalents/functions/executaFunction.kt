package br.com.zup.orangetalents.functions

import br.com.zup.orangetalents.modelo.Autenticavel
import br.com.zup.orangetalents.modelo.Endereco
import br.com.zup.orangetalents.modelo.SistemaInterno
import java.util.*

fun main(){

    println("**************** Exemplo sem a Função de Alta Ordem **************************")
    val endereco = Endereco(logradouro = "Rua Manoel Novis", numero = 201)
    val enderecoMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
    println("**************** Exemplo 1 **************************")
    println(endereco)
    println("**************** Exemplo 2 **************************")
    println(enderecoMaiusculo)

    val enderecoMaiusculoAltaOrdem = Endereco(logradouro = "Rua Manoel Novis", numero = 201).let { endereco ->
        "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
    }
    println("**************** Exemplo com Função de Alta Ordem **************************")
    println(enderecoMaiusculoAltaOrdem)

    Endereco(logradouro = "Rua Manoel Novis", numero = 201).let { endereco ->
        "${endereco.logradouro}, ${endereco.numero}".toUpperCase().let{ enderecoMaiusculoAltaOrdem ->
            println("**************** Exemplo com Função de Alta Ordem 2 **************************")
            println(enderecoMaiusculoAltaOrdem)
        }
    }

    println("**************** Exemplo com Função de Alta Ordem 3 **************************")

    Endereco(logradouro = "Rua Manoel Novis", numero = 201).let { endereco ->
        "${endereco.logradouro}, ${endereco.numero}".toUpperCase().let(::println)
    }

    println("**************** Exemplo com Função de Alta Ordem 4 **************************")
    listOf(Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "Apartamento"))
        .filter { endereco -> endereco.complemento.isNotEmpty()}.let(::println)


    println("**************** Exemplo com Função de Alta Ordem no Autenticado **************************")
    val testaAuteticado = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(testaAuteticado, 1234){
        println("Realizar Pagamento")
    }

}

