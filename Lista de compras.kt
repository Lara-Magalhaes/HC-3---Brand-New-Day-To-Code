fun main() {
    fazerAFeira()
}

fun fazerAFeira() {

    var feira = mutableListOf("jabuticaba", "cupuaçu", "tamarindo")

    println("\nAs frutas disponíveis são : $feira")
    println("Informe a fruta escolhida:")
    var escolha = readln().lowercase().trim()

    // PRIMEIRA ESCOLHA TRATADA DE FORMA INDEPENDENTE (e as outras também)

    while (escolha.isBlank() || escolha !in feira)
    {
        if (escolha.isBlank())
        {
            println("Nada foi digitado.")
        }
        else if (escolha !in feira)
        {
            println("Indisponível no nosso mercado. As disponíveis são $feira")
        }

        println("Digite novamente:")
        escolha = readln().lowercase().trim()
    }

   if (escolha in feira) // If iniciado para fins de organização, apenas
   {
    feira.remove(escolha)
    println("Fruta retirada da lista!\nA lista atual é $feira")
   }

    ///////////////////////////////////////////////////////////////////////////////

    println("Escolha a 2º fruta:")
    var escolha2 = readln().lowercase().trim()

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


    while (simouNao != "s" && simouNao != "pare" && simouNao != "nao" && simouNao != "não" )
    { println("Deseja continuar comprando? (S Ou PARE)")
        simouNao = readln().lowercase().trim()
    }

    if(simouNao== "pare" || simouNao=="n" || simouNao == "nao")
    { println("Compra finalizada! A lista atual é: $feira")

    }

    else if (simouNao=="s")
    {
        println("Escolha a 3º fruta: \nA lista atual é $feira")

        var escolha3 = readln().lowercase().trim()

        while (escolha3.isBlank() || escolha3 !in feira || escolha3==escolha2)
        {

            if (escolha3.isBlank())
            {
                println("Nada foi digitado.")
            }
            else if (escolha3==escolha2)
            {
                println("Fruta já retirada da lista!\nA lista atual é : $feira")
            }
            else if (escolha3 !in feira)
            {
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
