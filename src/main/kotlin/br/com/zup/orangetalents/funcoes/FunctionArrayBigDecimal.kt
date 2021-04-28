package br.com.zup.orangetalents.funcoes

import java.math.BigDecimal
import java.math.RoundingMode

//Criação de uma função array generics
//vararg => vai receber um grupo de variaveis
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal>{
    //vai incrementando o indice assim que entra cada variavel
    return Array<BigDecimal>(valores.size){
        //ocorre a alocação e conversão do dado
            i: Int ->  valores[i].toBigDecimal()
    }
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

//Função média com bigDecimal
fun Array<BigDecimal>.media(): BigDecimal{
    return if(this.isEmpty()){
        BigDecimal.ZERO
    }else{
        this.somatoria()/size.toBigDecimal()
    }
}