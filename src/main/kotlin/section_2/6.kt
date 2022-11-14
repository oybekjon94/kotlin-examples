package section_2

//properties
class House{
    var sofa: String = ""

}
fun main(){
    val house = House()
    house.sofa = "simple sleeper sofa: $8900"
    println(house.sofa)
    house.sofa = "new leather sofa: $3,099.00"
    println(house.sofa)
    //cannot reassign teh val to a new House:
    //house = House()
}