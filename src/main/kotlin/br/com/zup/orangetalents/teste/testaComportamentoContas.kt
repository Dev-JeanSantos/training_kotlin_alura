import br.com.zup.orangetalents.exception.FalhaAutenticacaoException
import br.com.zup.orangetalents.exception.SaldoInsuficienteException
import br.com.zup.orangetalents.modelo.Cliente
import br.com.zup.orangetalents.modelo.ContaCorrente
import br.com.zup.orangetalents.modelo.ContaPoupanca

fun testaComportamentoContas() {

    val jean = Cliente(nome = "Jean Santos", cpf = "676.253.98-87", senha = 1)
    val camilla = Cliente(nome = "Camilla Santos", cpf = "080.348.957-92", senha = 2)

    var contaJean = ContaCorrente(titular = jean, numero = 77320)
    contaJean.deposita(5000.00)

    var contaCamilla = ContaPoupanca(titular = camilla, numero = 56972)
    contaCamilla.deposita(2300.00)

    print("Nome do Titular: ")
    println(contaJean.titular.nome)
    print("Numero da Conta: ")
    println(contaJean.numero)
    print("Saldo da Conta: ")
    println(contaJean.saldo)
    println("-----------------------")

    print("Nome do Titular: ")
    println(contaCamilla.titular.nome)
    print("Numero da Conta: ")
    println(contaCamilla.numero)
    print("Saldo da Conta: ")
    println(contaCamilla.saldo)

    println("-----------------------")
    println("-----------------------")


    contaJean.deposita(50.00)
    print("Novo Saldo Após Depósito na Conta Jean: ")
    println(contaJean.saldo)
    contaJean.saque(200.00)
    print("Novo Saldo Após Saque na Conta Jean: ")
    println(contaJean.saldo)

    println("-----------------------")
    println("-----------------------")


    contaCamilla.deposita(275.00)
    print("Novo Saldo Após Depósito na  Camilla: ")
    println(contaCamilla.saldo)
    contaCamilla.saque(450.00)
    print("Novo Saldo Após Saque na  Camilla: ")
    println(contaCamilla.saldo)

    println("-----------------------")
    println("-----------------------")


    try {
        (contaJean.tranfere(4840.00, contaCamilla, 2))
            println("Transferência efetuada com sucesso")
    }catch (e: SaldoInsuficienteException) {
        println("Falha na Transferência!")
        println("Saldo Insuficiente")
        e.printStackTrace()
    }catch (e: FalhaAutenticacaoException){
        println("Falha na Transferência!")
        println("Falha na Autenticação!!")
        e.printStackTrace()
    }

    println("-----------------------")
    println("-----------------------")

    println("Saldo  Jean: ")
    println(contaJean.saldo)
    println("Saldo  Camilla: ")
    println(contaCamilla.saldo)
}