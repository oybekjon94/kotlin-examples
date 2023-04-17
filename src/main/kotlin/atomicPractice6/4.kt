package atomicPractice6

//testing/TDDWorks
fun calculateBMI(
    lbs:Double,
    height:Double
):String{
    val bmi = lbs / (height * height) *  703.07
    return if (bmi < 18.5) "underweight"
    else if (bmi < 25) "normal weight"
    else "overweight"
}
fun main(){
    calculateBMI(160.0, 68.0) eq "normal weight"
    calculateBMI(100.0, 68.0) eq "underweight"
    calculateBMI(200.0, 68.0) eq "overweight"
}