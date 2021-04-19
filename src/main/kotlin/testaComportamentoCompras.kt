fun testaComportamentoCompras() {
    var contaJean = Conta(titular = "Jean Santos", numero = 77320)
    contaJean.deposita(5000.00)

    var contaCamilla = Conta(titular = "Camilla Duarte", numero = 56972)
    contaCamilla.deposita(2300.00)

    print("Nome do Titular: ")
    println(contaJean.titular)
    print("Numero da Conta: ")
    println(contaJean.numero)
    print("Saldo da Conta: ")
    println(contaJean.saldo)
    println("-----------------------")

    print("Nome do Titular: ")
    println(contaCamilla.titular)
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
    print("Novo Saldo Após Depósito na Conta Camilla: ")
    println(contaCamilla.saldo)
    contaCamilla.saque(450.00)
    print("Novo Saldo Após Saque na Conta Camilla: ")
    println(contaCamilla.saldo)

    println("-----------------------")
    println("-----------------------")

    if (contaJean.tranfere(4850.00, contaCamilla)) {
        println("Transferência efetuada com sucesso")
    } else {
        println("Falha na Transferência!")
    }

    println("-----------------------")
    println("-----------------------")

    println("Saldo Conta Jean: ")
    println(contaJean.saldo)
    println("Saldo Conta Camilla: ")
    println(contaCamilla.saldo)
}