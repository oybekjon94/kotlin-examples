package atomicPractice

//if Expressions/TrueOrFalse
fun trueOrFalse(exp: Boolean):String{
    if (exp)
        return "it's true"
    return "it's false"
}
fun main(){
    val b = 1
    println(trueOrFalse(b < 3))
    println(trueOrFalse(b >= 3))
}