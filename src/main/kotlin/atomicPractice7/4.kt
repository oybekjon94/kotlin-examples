package atomicPractice7

class CoffeeReviewTwo(
    val name:String,
    val comment:String,
    val stars:Int? = null
)
fun printReviewTwo(reviewTwo:CoffeeReviewTwo) {
    println("${reviewTwo.name} gave it ${reviewTwo.stars} stars!")
}

fun main() {
    val saraReview = CoffeeReviewTwo("Sara", "Loved the coffee", 5)
    val tobyReview = CoffeeReviewTwo("Toby", "Pretty good", 4)
    val oybekReview = CoffeeReviewTwo("Oybek","will buy this again")
    println("Latest coffee reviews")

    printReviewTwo(saraReview)
    printReviewTwo(tobyReview)
    printReviewTwo(oybekReview)
}