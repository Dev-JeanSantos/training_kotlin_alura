class SistemaInterno {

    fun entra(admin: FuncionarioAdministracao, senha: Int){
        if (admin.autentica(senha)){
            println("Bem Vindo ao ByteBank")
        }else{
            println("Erro na autenticação")
        }
    }
}