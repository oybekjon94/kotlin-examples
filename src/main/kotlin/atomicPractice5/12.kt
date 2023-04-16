package atomicPractice5

//visibility
private var index = 0
private class Animal(val name:String)
private fun recordAnimal(
    animal: Animal
){
    println("Animal $index: ${animal.name}")
    index++
}

fun recordAnimals(){
    recordAnimal(Animal("tiger"))
    recordAnimal(Animal("antelope"))
}
fun recordAnimalsCount(){
    println("$index animals are here")
}
fun main(){
    recordAnimals()
    recordAnimalsCount()
}