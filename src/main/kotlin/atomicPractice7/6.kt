package atomicPractice7

class Dog(val name:String, var weight:Int, val breed:String){


    fun bark(){
        println(if (weight < 20) "Yip" else "Woof")
    }

}

fun main(){
    val myDog = Dog("Simba",15,"Apchalka")
    myDog.bark()
    println(myDog.name)
    println(myDog.weight)
    println(myDog.breed)

    val yourDog  = Dog("kankal",30,"kankal")
    yourDog.bark()
    println("Mening kuuchugim katta")
}
