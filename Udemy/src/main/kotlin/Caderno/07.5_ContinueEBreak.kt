package Caderno

fun main() {

    while (true) {
        println("v")
        break // para o laço de repetição apenas no escopo ao qual está inserido
    }

    var i = 0
    while (i < 100000000) {

        if (i == 50) {
            break
        }

        print("$i ")
        i++
    }

    println("")

    while (i < 100) {

        if (i < 50) {
            i++
            continue // ignora a atuação atual e passa para a próxima
        }

        print("$i ")
        i++
    }
}