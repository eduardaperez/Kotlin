fun maiorDeIdade(idade: Int) {
    if (idade > 18) {
        println("Maior de idade")
        if (idade > 60)
            println("!!!Terceira idade")
    } else if (idade < 14) {
        println("Criança")
    } else {
        println("Menor de idade")
    }
}
fun saudacao(dia: Boolean) = if (dia) {
    println("Bom dia!")
} else {
    println("Boa noite!")
}
fun bonusAnualIf(cargo: String, experiencia: Int): Float {
    return if (cargo == "gerente") {
        if (experiencia < 2) {
            2000f
        } else {
            3000f
        }
    } else if (cargo == "coordenador") {
        if (experiencia < 1) {
            1500f
        } else {
            1800f
        }
    } else if (cargo == "engenheiro") {
        1000f
    } else if (cargo == "estagiário") {
        500f
    } else {
        0f
    }
}
fun bonusAnualWhen(cargo: String): Float {
    return when(cargo) {
        "gerente" -> 2000f
        "coordenador" -> 1500f
        "engenheiro" -> 1000f
        "estagiário" -> 500f
        else -> 0f
    }
}
fun vOrf(a: Boolean, b: Boolean, c: Boolean, d:Boolean) {

    println(a && b && c && d)
    println(!a && !b && (c && d))
    println(a && ((b || c) || d))
    println(a || ((!b && c) || !d))
}
fun exLacosFor() {

    for (i in 0..50){

        if (i % 5 == 0) {
            continue
        }
        print("$i ")
    }

    println()

    var n = 0
    for (i in 0..50){
        n += i
    }
    print("$n ")

}
fun escadaFor(){

    println("Digite um número de 1 a 10: ")
    val n = readln().toInt()

    if (n in 1..10) {
        for (i in 1..n) {
            for (j in 1..i){
                print("#")
            }
            println()
        }
    } else {
        println("Número inválido")
    }
}
/*fun escadaWhile(n:Int){
    var i = 1

    while (i <= n){
        println("#")
        i++
    }
}

 */
fun caixaDagua(){
    val caixa = 2000
    val balao = 7
    var totalBalao = 0

    while ((totalBalao * balao) + balao <= caixa) {
        totalBalao++
    }
    print("Será utilizada $totalBalao balões de água")
}
fun fizzBuzz(){
    var i = 1

    while (i <= 50){

        if (i % 3 == 0 && i % 5 == 0){
            println("FizzBuzz ")
        } else if (i % 5 == 0){
            println("Fizz ")
        } else if (i % 3 == 0) {
            println("Buzz ")
        } else {
            println("$i ")
        }
        i++
    }
}
fun procXeO(str: String): Boolean{
    val strLower = str.lowercase()

    var nO = 0
    var nX = 0
    var i = 0

    while (i < strLower.length) {
        if (strLower[i] == 'o'){
            nO++
        } else if (strLower[i] == 'x'){
            nX++
        }
        i++
    }

    return (nO == nX && nO > 0)
}
fun desafioContFluxo(){

    var patAna = 0f
    var patPaula = 0f
    var mes = 0
    val salario = 10000f

    do {
        patAna += ((salario * 0.05f) * 2) + (patAna * 0.002f)
        patPaula += (salario * 0.05f) + (patPaula * 0.008f)
        mes++

        println("Mês $mes: Pat. Ana - $patAna ___________ Pat. Paula - $patPaula")
    } while (mes < 360)

    println("Pat. Ana - $patAna ___________ Pat. Paula - $patPaula")
    println("Paula irá ultrapassar o patrimônio de Ana no mês $mes")

}


fun main() {

}
