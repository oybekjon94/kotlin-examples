package section_2

class Cat{
    fun meow() = "mrrow!"
}
fun main(){
    val cat = Cat()
    //call 'meow()' for 'cat'
    val m1 = cat.meow()
    println(m1)
}