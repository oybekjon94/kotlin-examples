package atomicPractice6

//lists/OutOfBounds
fun main(){
    val ints = listOf(1,2,3)
    capture {
        ints[3]
    }contains
            listOf("ArrayIndexOutOfBoundsException")
    println(ints)
}