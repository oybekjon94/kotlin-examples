package section_3
// Kotlin continue
fun main(){
    var i = 0
    while (i < 10) {
        if (i == 4) {
            i++
            continue
        }
        println(i)
        i++
    }
}
/*output
0
1
2
3
5
6
7
8
9
 */