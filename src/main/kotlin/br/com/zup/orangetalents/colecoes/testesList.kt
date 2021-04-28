package br.com.zup.orangetalents.colecoes
fun testesList() {
    val assistiramCursoAndroid = listOf("Jean", "Camilla", "Charles", "Mel", "Fabio")
    val assistiramCursoLinux = listOf("Marcos", "Marta", "Jean", "Camilla")

    val assistiramAmbosCursos = mutableListOf<String>()
    assistiramAmbosCursos.addAll(assistiramCursoAndroid)
    assistiramAmbosCursos.addAll(assistiramCursoLinux)

    val assistiramAmbosCursos2 = assistiramCursoAndroid + assistiramCursoLinux

    println("Assistiram ambos 1 usando distinct")
    println(assistiramAmbosCursos.distinct())
    println("Assistiram ambos 2")
    println(assistiramAmbosCursos2)
    println("Pegar apenas um unico elemento da lista")
    println(assistiramAmbosCursos[5])
}