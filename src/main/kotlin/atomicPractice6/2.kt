package atomicPractice6

fun main(){
    trace("line 1")
    trace(47)
    trace("line 2")
    trace neq(
        """
        line 1
        47
        line
    """
    )
}