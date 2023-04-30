package eightkyu

/**
 * Complete the square sum function so that it squares each number passed into it
 * and then sums the results together.
 * For example, for [1, 2, 2] it should return 9
 * because 1akar2 + 2akar2 + 2akar2 = 9
 */
fun squareSum(n: Array<Int>): Int {
    var result: Int = 0
    for(i in n) {
        result += i*i
    }
    return result
}

fun main() {
    println(squareSum(arrayOf(1, 2)))
    println(squareSum(arrayOf(0, 3, 4, 5)))
    println(squareSum(arrayOf()))
}