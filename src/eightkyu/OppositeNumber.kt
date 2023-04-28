package eightkyu

/**
 * Very simple, given an integer or a floating-point number, find its opposite.
 * Examples:
 * 1: -1
 * 14: -14
 * -34: 34
 */
fun opposite(number: Int): Int {
    return if(number > 0) -number else number - (number * 2)
    // return -number
}

fun main() {
    println(opposite(1))
    println(opposite(14))
    println(opposite(-34))
    println(opposite(0))
}