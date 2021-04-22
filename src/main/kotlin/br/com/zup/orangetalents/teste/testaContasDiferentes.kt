import br.com.zup.orangetalents.modelo.Cliente
import br.com.zup.orangetalents.modelo.ContaCorrente
import br.com.zup.orangetalents.modelo.ContaPoupanca
import br.com.zup.orangetalents.modelo.Endereco

fun testaContasDiferentes() {

    val melissa = Cliente(
        nome = "Melissa Duarte Santos",
        cpf = "000.000.000-00",
        senha = 3,
        endereco = Endereco(
            logradouro = "Rua Manoel Novis",
            numero = 201
        )
    )

    val contaCorrente = ContaCorrente(
        titular = melissa,
        numero = 9990
    )
    contaCorrente.titular.nome="Mel"

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(
            nome = "Jean Charles Duarte Santos",
            cpf = "111.111.111.-11",
            senha = 4,
            endereco = Endereco(
                logradouro = "Rua João",
                numero = 3992
            )
        ),
        numero = 9991
    )

    contaCorrente.deposita(1000.00)
    contaPoupanca.deposita(1000.00)

    contaCorrente.saque(100.00)
    contaPoupanca.saque(100.00)

    println("Nome correntista: ${contaCorrente.titular.nome}")
    println("Endereço correntista: ${contaCorrente.titular.endereco.logradouro }")
    println("numero correntista: ${contaCorrente.titular.endereco.numero }")
    println("Saldo corrente: ${contaCorrente.saldo}")

    println("Nome poupancista: ${contaPoupanca.titular.nome}")
    println("Saldo Poupança: ${contaPoupanca.saldo}")

    contaCorrente.tranfere(600.00, contaPoupanca)

    println("Saldo Conta corrente: ${contaCorrente.saldo}")
    println("Saldo Conta Poupança: ${contaPoupanca.saldo}")
}
