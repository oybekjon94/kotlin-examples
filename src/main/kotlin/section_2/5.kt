package section_2

class Hamster{
    fun speak() = "Squeak! "
    fun exersice() =
        this.speak()+
                speak()+
                "running on wheel"
}
fun main(){
    val hamster = Hamster()
    println(hamster.exersice())
}