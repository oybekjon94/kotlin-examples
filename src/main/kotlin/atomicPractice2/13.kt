package atomicPractice2

//boolean
fun isClosed(hour: Int){
    val open = 9
    val closed = 20
    println("Operating hours: $open - $closed")
    val status = hour < open || hour > closed
    println("Closed: $status")

}
fun main() = isClosed(6)