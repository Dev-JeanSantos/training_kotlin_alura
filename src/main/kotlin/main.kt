fun main() {

    val gerente = Gerente(
        nome = "Marcos Alves",
        cpf = "666.666.666-66",
        salario = 1000.00,
        senha = 12345
    )
    val diretor = Diretor(
        nome = "Pedro Ferraz",
        cpf = "777.777.777-77",
        salario = 6000.00,
        senha = 123,
        plr = 400.00
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 12345)
    sistema.entra(diretor, 123)

}








