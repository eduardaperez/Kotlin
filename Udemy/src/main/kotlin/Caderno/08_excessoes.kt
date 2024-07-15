package Caderno
fun main() {
//NullSafety: previne que erros aconteçam caso var sejam nulas = para evitar o NullPointerException(erro de variável nunca utilizada)

    var s:String? = null //? deixa var aceitar null

    println(s?.length) //aqui tbm com ? para o kotlin tratar
    //println(s!!.length) para assumir o erro


//Try/catch: para o código continuar funcionando mesmo após o erro
    try {
        println(s!!.length)
    } catch (e: NullPointerException){
        println("Nulo try/catch")
    } catch (e: Exception) {//+ de um catch, colocar em ordem de prioridade
        println("Genérico, colocar por último")
    }finally {//sempre executado e opcional
            println("Teste Finally")
    }


//Operador Elvis ?: : para usar no lugar de if/else
    println(s ?: "Nulo Elvis") //o que vem aopós ?: é o tratamento de excessão
    //não é operador ternário


//Let: ganho no escopo da função com it. Fica no lugar de if
    if (s != null){
        s.length
    }

    s?.let {
        it.length
    }
}