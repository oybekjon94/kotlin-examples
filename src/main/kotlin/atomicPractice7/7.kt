package atomicPractice7

class Drumkit(var hasTopHAt:Boolean, var hasSnare:Boolean){
    fun playTopHat() {
        if (hasTopHAt) {
            println("ding ding ba-da-bing!")
        }
    }
    fun playSnare(){
       if (hasSnare){
           println("bang bang bang")
       }
    }

}
fun main(){
    val d = Drumkit(true, true)
    d.playTopHat()
    d.playSnare()
    d.hasSnare = false
    d.playTopHat()
    d.playSnare()


}