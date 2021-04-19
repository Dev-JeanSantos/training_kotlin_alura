fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Melisa",
        numero = 9990
    )
    val contaPoupanca = ContaPoupanca(
        titular = "Charles",
        numero = 9991
    )

    contaCorrente.deposita(1000.00)
    contaPoupanca.deposita(1000.00)

    contaCorrente.saque(100.00)
    contaPoupanca.saque(100.00)

    println("Saldo Conta corrente: ${contaCorrente.saldo}")
    println("Saldo Conta Poupança: ${contaPoupanca.saldo}")

    contaCorrente.tranfere(600.00, contaPoupanca)

    println("Saldo Conta corrente: ${contaCorrente.saldo}")
    println("Saldo Conta Poupança: ${contaPoupanca.saldo}")
}
