package Caderno

fun main() {
    var nome = "Tony"
    var sobrenome = "Stark"

    //interpolação:
    println("Olá, $nome $sobrenome")

    //concatenação: quando for neessário colocar atributo:
    println("Double: ${Double.MAX_VALUE}")

    //para saber tamanho da String:
    nome.length

    //para quebrar String por ser grande:
    var str = "Ola," +
            "Apenas fui apertando a tecla Enter" +
            "Assim, ele automaticamente quebra," +
            "fechando as aspas e adicionando o +."
}