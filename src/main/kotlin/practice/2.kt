package practice

fun main(){
    //zipping
    val numbers = listOf(1,2,3)
    val words = listOf("one","two","three")

    val pairs = numbers.zip(words)
    println(pairs)
}