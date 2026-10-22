// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args:Array<String>) {
    //converting c to f
    if (args.size == 3) {
        var currentTemp = args[0].toDouble()
        val maxTemp = args[1].toDouble()
        val tempInc = args[2].toDouble()
        if (currentTemp <= maxTemp) {
        println("Celcius|Fahrenheit")
        while (currentTemp <= maxTemp) {
            print("%9.2fc".format(currentTemp))
            println("%9.2ff".format((currentTemp * 9.0 / 5.0) + 32))
            currentTemp = currentTemp + tempInc.toDouble()
        }
            
        } else {
            println("Initial temperature is higher than max temperature.")
        }

        
    }
}
