package Caderno

fun main() {
    endereco("street", "ctba", "pr")
    endereco(cidade = "sp", rua = "street", estado = "sp") // se iniciar marcando parâmetros, é necessário marcar todos
    println(media(10f, 3f, 8.5f, 5f, 7.75f))
    println(mediaGenerics(false, 10f, 3f, 8.5f, 5f, "jnjb", 7.75f ))
}

fun endereco(rua: String, cidade: String, estado: String, cep: String = "", num: Int = 0) {
    //deixar valor padrão inserido quando o preenchimento não for obrigatório (valor default)
}

// Vararg para n argumentos do mesmo tipo
fun media(vararg notas: Float): Float {
    //usar vararg faz com que se possa passar vários parâmetros
    var soma = 0f
    for (n in notas) {
        soma += n
    }
    return (soma / notas.size)
}
// Generics para n argumentos com vários  tipo
fun <T, J> mediaGenerics(abc: J, vararg notas: T): Float {
    //a ferramenta generics permite entrada de vários tipos de variáveis. Deve ser colocada sempre ao final. Geralmente utilizado a letra "T"
    var soma = 0f
    for (n in notas) {
        if (n is Float) {
            soma += n
        }
    }
    return (soma / notas.size)
    //vararg criamos uma array
}