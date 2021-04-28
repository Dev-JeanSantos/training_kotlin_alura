import br.com.zup.orangetalents.funcoes.bigDecimalArrayOf
import br.com.zup.orangetalents.funcoes.calculaAumentoRelativo
import br.com.zup.orangetalents.funcoes.media
import br.com.zup.orangetalents.funcoes.somatoria
import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
      val salarios = bigDecimalArrayOf("2500.00", "4500.00", "500.00", "6000.00", "12000.00", "3450.99", "1200.00")
      println("Salarios com a função: ${salarios.contentToString()}")

      val aumento = "1.1".toBigDecimal()
      val salariosComAumento: Array<BigDecimal> =
         salarios.map { salario ->calculaAumentoRelativo(salario,aumento)}
            .toTypedArray()
      println("-------------------------------------------")
      println("Salarios com aumento: ${salariosComAumento.contentToString()}")

      //Utilização da função que criamos somatoria, incrementar todos salarios reajustados
      val gastoMensalInicial = salariosComAumento.somatoria()
    println("-------------------------------------------")
      println("Somatório inicial $gastoMensalInicial")

    //função que irá calcular o total de todos os salarios ajustados durante 6 meses
    // utilizando a função fold
    val meses = "6".toBigDecimal()
    val salarioPrazo = salariosComAumento.fold(gastoMensalInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println("-------------------------------------------")
    println("O Custo salarial nos proximos 6 meses: $salarioPrazo")

    //Novo desafio pegar a média dos 3 maiores salarios do array
    //Ordenando os salario com o sort
    val salariosOrdenados = salariosComAumento.sorted()
    //Função take (pega os res primeiros numeros do array)
    val tresMenores = salariosOrdenados.take(3)
    println("-------------------------------------------")
    println("OS três menores salarios: $tresMenores")
    //Função takeLast (pega os três ultimos numeros do array/ toTypeArrays converte em array novamente)
    val tresMaiores: Array<BigDecimal> = salariosOrdenados.takeLast(3).toTypedArray()
    println("-------------------------------------------")
    println("OS três maiores salarios: $tresMaiores")

    //Calcular a média dos 3 maiores salarios
    val media = tresMaiores.media()
    println("-------------------------------------------")
    println("A média do 3 maiores salarios: $media")

}



