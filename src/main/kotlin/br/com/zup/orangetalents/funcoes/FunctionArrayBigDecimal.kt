package br.com.zup.orangetalents.funcoes

import java.math.BigDecimal

//Criação de uma função array generics
//vararg => vai receber um grupo de variaveis
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal>{
    //vai incrementando o indice assim que entra cada variavel
    return Array<BigDecimal>(valores.size){
        //ocorre a alocação e conversão do dado
            i: Int ->  valores[i].toBigDecimal()
    }
}