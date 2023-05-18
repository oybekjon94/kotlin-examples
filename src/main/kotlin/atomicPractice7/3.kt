package atomicPractice7

class CoffeeReview(
    val name:String,
    val comment:String,
    val stars:Int
)
fun printReview(review:CoffeeReview) {
    println("${review.name} gave it ${review.stars} stars!")
}

fun main() {
    val saraReview = CoffeeReview("Sara", "Loved the coffee", 5)
    val tobyReview = CoffeeReview("Toby", "Pretty good", 4)
    val oybekReview = CoffeeReview("Oybek","will buy this again",0)
    println("Latest coffee reviews")

    printReview(saraReview)
    printReview(tobyReview)
    printReview(oybekReview)
}