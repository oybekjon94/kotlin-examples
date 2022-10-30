package section_2

//Objects store data using properties (vals and vars) and perform
// operations with this data using functions.
fun main(){
    val r1 = IntRange(0,10)
    val r2 = IntRange(5,7)
    println(r1)
    println(r2)
}
/* We create two objects (instances) of the IntRange class. Each object has its own
piece of storage in memory. IntRange is a class, but a particular range r1 from 0 to
10 is an object that is distinct from range r2.
*/