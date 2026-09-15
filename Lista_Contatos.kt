data class Agenda (val nome : String,
                   val telefone : String) // necessário que cada contato tenha dois elementos , por isso , data class

val lista_Agenda = mutableListOf<Agenda>() // preciso que a lista de contatos seja encontrada por todos os subprogramas
var contador : Int = 0
fun main(){
    comeco()
}
fun comeco()
{
    print("Por favor, escolha uma opção: ")
    println("\n1- (Adicionar contatos)\n 2- (Buscar Contatos)\n 3- (Remover Contatos)\n 4- (Sair da Agenda)\n 5- (Listar contatos)")
    val resposta = readln().toInt()

    when (resposta) // vai ser true sempre
    {
        1 -> adicionar_Contatos()
        2 -> buscar_Contato()
        3 -> remover_Contato()
        4-> sair_daqui()
        5-> listar_Contatos()

        else -> erro_Aqui()
    }
}
fun adicionar_Contatos(){
    print("Informe o nome: ")
    val nome : String = readln().trim()

    print("Informe o número desse contato: ")
    val telefone: String= readln().trim()

  if(  lista_Agenda.add(Agenda(nome,telefone)) )// aqui : nome e telefone (data classes) foram adicionados à agenda (um espaço para dois elementos)
    contador = contador + 1

    print("Contato adicionado à agenda!")
    print("\n")
    print("\n")
    comeco()
}

fun buscar_Contato(){
    print("Informe o contato que deseja buscar: ")
    var busca : String = readln().trim()

   val nomeEncontrado = lista_Agenda.find{it.nome.contains(busca,ignoreCase= true)}
    //uma nova variavel foi criada pois os tipos precisam ser iguais (busca -> string precisa ser um objeto do array)
    //nomeEncontrado transformará a busca em um objeto da lista_agenda, se ele for encontrado. minusculas/maiusculas serao ignorados antes da busca.

    if (nomeEncontrado != null )
    {
        println("Contato encontrado!\nO contato de $busca é: ${nomeEncontrado.telefone}\n")
    }

    else { println("Esse contato não existe.\nO número de contados na agenda é : $contador")}

    comeco()
}

fun remover_Contato(){
    print("Informe o nome do contato que deseje remover: ")
    var remocao = readln().trim()

    var remover = lista_Agenda.find{ it.nome.equals(remocao, ignoreCase = true) }

    if (remover != null)
    {
        lista_Agenda.remove(remover)
        println("Contato removido da Agenda!")
        contador = contador - 1
    }
    else { print("Contato não encontrado.")}
    comeco()


}
fun sair_daqui(){
    println("Encerrando...")
    println("O número de contatos é: $contador")
    print("\n")
    comeco()
}
fun listar_Contatos(){
print("LISTA DE CONTATOS: ")

    if(lista_Agenda.isEmpty()) { print("Você não tem contatos...")}
    else
    {
        lista_Agenda.forEach { print("\nContato: \n Nome : ${it.nome}, Telefone: ${it.telefone}\n") }
    }
    print("\n")
    print("\n")
    comeco()

}

fun erro_Aqui(){
    println("Essa opção não existe. Escolha uma opção: ")
    println("\n1- (Adicionar contatos)\n 2- (Buscar Contatos)\n 3- (Remover Contatos)\n 4- (Sair da Agenda)")

    val resposta2 = readln().toInt()

    when (resposta2)
    {
        1 -> adicionar_Contatos()
        2 -> buscar_Contato()
        3 -> remover_Contato()
        4-> sair_daqui()

        else -> erro_Aqui()
    }
}
