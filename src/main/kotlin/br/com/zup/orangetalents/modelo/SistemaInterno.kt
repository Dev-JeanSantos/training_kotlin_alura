package br.com.zup.orangetalents.modelo

import br.com.zup.orangetalents.exception.FalhaAutenticacaoException

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int, autenticado: () -> Unit = { }){

        try {
            (admin.autentica(senha))
                println("Bem Vindo ao ByteBank")
                autenticado()
        }catch (e: FalhaAutenticacaoException){
            println("Erro na autenticação")
        }
    }
}