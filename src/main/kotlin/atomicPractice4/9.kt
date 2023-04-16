package atomicPractice4

//stringTemplate
fun json(q: String, a:Int) = """{
    "question" : "$q",
    "answer" : $a
}"""

fun main(){
    println(json("the ultimate",42))
}