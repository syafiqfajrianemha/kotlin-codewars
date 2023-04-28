package eightkyu

/**
 * It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string.
 * You're given one parameter, the original string. You don't have to worry with strings with less than two characters.
 * Example:
 * "eloquent" -> "loquen"
 * "country" -> "ountr"
 */
fun removeChar(str: String): String {
    // return str.substring(1..str.length-2)
    // return str.substring(1, str.lastIndex)
    return str.drop(1).dropLast(1)
}

fun main() {
    println(removeChar("eloquent"))
    println(removeChar("country"))
    println(removeChar("person"))
    println(removeChar("place"))
}