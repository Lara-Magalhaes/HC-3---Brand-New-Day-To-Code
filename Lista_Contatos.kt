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
    println("\n1- (Adicinar contatos)\n 2- (Buscar Contato)\n 3- Remover Contato\n 4- Sair da Agenda")
    val resposta : = readln().toInt()

    when (resposta) // vai ser true sempre
    {
        1 -> adicionar_Contatos()
        2 -> buscar_Contato()
        3 -> remover_Contato()
        4-> sair_daqui()

        else -> erro_aqui()
    }
}
fun adicionar_Contatos(){
    print("Informe o nome: ")
    val nome : String = readln().trim()

    print("Informe o número desse contato: ")
    val telefone: String= readln()

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
        print("Contato encontrado!\nO contato de $busca é: ${nomeEncontrado.telefone}")
    }

    else { println("Esse contato não existe.\nO número de contados na agenda é : $contador")}

}

fun remover_Contato(){
    print("OI")
}
fun sair_daqui(){
    print("ieeeeeiy")
}

fun erro_aqui(){
    print("NURRO")
}