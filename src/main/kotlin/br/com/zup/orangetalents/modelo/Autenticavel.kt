package br.com.zup.orangetalents.modelo

interface Autenticavel {
    fun autentica(senha: Int): Boolean
}