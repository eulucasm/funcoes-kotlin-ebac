package br.com.lucao.helloworld.funcoes.exercicios

class ExercicioQuatro {}

fun main() {
   val lista:MutableList<Int> = mutableListOf()
   var n = 1
   do{
      lista.add(n)
      n += 1
   }while(n!=100)

   val numerosListaMap = lista.filter{it%2==0}
      .forEach{println("Os numeros pares da lista sao: $it")}
}
