package atomicPractice3

//in Keyword
fun main(){
    val percent = 35
    println(percent in 1..100)
    println("-------")
    val percent2 = 35
    println(0 <= percent2 && percent2 <= 100)
}