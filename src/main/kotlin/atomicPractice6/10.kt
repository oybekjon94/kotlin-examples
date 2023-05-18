import java.util.*
//you can be exhaustive even without else condition
fun main(){
    val islightbulbOn = true

    val reaction = when(islightbulbOn){
        true -> "it's bright"
        false -> "I can't see"
    }
    println(reaction)
}