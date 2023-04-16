package atomicPractice5

//constructor
class AlienSpeecies(
    val name: String,
    val eeyes:Int,
    val hands:Int,
    val legs: Int
){
    fun describe()=
        "$name with $eeyes, "+
                "$hands hands and $legs legs"
}

fun main(){
    val kevin = AlienSpeecies("zegirion",2,2,2)
    val mortyjr = AlienSpeecies("gazortion",2,6,2)
    println(kevin.describe())
    println(mortyjr.describe())
}