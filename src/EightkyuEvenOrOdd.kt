/**
 * Create a function that takes an integer as an argument
 * and returns "Even" for even numbers or "Odd" for odd numbers.
 */
fun evenOrOdd(number: Int): String {
    return if(number % 2 == 0) {
        "Even"
    } else {
        "Odd"
    }
}

fun main() {
    println(evenOrOdd(2))
    println(evenOrOdd(10))
    println(evenOrOdd(7))
    println(evenOrOdd(1))
}