
fun main() {
                             //0       1       2
  //var listaNormal = listOf( 0,1,2,3,4,5,6,7,8,9,0)
    val listaMuteable = MutableList(25){
        numeroRandom()
    }
    //Lista muteable dentro de un ciclo forEach
    listaMuteable.forEach {
        println("LISTA EN POSICCIÓN "+ it +": "+numeroRandom () )
    }
}
//Función para calcular el número aleatorio
    fun numeroRandom(): Int{
        //numeroRandom().nextInt((endInclusive + 1) - start) + start
        var numeros =(1..9).random()
    return numeros
}