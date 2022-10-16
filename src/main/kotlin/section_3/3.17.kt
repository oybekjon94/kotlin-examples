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
/*output
outer loop :10
inner loop :1
inner loop :2
inner loop :3
inner loop :4
inner loop :5
 */