package br.com.lucao.helloworld.funcoes

class HighOrderAndLambda {}

fun main() {

   firstHighOrderFunction3(
      "novo",
      "texto"
   ) { val1: String, val2: String -> println("$val1 $val2") }

   firstHighOrderFunction3(
      "textooo",
      "novinho"
   ) { val1: String, val2: String ->
      println(val1)
      println(val2)
      println("Hello fuckingWorld")
   }

   val operation = {
      number: Int, number2: Int ->
      var result = number * 2
      result /= number2
      result += number + number2
      result
   }
   println(operation(4,2))

}

fun printStringNumberOfLetter2(val1: String, val2: String) =
   println("$val1 has ${val1.length} letters and $val2 has ${val2.length} letters")

fun firstHighOrderFunction3(text1: String, text2: String, operation: (String, String) -> Unit) {
   operation(text1, text2)
}