package atomicPractice5

//visibility
class Cookiee(
    private var isReady: Boolean
){
    private fun crumble()= println("crumble")
    fun bite() = println("bite")
    fun eat(){
        isReady = true
        crumble()
        bite()
    }
}
fun main(){
    val x = Cookiee(false)
    x.bite()
    //can't access private members
    //x.isReady
    //x.crumble()
    x.eat()
}