package atomicPractice5

//constructor
class Scientist(val name:String){
    override fun toString(): String {
        return "Scientist('$name')"
    }
}
fun main(){
    val zeep = Scientist("Zeep Xanflorp")
    println(zeep)
}