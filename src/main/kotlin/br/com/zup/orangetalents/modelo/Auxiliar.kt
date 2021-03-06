package br.com.zup.orangetalents.modelo

class Auxiliar(nome: String,
               cpf: String,
               salario: Double,
               val senha: Int)
    //Herança de funcionário
    : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override val bonificacao: Double
        get() = salario * 0.15
}