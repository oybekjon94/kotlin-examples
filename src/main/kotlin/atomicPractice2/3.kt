package atomicPractice2

//StringTemplates
fun main(){
    val condition = true
    println("${if (condition) 'a' else 'b'}")
    val x = 11
    println("$x + 4 = ${x + 4}")
}