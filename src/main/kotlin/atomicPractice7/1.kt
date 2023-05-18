package atomicPractice7

class Circle(var radius:Double){
    private val pi:Double =3.14

    fun circumference() = 2 * pi * radius
    fun area() = pi * radius * radius
    fun diamter() = 2 * radius
}


fun main(){
    val smallCircle = Circle(5.2)
    val circumferenceOfSmallCircle:Double = smallCircle.circumference()
    val areaOfSmallCircle = smallCircle.area()
    val diameterOfSmallCircle = smallCircle.diamter()

    println(circumferenceOfSmallCircle)
    println(areaOfSmallCircle)
    println(diameterOfSmallCircle)
}