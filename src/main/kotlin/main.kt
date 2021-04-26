import br.com.zup.orangetalents.modelo.Endereco
import br.com.zup.orangetalents.teste.funcao1

//*******IMPORTANTE****************
//Tudo no Kotlin são objetos (Classes)

fun main() {
   var enderecoNulo: Endereco? = Endereco()
   //Utilizando a interrogação para evitar NullPointException
   println(enderecoNulo?.logradouro)
   //ou podemos utilizar o let
   enderecoNulo?.let { endereco: Endereco ->
      println(endereco.logradouro.length)
   }
}
