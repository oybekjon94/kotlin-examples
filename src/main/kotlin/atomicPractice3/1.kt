package atomicPractice3

import atomicPractice2.condition

//repetitionDoWhile
fun main(){
    var i = 0
    do {
        print(".")
        i += 10
    }while (condition(i))
}