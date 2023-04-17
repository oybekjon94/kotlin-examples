package atomicPractice6

//lists
fun main(){
    val ints = listOf(99,3,5,7,11,13)
    ints eq "[99,3,5,7,11,13]"

    //select each element in the List:
    var result = ""
    for (i in ints){
        result += "$i "
    }
    result eq "99,3,5,7,11,13"

    //"Indexing" into the List
    ints[4] eq 11
}