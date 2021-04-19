import kotlin.math.truncate

class Diretor(nome: String,
              cpf: String,
              salario: Double,
              senha: Int,
              val plr: Double)
    //Herança de funcionário
    :FuncionarioAdministracao(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {

    override val bonificacao: Double
        get() {
            return  salario + plr
        }
}