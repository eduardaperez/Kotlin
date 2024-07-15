package Caderno

// Init
class Animal(var especie: String) {
    var fala: String? = null
    init { //inicialização - código que é executado qnd a classe é instanciada
        if (especie == "cachorro") {
            fala = "auau"
        } else if (especie == "gato") {
            fala = "miau"
        } else if (especie == null || especie == "") {
            fala = "cri cri"
        } else {
            fala = "Como ser´que faz o $especie?"
        }
    }
    fun falar() {
        println(fala)
    }
    init {
        println("Tendeu?")
    }

}

fun main() {
    Animal("").falar()
}