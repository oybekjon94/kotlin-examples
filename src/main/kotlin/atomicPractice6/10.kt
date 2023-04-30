package atomicPractice6

import com.sun.jdi.FloatType
import kotlin.math.ln
fun hasChar(s:String, ch:Char):Boolean{
    for (c in s){
        if (c == ch) return true
    }
    return false
}
fun main(){
    println(hasChar("kotlin",'t'))
    println(hasChar("kotlin",'a'))
}