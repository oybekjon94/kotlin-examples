package atomicPractice3

//loopingAndRange
fun main(){
    val range1 = 1..10
    val range2 = 0 until 10
    println(range1)
    println(range2)

    println("----------")
    var sum = 0
    for (n in 1..100){
        sum += n
    }
    println("sum = $sum")
}