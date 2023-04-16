package atomicPractice

//functions
fun multipleByTwo(x:Int):Int{
    println("inside multipleByTwo")
    return x * 2
}
fun main(){
    val r = multipleByTwo(5)
    println(r)

}