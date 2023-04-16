package atomicPractice4

//ExpressionStatement
fun unitFun() = Unit

fun main(){
    println(unitFun())
    val u1:Unit = println(42)
    println(u1)
    val u2 = println(0) //type inference
    println(u2)
}