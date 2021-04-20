package br.com.zup.orangetalents.modelo

class Gerente( nome: String,
               cpf: String,
               salario: Double,
               senha: Int)
    //Herança de funcionário
    : FuncionarioAdministracao(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel {
    override fun autentica(senha: Int): Boolean {
      return super<FuncionarioAdministracao>.autentica(senha)
    }

    override val bonificacao: Double
        get() {
            return salario * 0.2 + salario
        }

}