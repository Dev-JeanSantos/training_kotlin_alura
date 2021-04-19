fun main() {
    println("Bem Vindo ao ByteBank")

    val funcionarioAlex = Funcionario(
        nome = "Jean",
        cpf = "676.253.985-87",
        salario = 2500.00
    )
    println("-------------Dados do Funcionário---------------")
    println("Nome: ${funcionarioAlex.nome}")
    println("Cpf: ${funcionarioAlex.cpf}")
    println("Salario: ${funcionarioAlex.salario}")
    println("Bonificação: ${funcionarioAlex.bonificacao()}")


    val gerentePedro = Gerente(
        nome = "Pedro Dias",
        cpf = "000.000.000-00",
        salario = 5000.00,
        senha = 123456
    )
    println("-------------Dados do Gerente---------------")
    println("Nome: ${gerentePedro.nome}")
    println("Cpf: ${gerentePedro.cpf}")
    println("Salario: ${gerentePedro.salario}")
    println("Bonificação: ${gerentePedro.bonificacao()}")

    if(gerentePedro.autentica(123456)){
            println("Autenticação realizada com sucesso!")
        }else{
            println("Falha na Autenticação")
    }

    val gerenteMarcos = Gerente(
        nome = "Marcos Pontes",
        cpf = "111.111.111-11",
        salario = 7000.00,
        senha = 123
    )
    println("-------------Dados do Gerente---------------")
    println("Nome: ${gerenteMarcos.nome}")
    println("Cpf: ${gerenteMarcos.cpf}")
    println("Salario: ${gerenteMarcos.salario}")
    println("Bonificação: ${gerenteMarcos.bonificacao()}")

    if(gerenteMarcos.autentica(123456)){
            println("Autenticação realizada com sucesso!")
        }else{
            println("Falha na Autenticação")
    }

}





