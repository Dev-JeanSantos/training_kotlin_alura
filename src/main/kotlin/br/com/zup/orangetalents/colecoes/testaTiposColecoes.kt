package br.com.zup.orangetalents.colecoes

fun testaTipoColecoes() {

    val banco = BancoNomes()
    banco.salva("Alex")
    println(banco.nomes)
    println(BancoNomes().nomes)

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