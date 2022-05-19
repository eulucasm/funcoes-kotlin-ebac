package br.com.lucao.helloworld.funcoes

class FuncaoDeOrdemSuperior {}

fun main() {
   firstHighOrderFunction("String1", "String2", ::concatString)
   firstHighOrderFunction("Another", "text", ::printStringNumberOfLetter)
}

fun printStringNumberOfLetter(val1: String, val2: String) =
   println("$val1 has ${val1.length} letters and $val2 has ${val2.length} letters")

fun concatString(val1: String, val2: String) = println(val1 + val2)

fun firstHighOrderFunction(text1: String, text2: String, operation: (String, String) -> Unit) {
   operation(text1, text2)
}