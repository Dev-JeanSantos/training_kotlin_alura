package br.com.zup.orangetalents.colecoes

fun main() {

    val assistiramCursoAndroid: MutableSet<String> = mutableSetOf<String>("Jean", "Camilla", "Charles", "Mel", "Fabio")
    val assistiramCursoLinux: MutableSet<String> = mutableSetOf<String>("Marcos", "Marta", "Jean", "Camilla")
    val assistiramTodos = mutableSetOf<String>()

    assistiramTodos.addAll(assistiramCursoAndroid)
    assistiramTodos.addAll(assistiramCursoLinux)

    assistiramTodos.add("Paulo")
    println("Com Set")
    println(assistiramTodos)
    println("----------------------------")

    //Operações de conjuntos do SET
    //Lembrando que a ordem das variaveis influencia as saidas
    println("Impressão com +")
    println(assistiramCursoAndroid + assistiramCursoLinux)
    println("----------------------------")

    println("Impressão com union")
    println(assistiramCursoAndroid union  assistiramCursoLinux)
    println("----------------------------")

    println("Impressão com - ")
    println(assistiramCursoAndroid -  assistiramCursoLinux)
    println("----------------------------")

    println("Impressão com - inverso")
    println(assistiramCursoLinux - assistiramCursoAndroid)
    println("----------------------------")

    println("Impressão com subtract ")
    println(assistiramCursoAndroid subtract  assistiramCursoLinux)
    println("----------------------------")

    println("Impressão com intersect ")
    println(assistiramCursoAndroid intersect assistiramCursoLinux)
    println("----------------------------")

    val conversaoLista = assistiramTodos.toMutableList()
    conversaoLista.add("Jean")
    println("Impressão conversão Set para List")
    println(conversaoLista)
    println("Impressão conversão List para Set")
    println(conversaoLista.toSet())


    //val assistiramTodos: Set<String> = assistiramCursoAndroid + assistiramCursoLinux

}




