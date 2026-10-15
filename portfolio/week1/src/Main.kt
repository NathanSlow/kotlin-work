// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess
fun main(args: Array<String>) {
    if (args.size == 3) {
        //do the alg
        val a = args[0].toDouble()
        val b = args[1].toDouble()
        val c = args[2].toDouble()
        val semiPerim = 0.5 * (a + b + c)
        val Area: Double = sqrt(semiPerim * (semiPerim-a) * (semiPerim-b) * (semiPerim-c))
        println("Area = ${String.format("%.5f", Area)}")
    } else {
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }
}