package Caderno

fun main(){
    var a = Animal2("cachorro")
    a.fala = "auuuu"

    for (p in Prioridade.values()) {
        println(p)
    }
}

//Getter, Setter, Field - Encapsulamento

/**
 * Get - para obter ou acessar valor de uma propriedade
 * Set - para definir ou modificar o valor de uma propriedade
 * Field - obrigatório para não dar loop
 */
class Animal2(var especie:String){
    var fala:String = ""
        get() {
            println("Acesso get")
            return field //não deixa dar loop infinito
        }

        set(value) {
            println("Acesso set")
            field = value
        }
}

//Classes Enum: listar possíveis valores:

enum class Prioridade(val valor: Int){
    Baixa(1) {
        override fun toString(): String {
            return "Prioridade baixa: $valor"
        }
    },

    Media(5),

    Alta(10)
}



//Classes Data: possui toString() HashCode() e equals() :



