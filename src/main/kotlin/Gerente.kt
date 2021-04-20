import kotlin.math.truncate

class Gerente( nome: String,
               cpf: String,
               salario: Double,
               senha: Int)
    //Herança de funcionário
    :FuncionarioAdministracao(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
),Autenticavel {
    override val bonificacao: Double
        get() {
            return salario * 0.2 + salario
        }

}