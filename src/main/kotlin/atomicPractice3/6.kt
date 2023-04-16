package atomicPractice3

//loopingAndRange
fun showRange(r: IntProgression){
    for (i in r){
        print("$i ")
    }
    print("   // $r")
    println()  //for newline
}
fun main(){
    showRange(1..5)
    showRange(0 until 5)
    showRange(5 downTo 1)
    showRange(0 .. 9 step 2)
    showRange(0 until 10 step 3)
    showRange(9  downTo 2 step 3)
}