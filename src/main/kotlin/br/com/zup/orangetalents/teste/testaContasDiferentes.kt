import br.com.zup.orangetalents.modelo.ContaCorrente
import br.com.zup.orangetalents.modelo.ContaPoupanca

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

    println("Saldo br.com.zup.orangetalents.modelo.Conta corrente: ${contaCorrente.saldo}")
    println("Saldo br.com.zup.orangetalents.modelo.Conta Poupança: ${contaPoupanca.saldo}")

    contaCorrente.tranfere(600.00, contaPoupanca)

    println("Saldo br.com.zup.orangetalents.modelo.Conta corrente: ${contaCorrente.saldo}")
    println("Saldo br.com.zup.orangetalents.modelo.Conta Poupança: ${contaPoupanca.saldo}")
}
