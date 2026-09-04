fun main(){
    //Exiba uma lista de planetas do sistema solar ("Mercúrio", "Vênus", "Terra",
// "Marte", "Júpiter", "Saturno", "Urano", "Netuno" e "Plutão") para o usuário.
//  Em seguida, peça ao usuário para digitar o nome de um planeta.
// Verifique se o planeta que o usuário informou está na lista e informe ao usuário.

var planetas = listOf<String>( "Mercúrio", "Vênus","Terra", "Marte",
    "Júpiter", "Saturno", "Urano", "Netuno", "Plutão")

    println("Olá!\nDigite um planeta para consultar: ")
    var inputUs = readln().lowercase()

    var trad = planetas.any { it.lowercase()==inputUs }

    if (inputUs=="plutão") {print("Obs: Desde 2006 , a categoria do astro mudou para 'Planeta anão'.")}

    if (trad) { println("\nPlaneta encontrado!\nA lista é:\n$planetas")}
    else {println("Planeta não encontrado")}


}