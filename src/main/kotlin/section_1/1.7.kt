package section_1
//Number Types
//Different types of numbers are stored in different ways.
fun bmiEnglish(
    weight: Int,
    height: Int
): String {
    val bmi =
        weight / (height*height)* 703.07
    return if (bmi < 18.5) "Underweight"
    else if(bmi < 25) "Normal weight"
    else "Overweight"
}
fun main(){
    val weight = 160
    val height = 60
    val status = bmiEnglish(weight,height)
    println(status)
}