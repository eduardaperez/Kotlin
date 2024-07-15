package Caderno

fun main() {

    var i = 0
    // do, primeiro executa e depois verifica
    do {
        print("$i ")
        i++
    }while (i < 10)

    println("")

    do {
        print("Qual o seu nome?: ")
        val value = readLine()
    } while (value == "")
}