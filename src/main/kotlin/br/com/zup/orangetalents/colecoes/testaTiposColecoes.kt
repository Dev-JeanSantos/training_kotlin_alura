package br.com.zup.orangetalents.colecoes

fun testaTipoColecoes() {

    val banco = BancoNomes()
    val nomeSalvos:Collection<String> = banco.nomes

    banco.salva("Alex")
    println(nomeSalvos)
    println(BancoNomes().nomes)

}

fun testaCopias(){
    val nomes: Collection<String> = mutableListOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )
    for (nome in nomes) {
        for (nome in nomes) {
            println(nome)
        }
        println(nomes)
    }
}