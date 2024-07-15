package Caderno

/**
 * Encapsulameto: Encapsula o código e esconde dados sensíveis
 * Herança: Doa comportamentos às classes filhas
 * Abstração: Comportamentos invisíveis, deixando aberto apenas o essencial (Private, Protected, Public)
 * Polimorfismo: Assume várias formas
 */
// Classes:
class Pessoa(val anoNascimento: Int, val nome: String) {
    var olhos:String = ""

    var doc: String? = null
    constructor(anoNascimento: Int, nome: String, doc: String) : this(anoNascimento, nome) {
        this.doc = doc //necessário para poder chamar
        //construtor é bom pois é possível trazer lógica, trabalhar o código, e no default não.
    }
    fun dormir() {
    }

    fun acordar() {
    }
}

class Vazia private constructor() //construtor privado
fun main() {

    var pessoa: Pessoa = Pessoa(2000, "Fulano", "2564646") // classe (instancia ->) objeto

    pessoa.nome //o . chama atributos e métodos de um objeto
    pessoa.olhos
    pessoa.acordar()
    pessoa.dormir()
    pessoa.doc

    /*
    Classe (depois de instanciada) = objeto
        - agrupa métodos (comportamentos) e atributos (características)
        - pode gerar vários objetos
    Métodos = funções
    Atributos =  variáveis
    Construtor é responsável por estanciar a classe.
        - não tem como tirar, mas da para deixar privado (private constructor())
        - dá para criar construtores dentro das classes - faz um secundário que chama o primário
            - secundário() : this()
            - this() é o objeto gerado pela classe - escopo da instância da classe - primário

     */
}