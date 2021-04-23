package br.com.zup.orangetalents.modelo

class Analista(nome: String,
               cpf: String,
               salario: Double,
               val plr: Double)
    //Herança de funcionário
    : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override val bonificacao: Double
        get() {
            return salario * 0.1
        }

}