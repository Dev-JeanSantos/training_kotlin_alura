import br.com.zup.orangetalents.teste.testaOperacoesAgregadoras
import java.math.BigDecimal
import java.math.RoundingMode

//*******IMPORTANTE****************
//Tudo no Kotlin são objetos (Classes)

fun main() {
   //Array de Objetos
   //Criação de um Array com BigDecimal(primitivo)
   val salarios= Array<BigDecimal>(5) { BigDecimal.ZERO }
   //Casting para toBigDecimal
   salarios[0] = "2450.00".toBigDecimal()
   salarios[1] = "5337.00".toBigDecimal()
   salarios[2] = "3422.00".toBigDecimal()
   salarios[3] = "1220.00".toBigDecimal()
   salarios[4] = "7988.00".toBigDecimal()
   //ContentToStrind => imprime os valores do vetor e não o endereço de memoria dele
   println("Salarios hardcore: ${salarios.contentToString()}")
   println("-------------------------------------------")

   //Criação de um array chamando o metodo que criamos
   val salarios2 = bigDecimalArrayOf("2500.00", "4500.00", "500.00", "6000.00")
   println("Salarios com a função: ${salarios2.contentToString()}")

   //Desenvolver a regra de negocio
   //Criaremos um novo array com o map que varrerá o array antigo
   val aumento = "1.1".toBigDecimal()
   val salariosComAumento: Array<BigDecimal> =
      salarios2.map { salario ->
         if (salario < "5000.00".toBigDecimal()){
            salario + "500.00".toBigDecimal()
         }else{
            (salario * aumento)
               .setScale(2, RoundingMode.UP) }//setScale => arrendondamento das casas e roundindUp=> valores pra cima
         }
         .toTypedArray()
         println("-------------------------------------------")
         println("Salarios com aumento 10%: ${salariosComAumento.contentToString()}")
         }

//Criação de uma função array generics
//vararg => vai receber um grupo de variaveis
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal>{
   //vai incrementando o indice assim que entra cada variavel
   return Array<BigDecimal>(valores.size){
      //ocorre a alocação e conversão do dado
      i: Int ->  valores[i].toBigDecimal()
   }
}





