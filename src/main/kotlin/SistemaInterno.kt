class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int){
        if (admin.autentica(senha)){
            println("Bem Vindo ao ByteBank")
        }else{
            println("Erro na autenticação")
        }
    }
}