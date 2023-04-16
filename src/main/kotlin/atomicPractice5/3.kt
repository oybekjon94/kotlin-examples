package atomicPractice5

//Class
class Cat{
    fun meow() = "mrroow"
}
fun main(){
    val cat = Cat()
    //Call 'meow()' for 'cat'
    val m1 = cat.meow()
    println(m1)
}