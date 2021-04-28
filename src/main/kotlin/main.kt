import br.com.zup.orangetalents.funcoes.bigDecimalArrayOf
import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
      val salarios = bigDecimalArrayOf("2500.00", "4500.00", "500.00", "6000.00")
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
}

fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal) =
    if (salario < "5000.00".toBigDecimal()) {
        salario + "500.00".toBigDecimal()
    } else {
        (salario * aumento)
            .setScale(2, RoundingMode.UP)
    }

//Extension Function
//reduce irá receber valores e nesse caso irá somar cada incremento
fun Array<BigDecimal>.somatoria(): BigDecimal{
   return this.reduce { acumulador, valor ->
      acumulador + valor
   }
}


