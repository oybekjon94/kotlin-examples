package section_3
//Generics
//Generics create parameterized types: components that work across multiple types.
fun main(){
    Event<String>( "oybek")
    Event(256)
    Event(true)
}

class Event<T>(value: T){
    init{
        println(value.toString().length)
    }
}