// Task 4.2: use of if and ranges

fun main() {
    // Add your code here
    println("Pizza options:")
    println("Option A: Pepperoni")
    println("Option B: Meat Feast")
    println("Option C: Stuffed Crust")
    println("Option D: Cheese")
    val UChoice = readln().lowercase()
    val message = if (UChoice.length == 1 && UChoice[0] in 'a'..'d') "Order accepted" else "Invalid choice!"
    println(message)
}
