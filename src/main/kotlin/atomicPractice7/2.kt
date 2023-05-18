package atomicPractice7

import javax.print.attribute.standard.SheetCollate

enum class SchnauresBread(val height:Int) {
    MINIATURE(32),
    STANDART(23),
    GIANT(232);

    val family:String = "Schnauzer"
    fun isShortterThan(centimeter:Int) = height < centimeter

    }
fun main(){
    val bred:SchnauresBread = SchnauresBread.GIANT
    println(bred.height)
    println("----")
    println(SchnauresBread.MINIATURE.height)
    println("-----")
    println(SchnauresBread.STANDART.family)
    println(SchnauresBread.STANDART.isShortterThan(10))
}