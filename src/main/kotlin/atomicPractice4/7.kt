package atomicPractice4

//booleans
fun main(){
    val opens = 9
    val closes = 20
    println("Operating hours: $opens - $closes")
    val hour = 6
    println("current time: " + hour)

    val isOpen = hour >= opens && hour <= closes
    println("open: " + isOpen)
    println("not open: "+ !isOpen)

    val isClosed = hour < opens || hour > closes
    println("closed: " + isClosed)
}