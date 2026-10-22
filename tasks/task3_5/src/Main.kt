// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    val p = Path("test.txt")
    println(p.readText())
    val text = "This is the text I want in the file"
    p.writeText(text)
    val text2 = "This is the text i want in the file the second time around this time"
    p.appendText(text2)
    // Add your code here
}
