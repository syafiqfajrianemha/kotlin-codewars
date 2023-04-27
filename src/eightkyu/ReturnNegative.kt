package eightkyu

/**
 * In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?
 *
 * Examples
 * Kata().makeNegative(1)  // return -1
 * Kata().makeNegative(-5) // return -5
 * Kata().makeNegative(0)  // return 0
 *
 * Notes
 * The number can be negative already, in which case no change is required.
 * Zero (0) is not checked for any specific sign. Negative zeros make no mathematical sense.
 */
class ReturnNegative {
    fun makeNegative(x: Int): Int {
        return if(x <= 0) {
            x
        } else {
            -x
        }
    }
}

fun main() {
    println(ReturnNegative().makeNegative(1))
    println(ReturnNegative().makeNegative(5))
    println(ReturnNegative().makeNegative(0))
    println(ReturnNegative().makeNegative(-42))
}