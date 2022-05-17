package br.com.lucao.helloworld.funcoes


class FuncaoSimples {
}

fun main() {
   myFirstFunction()
   personalFunction("lucas")
   personalFunction2("lucas", "Marques", 32)
   val retorno1 = retorno("lucas", 32)
   println(retorno1)
   personalFunction3("Lucas", 20)

   val restante = resto(10, 3)
   println(restante)

   val restante2 = resto2(15, 4)
   println(restante2)
}


fun myFirstFunction() {
   println("Minha funcão")
}

fun personalFunction(nome: String) {
   println("Olá $nome, tudo bem")
}

fun personalFunction2(nome: String, sobrenome: String, idade: Int) {
   println("Olá $nome $sobrenome, tudo bem, sua idade é $idade anos!")
   when {
      idade > 25 -> println("você é cringe")
      else -> println("voce é jovem")
   }
}

fun retorno(nome: String, idade: Int): String {
   var retorno = "Olá $nome, tudo bem, sua idade é $idade anos!"

   retorno += when {
      idade > 25 -> "você é cringe"
      else -> "voce é jovem"
   }
   return retorno
}

fun personalFunction3(nome: String, idade: Int, sobrenome: String = "Marques") {
   println("Meu nome é $nome $sobrenome, e minha idade é $idade anos")
}

fun resto(val1: Int, val2: Int): Int {
   return val1 % val2
}

fun resto2(val1: Int, val2: Int) = val1 % val2
