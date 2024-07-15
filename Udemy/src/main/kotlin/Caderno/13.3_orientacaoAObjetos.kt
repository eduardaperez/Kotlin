package Caderno

//with: com alguma coisa
fun main() {
    val str = "Programação Kotlin"

    str.uppercase()
    str.lowercase()
    val size = str.length

// Faz o uso da instância da classe para chamar diversos métodos
// Scope function
// Pode-se ler "com esse objeto, faça.."
    with(str) {
        uppercase()
        lowercase()
        val size = length
    }

    //lateinit
    val receita = Receita()

    // Acessar a variável sem antes inicializar resulta em erro.
    println(receita.instrucoes)

    receita.geraReceita()
    println(receita.instrucoes)
}

//lateinit
/**
 * Em alguns casos, é necessário que hava um processamento ou uma lógica antes da atribuição do valor a variável.
 * Para isso e também evitar declarar a variável como nula, é usado a palavra lateinit.
 *
 * Variáveis declaradas com lateinit não são alocadas na memória até que sejam inicializadas.
 */

class Receita {
    lateinit var instrucoes: String

    fun geraReceita() {
        // Preenchimento através da função
        instrucoes = "Lave as mãos."
    }
}