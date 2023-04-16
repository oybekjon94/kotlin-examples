package atomicPractice2

//NumberTypes
fun bmiEnglish(
    weight: Int,
    height: Int
):String{
    val bmi = weight / (height * height) * 703.07
    return if (bmi < 18.5) "Underweight"
    else if (bmi < 25) "normal weight"
    else "overweight"
}
fun main(){
    val weight = 160
    val height = 68
    val status = bmiEnglish(weight,height)
    println(status)
}