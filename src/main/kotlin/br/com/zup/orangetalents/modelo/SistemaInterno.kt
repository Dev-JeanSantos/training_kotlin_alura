package br.com.zup.orangetalents.modelo

import br.com.zup.orangetalents.exception.FalhaAutenticacaoException

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int){

        try {
            (admin.autentica(senha))
                println("Bem Vindo ao ByteBank")
        }catch (e: FalhaAutenticacaoException){
            println("Erro na autenticação")
        }
    }
}