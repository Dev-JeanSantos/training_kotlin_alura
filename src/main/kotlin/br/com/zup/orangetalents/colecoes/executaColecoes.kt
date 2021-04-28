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

    //val assistiramTodos: Set<String> = assistiramCursoAndroid + assistiramCursoLinux

}




