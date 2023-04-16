package atomicPractice2

//NumberTypes
fun bmiMetric(
    weight: Double,
    height: Double
):String{
    val bmi = weight / (height * height)
    return if (bmi < 18.5) "Underweight"
    else if (bmi < 25) "normal weight"
    else "overweight"
}
fun main(){
    val weight = 72.57
    val height = 1.727
    val status = bmiMetric(weight,height)
    println(status)
}