package br.com.zup.orangetalents.modelo

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario){
            this.total += funcionario.bonificacao
    }

    /*************USO DO ANY*****************
    fun registra(funcionario: Any){
        Casting com Any atraves do as
        funcionario as Funcionario

        Casting e Validação do Any atraves do is
        Smart Test
        if (funcionario is Funcionario) {
            this.total += funcionario.bonificacao
        }
    }*/
}