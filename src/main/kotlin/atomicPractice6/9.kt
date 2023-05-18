package atomicPractice6

fun main(){
    val quantity = 3

    val pricePerBook = when (quantity) {
        1 -> 19.99
        2 -> 19.99
        3 -> 19.99
        4 -> 19.99
        else -> 19.99
    }
    println(pricePerBook)
}