package Caderno

fun main() {
    // while requer um Boolean
    // enquanto a condição não é satisfeita, ele executa
    // CUIDADO COM LOOP INFINITO!

    /*
    while (true) {
        print("v")
    }
    // enquanto não muda, fica em loop
     */

    val s = "Kotlin"
    var i = 0

    /*while (i <= 10) {
        print("$i ")
        i++
    }
    */

    while (i < s.length) {
        print("${s[i]}")
        i++
    }

}