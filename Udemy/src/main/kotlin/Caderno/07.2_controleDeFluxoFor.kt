package Caderno

fun main() {
    // for é para laços de repetição. Ele percorre uma lista de elementos.
    // for permite criar variavel sem var ou val
    for (i in 0..18 step 3){
        print("$i ")
    }

    for (j in 21 downTo 0 step 3) {
        print("$j ")
    }

    val s = "Kotlin"
    for (char in s) {
        print("$char ")
    }

}