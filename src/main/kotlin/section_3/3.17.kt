package section_3
// label
fun main(){
    val num:Array<Int> = arrayOf(10,20,30)
    outer@for (element: Int in num){
        println("outer loop :"+ element)

        inter@for (i:Int in 1..7){
            println("inner loop :" +i)

            if (i == 5)
                break@outer
        }
    }
}