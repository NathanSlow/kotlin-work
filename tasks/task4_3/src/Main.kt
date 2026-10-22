// Task 4.3: grade calculation using a when expression
import kotlin.math.roundToInt
fun main(args:Array<String>) {
    if (args.size == 3) {
        var average = (args[0].toInt() + args[1].toInt() + args[2].toInt())/3.0
        when(average.roundToInt()) {
            in 0..39 -> println("Fail")
            in 40..69 -> println("Pass")
            in 70..100 -> println("Distinction")
        }
        
    }
}
