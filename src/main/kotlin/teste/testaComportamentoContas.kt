import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaComportamentoContas() {
    var contaJean = ContaCorrente(titular = "Jean Santos", numero = 77320)
    contaJean.deposita(5000.00)

    var contaCamilla = ContaPoupanca(titular = "Camilla Duarte", numero = 56972)
    contaCamilla.deposita(2300.00)

    print("Nome do Titular: ")
    println(contaJean.titular)
    print("Numero da modelo.Conta: ")
    println(contaJean.numero)
    print("Saldo da modelo.Conta: ")
    println(contaJean.saldo)
    println("-----------------------")

    print("Nome do Titular: ")
    println(contaCamilla.titular)
    print("Numero da modelo.Conta: ")
    println(contaCamilla.numero)
    print("Saldo da modelo.Conta: ")
    println(contaCamilla.saldo)

    println("-----------------------")
    println("-----------------------")


    contaJean.deposita(50.00)
    print("Novo Saldo Após Depósito na modelo.Conta Jean: ")
    println(contaJean.saldo)
    contaJean.saque(200.00)
    print("Novo Saldo Após Saque na modelo.Conta Jean: ")
    println(contaJean.saldo)

    println("-----------------------")
    println("-----------------------")


    contaCamilla.deposita(275.00)
    print("Novo Saldo Após Depósito na modelo.Conta Camilla: ")
    println(contaCamilla.saldo)
    contaCamilla.saque(450.00)
    print("Novo Saldo Após Saque na modelo.Conta Camilla: ")
    println(contaCamilla.saldo)

    println("-----------------------")
    println("-----------------------")

    if (contaJean.tranfere(50.00, contaCamilla)) {
        println("Transferência efetuada com sucesso")
    } else {
        println("Falha na Transferência!")
    }

    println("-----------------------")
    println("-----------------------")

    println("Saldo modelo.Conta Jean: ")
    println(contaJean.saldo)
    println("Saldo modelo.Conta Camilla: ")
    println(contaCamilla.saldo)
}