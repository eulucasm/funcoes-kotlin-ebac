package br.com.lucao.helloworld.funcoes.exercicios

class ExercicioTres {}

fun main() {

   val soma = {num1: Int,num2: Int -> println("A soma de $num1 + $num2 = ${num1+num2}")}
   calculadora(5,2, soma)

   val multi = {num1: Int,num2: Int -> println("A multiplicacao de $num1 * $num2 = ${num1*num2}")}
   calculadora(5,2,multi)
}


fun calculadora(num1: Int, num2: Int, operacao: (Int, Int) -> Unit) {
   operacao(num1, num2)
}