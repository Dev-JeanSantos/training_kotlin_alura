import kotlin.math.truncate

class Gerente( nome: String,
               cpf: String,
               salario: Double,
              val senha: Int)
    //Herança de funcionário
    :Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override val bonificacao: Double
        get() {
            return salario * 0.2 + salario
        }

    fun autentica(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }

}