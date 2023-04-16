package atomicPractice2

import javax.print.DocFlavor.INPUT_STREAM

//numberTypes
fun main(){
    val i = 0    //Infers Int
    val l1 = 0L  //L creates Long
    val l2:Long = 0 //Explicit type
    println("$l1 $l2")
    println("---------")
    val a = Int.MAX_VALUE
    println(0L + a + a)
    println(1_000_000 * 1_000_000L)
    println("---------")
    println(Long.MAX_VALUE)
}