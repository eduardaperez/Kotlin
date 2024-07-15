package Caderno

import kotlin.math.*

fun main() {
    helloWorld()
    println("A soma de 10 e 5 é ${soma(10, 5)}")
    /*
    Função -> parte do programa que possui uma responsabilidade
    Estrutura ->
    fun nomeDaFuncao(identificador: Tipo) : tipoDeRetorno {
        return corpoDaFuncao
    parâmetros e tipos de retorno não são obrigatórios
    se não houver tipo de retorno, não precisa de return
     */
    /*
    Criação de funções ->
    Tipos de retorno:
    Unit - sem retorno (implícito)
    Int, Short, String, Char....
    Instância de classes
     */

    //Propriedades e funções de String ->
    val str = "Programação Kotlin"

    println("Tamanho da string: ${str.length}")
    println("Posição (index) 0 da sting: ${str[0]}")

    println(str.startsWith("pro", true))
    println(str.endsWith("abc"))
    println(str.substring(2,4))
    println(str.replace("Kotlin", "Kotlin é show!"))
    println(str.lowercase())
    println(str.uppercase())
    println("   meu nome é    ".trim())

    //Funções matemáticas ->
    println(max(5, 10)) //importou biblioteca
    println(min(5, 10))
    println(sqrt(45.67f)) //raiz quadrada
    println(PI)
    println(E) //euler
    println(round(232.2243)) //arredonda para cima

}

fun helloWorld() {
    println("Hello World")
}

fun soma(a: Int, b: Int): Int {
    return (a + b)
}

//funções de uma única linha ->
fun divisao(a: Float, b: Float) = (a / b)