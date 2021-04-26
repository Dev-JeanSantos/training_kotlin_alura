package br.com.zup.orangetalents.exception

class SaldoInsuficienteException(
    mensagem: String= "O Saldo é Insuficiênte"
) : Exception(mensagem)
