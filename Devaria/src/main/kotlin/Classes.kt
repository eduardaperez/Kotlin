import classes.Produto

fun main(argumentos : Array<String>) {
    if (argumentos.isEmpty()){
        println("Favor, informar a lista de produtos que deseja comprar")
        return
    }

    val itensDisponiveis = arrayOf(
        Produto(nome = "Arroz", preco = 35.10),
        Produto(nome = "Azeite", preco = 16.90),
        Produto(nome = "Carne", preco = 59.89),
        Produto(nome = "Açucar", preco = 2.40)
    )

    val itensSelecionadosDisponiveis = itensDisponiveis.filter {
            produto -> argumentos.any {
                argumento -> argumento.equals(produto.nome, ignoreCase = true)
            }
    }

    for (itemSelecionadoDisponivel in itensSelecionadosDisponiveis) {
        println(itemSelecionadoDisponivel.exibirDadosProduto())
    }

    val argumentosSelecionadosNaoDisponiveis = argumentos.filter {
            argumento -> !itensDisponiveis.any {
                produto -> produto.nome.equals(argumento, ignoreCase = true)
            }
    }

    argumentosSelecionadosNaoDisponiveis.forEach {
        argumento -> println("Este produto nós não temos: $argumento")
    }

    itensDisponiveis.sortBy { it.nome }
    itensDisponiveis.forEach { println("Confira este produto disponível: ${it.exibirDadosProduto()}") }
}