import br.com.zup.orangetalents.modelo.*

fun testaFuncionarios() {
    val funcionarioAlex: Funcionario = Analista(
        nome = "Jean",
        cpf = "676.253.985-87",
        salario = 2500.00,
        plr = 300.00
    )

    val gerentePedro: Gerente = Gerente(
        nome = "Pedro Dias",
        cpf = "000.000.000-00",
        salario = 5000.00,
        senha = 123456
    )

    val gerenteMarcos: Gerente = Gerente(
        nome = "Marcos Pontes",
        cpf = "111.111.111-11",
        salario = 7000.00,
        senha = 123
    )

    val diretoraMarcia: Diretor = Diretor(
        nome = "Marcia Santos",
        cpf = "333.333.333-33",
        salario = 10000.00,
        senha = 54321,
        plr = 8000.00
    )

    val analistaMaria: Analista = Analista(
        nome = "Maria da Penha",
        cpf = "444.444.444-44",
        salario = 3400.00,
        plr = 300.00
    )

    println("-------------Dados do Funcionário---------------")
    println("Nome: ${funcionarioAlex.nome}")
    println("Cpf: ${funcionarioAlex.cpf}")
    println("Salario: ${funcionarioAlex.salario}")
    println("Bonificação: ${funcionarioAlex.bonificacao}")

    println("-------------Dados do br.com.zup.orangetalents.modelo.Gerente---------------")
    println("Nome: ${gerentePedro.nome}")
    println("Cpf: ${gerentePedro.cpf}")
    println("Salario: ${gerentePedro.salario}")
    println("Bonificação: ${gerentePedro.bonificacao}")
    if (gerentePedro.autentica(123456)) {
        println("Autenticação realizada com sucesso!")
    } else {
        println("Falha na Autenticação")
    }

    println("-------------Dados do br.com.zup.orangetalents.modelo.Gerente---------------")
    println("Nome: ${gerenteMarcos.nome}")
    println("Cpf: ${gerenteMarcos.cpf}")
    println("Salario: ${gerenteMarcos.salario}")
    println("Bonificação: ${gerenteMarcos.bonificacao}")
    if (gerenteMarcos.autentica(123456)) {
        println("Autenticação realizada com sucesso!")
    } else {
        println("Falha na Autenticação")
    }

    println("-------------Dados do br.com.zup.orangetalents.modelo.Diretor---------------")
    println("Nome: ${diretoraMarcia.nome}")
    println("Cpf: ${diretoraMarcia.cpf}")
    println("Salario: ${diretoraMarcia.salario}")
    println("Bonificação: ${diretoraMarcia.bonificacao}")
    println("Participação Anual dos Lucros: ${diretoraMarcia.plr}")

    println("-------------Dados do br.com.zup.orangetalents.modelo.Analista---------------")
    println("Nome: ${analistaMaria.nome}")
    println("Cpf: ${analistaMaria.cpf}")
    println("Salario: ${analistaMaria.salario}")
    println("Bonificação: ${analistaMaria.bonificacao}")
    println("Participação Anual dos Lucros: ${analistaMaria.plr}")


    var calculador = CalculadoraBonificacao()
    calculador.registra(funcionarioAlex)
    calculador.registra(gerenteMarcos)
    calculador.registra(gerentePedro)
    calculador.registra(diretoraMarcia)

    println("Total de Bonificações a todos funcionarios: ${calculador.total}")
}