package Caderno/* Operadores de comparação, igualdade e lógicos->
    if (a > b) {} maior
    if (a < b) {} menor
    if (a >= b) {} maior igual
    if (a <= b) {} menor igual
    if (a == b) {} igual
    if (a != b) {} diferente
    if (!valor) {} negação
    if (a || b) {} disjunção (ou)
-> prioridade para:
    () -> ! -> && -> ||
-> operador intervalo:
    if (n >= 1 && n <= 50) {} -> if (n in 1..50) {}
*/
fun main() {
    /*
    existem passos a serem planejados e seguidos para se programar.
    Se houver desvios nesse caminho, faz-se necessário um controle de fluxo
    Os controladores de fluxo são boleanos e são executados na condição verdadeira.
     */

    //if ->
    val num = 10
    if (num > 20) {
        println("Número maior que 20")
    }

    //if/eslse ->
    fun maiorDeIdade(idade: Int) {
        if (idade >= 18) {
            println("Maior de idade") //tbm é possível aninhar "if"'s
        } else { //tbm é possível fazer "else if" antes de else
            println("Menor de idade")
        }
    }
    maiorDeIdade(20)
    maiorDeIdade(18)
    maiorDeIdade(15)

    //outra forma possível com if/else ->
    fun saudacao(dia: Boolean): String {
        return if (dia) {
            "Bom dia"
        } else {
            "Boa noite"
        }
    }
}

    /*exercicio1() {

    println("Formas geométricas")
    println("____________________________________________")
    println("Informe o lado 1: ")
    val n1 = readLine()

    println("Informe o lado 2: ")
    val n2 = readLine()

    println("Informe o terceiro (Se não houver, digite 0): ")
    val n3 = readLine()

    if (n1 != null && n1 != "" && n2 != null && n2 != "" && n3 != null && n3 != "" ) {
        val x = n1.toInt()
        val y = n2.toInt()
        val z = n3.toInt()

        if (x == y && (z == null || z == 0)){
            println("É um quadrado")
        } else if (x != y && (z == null || z == 0)) {
            println("Não é um quadrado")
        } else if (x == y && y == z) {
            println("É um triângulo equilátero")
        } else {
            println("Não é um triângulo equilátero")
        }
     }
     */


    /* Exercício2() {

    println("Informe sua idade: ")
    val idade = readLine()

    if (idade != null && idade != "") {
        if (idade.toInt() < 18){
            println("Negado. Idade não permitida!")
            return
        }
    }

    println("Qual o código completo do seu convite? ")
    val tipoConvite = readLine()

    if (tipoConvite != null && tipoConvite != "") {
        if (tipoConvite.lowercase().startsWith("xl") || tipoConvite.lowercase().startsWith("xt")) {
            println("Welcome!")
        } else {
            println("Convite inválido.")
            return
        }
    }
    */
