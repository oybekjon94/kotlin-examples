package atomicPractice5

//constructor
/*
if you want the constructor parameter to be accessible outside
the class body ,define it as a var or val in the parameter list
 */
class MutableNameAlien(var name:String)
class FixedNameAlien(val name:String)

fun main(){
    val alien1 = MutableNameAlien("Reverse Giraffe")
    val alien2 = FixedNameAlien("Krombopolis Michael")

    alien1.name = "parasite"
    println(alien1.name)
    //can't do this
    //alien2.name = "parasite
}