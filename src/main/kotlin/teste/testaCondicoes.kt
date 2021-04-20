fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> {
            println("Sua conta está com o saldo positivo! ")
            println("Saldo = $saldo ")
        }
        saldo == 0.0 -> {
            println("Sua conta está sem saldo! ")
            println("Saldo = $saldo ")
        }
        else -> {
            println("Sua conta está com o saldo negativo! ")
            println("Saldo = $saldo ")

        }
    }
}