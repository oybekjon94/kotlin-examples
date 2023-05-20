package atomicPractice7

import java.util.*
val taxMultiplier = 1.09

fun calculateTotalWithFiveDollarDiscount(initialPrice: Double): Double {
    val priceAfterDiscount = initialPrice - 5.0
    val total = priceAfterDiscount * taxMultiplier

    return total
}
fun main(){
    val total = calculateTotalWithFiveDollarDiscount(20.0)
    println("$%.2f".format(total))
}