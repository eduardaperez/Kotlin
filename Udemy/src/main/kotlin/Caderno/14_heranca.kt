package Caderno

open class Eletronico(var marca: String) {
    private fun ativarCorrente(){} //private pode ser usado no construtor, nas variáveis e nas classes(se usado não pode herdar)
    protected fun desativarCorrente(){} //protected pode ser usado apenas pela classe filha
    fun ligar() {
        ativarCorrente()
    }
    fun desligar() {
        desativarCorrente()
    }

}

class Computador(marca: String) : Eletronico(marca) {
    fun instalarSoftware() {}
    fun processar() {}
    fun reiniciar(){
        desativarCorrente()
    }
}

fun main() {
    var c: Computador = Computador("Lenovo")

    with(c) {
        ligar()
        desligar()
        instalarSoftware()
        processar()
        reiniciar()
        marca
    }
}