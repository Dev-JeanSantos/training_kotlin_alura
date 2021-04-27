import br.com.zup.orangetalents.teste.testaExceptionsRferenciasNulas

//*******IMPORTANTE****************
//Tudo no Kotlin são objetos (Classes)

fun main() {

//   val idade1 = 25
//   val idade2 = 19
//   val idade3 = 93
//   val idade4 = 20
//
//   val maiorIdade = if (idade1 > idade2 && idade1 > idade3) {
//      idade1
//   } else if (idade2 > idade1 && idade2 > idade3) {
//      idade2
//   } else {
//      idade3
//   }
//   println(maiorIdade)

   //Para evitar implementações em momento que é acesscentado uma idade iremos utilizar Arrays

   var idades = IntArray(5)
   idades[0] = 256
   idades[1] = 19
   idades[2] = 93
   idades[3] = 36
   idades[4] = 1024

   var maiorIdade = 0
   for (idade in idades){
      if(idade > maiorIdade){
         maiorIdade = idade
      }
   }
   println("---------Array------------")
   println(maiorIdade)

   //uso do IntArrayOf
   val idades2:IntArray = intArrayOf(25, 19,93,35,32)
   var maiorIdadeIntArrayOf = Int.MIN_VALUE
   for (id in idades2){
      if(id > maiorIdadeIntArrayOf){
         maiorIdadeIntArrayOf = id
      }
   }
   println("---------IntArrayOf------------")
   println(maiorIdadeIntArrayOf)

   //Uso do foreach
   val idades3:IntArray = intArrayOf(25, 19,93,35,32)
   var menorIdade = Int.MAX_VALUE

   idades3.forEach { i ->
      if (i < menorIdade){
         menorIdade = i
      }
   }
   println("---------ForEach------------")
   println(menorIdade)


}

