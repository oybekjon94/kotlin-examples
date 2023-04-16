package atomicPractice5

//consturtor
class Alien(name:String){
    val greeting = "Poor $name"
}
fun main(){
    val alien = Alien("Mr. Meeseks")
    println(alien.greeting)
    //alien.name //error
}