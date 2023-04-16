package atomicPractice4

//BasicFunction
fun cube(x:Int):Int{
    return x * x * x
}
fun bang(s:String) = s + "!"

fun main(){
    println(cube(3))
    println(bang("pop"))
}