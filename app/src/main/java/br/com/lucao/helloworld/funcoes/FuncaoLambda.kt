package br.com.lucao.helloworld.funcoes

class FuncaoLambda {}

fun main() {

   val concat: (String, String) -> Unit = { val1, val2 -> println(val1 + " " + val2) }
   val numberOfLetters2 = { val1: String, val2: String ->
      println("$val1 has ${val1.length} letters and $val2 has ${val2.length} letters") }

   val div: (Int)-> Int = {it/ 2 }
   println(div(4))

   firstHighOrderFunction2("novo", "texto", concat)
   firstHighOrderFunction2("novo", "texto", numberOfLetters2)
}

fun firstHighOrderFunction2(text1: String, text2: String, operation: (String, String) -> Unit) {
   operation(text1, text2)
}