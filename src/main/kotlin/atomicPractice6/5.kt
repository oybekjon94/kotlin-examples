package atomicPractice6

//exception
fun main(){
    capture{
        "1$".toInt()
    } eq "NumberFormatException: " +
            """For input string: "1$""""
}