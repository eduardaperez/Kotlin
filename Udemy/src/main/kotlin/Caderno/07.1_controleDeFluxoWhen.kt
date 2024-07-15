package Caderno

fun bonusWhen(cargo: String): Float {
    return when (cargo) {
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Engenheiro de software" -> 1000f
        "Estagiário" -> 500f
        else -> 0f
    }
}
// quando if/else está em cascata, podemos usar When
fun main() {

    println (bonusWhen("Coordenador"))

    val n = true
    when (n) {
        true -> println("1..10")
        false -> println("11..100")
    }
}
