fun main(){
    //Crie um programa onde o usuário possa cadastrar estudantes sem limites
    // , e, em seguida, Se o usuário digitar "PARE" o programa deve exibir
    // a quantidade de estudantes cadastrados e a lista com cada um deles.

    var estudantesList = mutableListOf<String>()
    var contador  = 0
    var resposta: String = "S"

while (resposta == "S") {
    println("Informe o nome do estudante que deseja cadastrar: ")
    val estudante: String = readln().toString()

    if (estudantesList.add(estudante)) {
        contador = contador + 1
    }


    println("Estudante cadastrado.\nA lista atual é : $estudantesList")


    println("Deseja cadastrar um novo aluno? (S/Pare)")
    resposta = readln().trim()

    if (resposta.equals("S",  ignoreCase = true))
        {
        println("Você será redirecionado...")
        }
    else if (resposta.equals("Pare", ignoreCase= true))
    {

        println("O número de estudantes cadastratos é : $contador e a lista atual é $estudantesList")
    }

}

}