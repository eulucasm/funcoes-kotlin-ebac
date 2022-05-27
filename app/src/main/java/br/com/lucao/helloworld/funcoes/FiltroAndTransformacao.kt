package br.com.lucao.helloworld.funcoes

class FiltroAndTransformacao {}

fun main() {
   val listNumber = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
   val citiesList = listOf("Campinas", "monte mor", "Hortolandia", "Paulinia")
   val statesList = listOf("São paulo", "Rio de janeiro", "Espirito santo", "Minas Gerais")

   

   /**Associate
   val mapCities = citiesList.associateWith{ it.length }
   val mapLength = citiesList.associateBy { it.length }
   println(mapCities)
   println(mapLength)
   */
   /**Zip
   val cityState = citiesList.zip(statesList) { city, state ->
      "$city é relacionado a fake $state\n"
   }
   println(cityState)
   */
   /** Map
   val div = listNumber.map{ it / 2 }
   println(div)
   val modifiedCities = citiesList.map{"Olá $it\n"}
   println(modifiedCities)
    */
   /** Filter
   val filtered = listNumber.filter{ it % 2 == 0 }
   val filteredNot = listNumber.filterNot { it % 2 == 0 }
   val biggerThan4 = listNumber.filter { it > 4 }
   println(filtered)
   println(filteredNot)
   println(biggerThan4)
    */
}