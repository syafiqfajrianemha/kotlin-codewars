package eightkyu

/**
 * Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.
 * Examples (input -> output)
 * 6, "I"     -> "IIIIII"
 * 5, "Hello" -> "HelloHelloHelloHelloHello"
 */
fun repeatStr(r: Int, str: String): String {
    var i = 1
    var value: String = ""
    while(i <= r) {
        value += str
        i++
    }
    return value
    // return str.repeat(r)
}

fun main() {
    println(repeatStr(6, "I"))
    println(repeatStr(5, "Hello"))
    println(repeatStr(5, ""))
    println(repeatStr(0, "kata"))
}