package eightkyu

/**
 * We need a function that can transform a number (integer) into a string.
 * What ways of achieving this do you know?
 * Examples (input --> output):
 * 123  --> "123"
 * 999  --> "999"
 * -100 --> "-100"
 */
fun numberToString(num: Int): String {
    return num.toString()
}

fun main() {
    println(numberToString(123))
    println(numberToString(999))
    println(numberToString(-100))
}