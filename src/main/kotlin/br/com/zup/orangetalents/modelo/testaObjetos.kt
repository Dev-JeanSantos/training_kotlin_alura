package br.com.zup.orangetalents.modelo

//Object Declarations - Objetos anonimos similares a classes,
//onde podemos adicionar properties(atributos) e metodos de classes,
//possui nome, e sempre tem que estão em arquivos,  fora do escopo de uma função

        //object Contador{
        // var total = 0
        //}


fun testaObjetos(){
    //Object Expressions - Objetos anonimos similares a classes,
    //onde podemos adicionar properties(atributos) e metodos de classes,
    // não possui nome, e sempre tem que estar dento do escopo de uma função

    val  fran = object{
        val nome: String = "fran"
        val cpf: String = "987.789.897-87"
        val senha: Int = 321123

    }

    val paulo = Cliente(nome = "Paulo", cpf = "123.123.123-12", senha = 12345)
    val meire = Cliente(nome = "Meire", cpf = "123.123.123-12", senha = 12345)
    val contaPoupancaPaulo = ContaPoupanca(titular = paulo, numero = 1001)
    val contaCorrentePaulo = ContaCorrente(titular = paulo, numero = 1002)
    val contaCorrenteMeire = ContaCorrente(titular = meire, numero = 1003)

    println("Total de Contas ${Conta.total}")
}