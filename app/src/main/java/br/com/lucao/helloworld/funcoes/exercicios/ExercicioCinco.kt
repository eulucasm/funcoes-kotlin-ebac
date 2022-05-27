package br.com.lucao.helloworld.funcoes.exercicios

class ExercicioCinco {}

fun main() {

   val nomeLista = listOf("Nome1","Nome2","Nome3", "nome4")
   val nomeOla = nomeLista.map{"Ola $it"}

   nomeOla.forEach{
      println(it)
   }

   val nomeComOla2 = nomeLista.map{"Ola $it"}.forEach{println(it)}
   println(nomeComOla2)

}