package atomicPractice4

//in Keyword/floatingPoint
fun inFloatRange(n:Double){
    val r = 1.0..10.0
    println("$n in $r? ${n in r}")
}
fun main(){
    inFloatRange(0.999999)
    inFloatRange(5.0)
    inFloatRange(10.0)
    inFloatRange(10.0000001)
}