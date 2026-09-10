fun main() {
    fazerAFeira()
}

fun fazerAFeira() {
    // CORREÇÃO: Adicionadas as aspas nas frutas da lista
    var feira = mutableListOf("jabuticaba", "cupuaçu", "tamarindo")

    // CORREÇÃO: Adicionadas as aspas no texto do println
    println("\nAs frutas disponíveis são : $feira")
    println("Informe a fruta escolhida:")
    var escolha = readln().lowercase().trim()

    // PRIMEIRA ESCOLHA TRATADA DE FORMA INDEPENDENTE
    // Mudamos para rodar enquanto a escolha NÃO for válida para remoção
    while (escolha.isBlank() || escolha !in feira)
    {
        if (escolha.isBlank())
        {
            println("Nada foi digitado.")
        }
        else if (escolha !in feira)
        {
            println("Indisponível no nosso mercado")
        }

        println("Digite novamente:")
        escolha = readln().lowercase().trim()
    }

   if (escolha in feira)
   {
    feira.remove(escolha)
    println("Fruta retirada da lista!\nA lista atual é $feira")
   }

    ///////////////////////////////////////////////////////////////////////////////


    println("Escolha a 2º fruta:")
    var escolha2 = readln().lowercase().trim()

    // Mudamos para rodar enquanto a escolha2 NÃO for válida para remoção
    while (escolha2.isBlank() || escolha2 !in feira || escolha2 == escolha)
    {
        if (escolha2.isBlank())
        {
            println("Nada foi digitado.")
        }

        else if (escolha2 == escolha)
        {
            println("Fruta já retirada da lista!")
        }

        else if (escolha2 !in feira)
        {
            println("Indisponível no nosso mercado")
        }

        println("Digite novamente:")
        escolha2 = readln().lowercase().trim()
    }

    if (escolha2 in feira) {
    feira.remove(escolha2)
    println("Fruta retirada da lista!\nA lista atual é $feira")}

    println("Deseja continuar comprando? (S Ou pare)")
    var simouNao = readln().lowercase()


    while (simouNao != "s" && simouNao != "pare")
    { println("Deseja continuar comprando? (S Ou PARE)")
        simouNao = readln().lowercase().trim()
    }

    if(simouNao== "pare" || simouNao=="n" || simouNao == "Nao")
    { println("Compra finalizada! O restanteS foi: $feira")

    }


    else if (simouNao=="s")
    {
        println("Escolha a 3º fruta: \nA lista atual é $feira")

        var escolha3 = readln().lowercase().trim()

        while (escolha3.isBlank() || escolha3 !in feira) {
            if (escolha3.isBlank()) {
                println("Nada foi digitado.")
            } else if (escolha3 !in feira) {
                println("Indisponível no nosso mercado")
            }

            println("Digite novamente:")
            escolha3 = readln().lowercase().trim()
        }

        when (escolha3 in feira)
        {
            true -> feira.remove(escolha3)
         else-> {println("cenário impossível")}
        }
        println("Feira finalizada, parabéns pelas compras!")
    }
}
