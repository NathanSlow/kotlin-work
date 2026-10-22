// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(T:Triangle):Boolean {
        // this method could be a little bit memory heavy
        val a = T.first//3
        val b = T.second//1.5
        val c = T.third//1.5
        val ab = a+b//4.5
        val ac = a+c//4.5
        val bc = b+c//3
        if (c >= ab || b >= ac || a >= bc) {
            return false
        } else {
            return true
        }
}

fun triangleArea(T:Triangle):Double {
        //do the alg
    if (isValidTriangle(T) == true) {
        val a = T.first
        val b = T.second
        val c = T.third
        val semiPerim = 0.5 * (a + b + c)
        val Area: Double = sqrt(semiPerim * (semiPerim - a) * (semiPerim - b) * (semiPerim - c))
        return Area
    } else {
        throw IllegalArgumentException()
    }
}
