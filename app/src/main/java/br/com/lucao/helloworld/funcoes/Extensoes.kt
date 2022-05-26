package br.com.lucao.helloworld.funcoes

class Extensoes {}

fun main(){
   val number = 4
   println(number.isEven())

   val baseText = "Exemplo"
   baseText.myContat(" of extension")

   val result = 5.0 mySum 10.0
   println(result)

}

 infix fun Double.mySum(number2: Double): Double {
   return this + number2
}

fun String.myContat(text: String){
   println(this+text)
}

fun Int.isEven(): Boolean {
   return this % 2 == 0
}