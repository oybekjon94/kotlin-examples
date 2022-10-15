package section_1
//A String template is a programmatic
//way to generate a String
fun main(){
    val condition = true
    println(
        "${if (condition)'a' else 'b'}"
    )
    val x = 11
    println("$x+4=${x+4}")
}
/* [1] if(condition) 'a' else 'b' is evaluated and
 the result is substituted
for the entire ${} expression.
 */
