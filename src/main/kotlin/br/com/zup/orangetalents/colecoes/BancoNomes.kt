package br.com.zup.orangetalents.colecoes

class BancoNomes {

    val nomes: Collection<String> get() = dados

    fun salva(nome: String){
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}