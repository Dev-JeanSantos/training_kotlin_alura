import kotlin.math.truncate

class Analista(nome: String,
               cpf: String,
               salario: Double,
               val plr: Double)
    //Herança de funcionário
    :Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override val bonificacao: Double
        get() {
            println("Bonificação Analista")
            return salario * 0.1
        }

}