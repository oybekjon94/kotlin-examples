package atomicPractice2

//booleans
fun isOpen(hour: Int){
    val open = 9
    val closed = 20
    println("Operating hours: $open - $closed")
    val status =
        if (hour >= open && hour <= closed)
            true
        else
            false
    println("Open: $status")
}
fun main() = isOpen(6)