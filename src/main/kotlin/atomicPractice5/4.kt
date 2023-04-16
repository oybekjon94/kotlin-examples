package atomicPractice5

import atomicPractice3.hasChar

//class
class Hamster{
    fun speak() = "Sqeuak! "
    fun exercise() =
        this.speak()+   //qualified with 'this'
                speak()+  //without 'this'
                "running on wheel"
}
fun main(){
    val hamster = Hamster()
    println(hamster.exercise())
}