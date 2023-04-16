package atomicPractice5

//properties
class House{
    var sofa:String = ""
}
fun main(){
    val house = House()
    house.sofa = "Simple sleeper sofa: $100"
    println(house.sofa)
    house.sofa = "New leather sofa: $150"
    println(house.sofa)

}