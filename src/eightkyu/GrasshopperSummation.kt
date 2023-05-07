package eightkyu

/*
Summation
Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0.

For example (Input -> Output):
- 2 -> 3 (1 + 2)
- 8 -> 36 (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8)
 */
object GrassHopper {
    fun summation(n:Int):Int {
        var total = 0
        for(i in 1..n) {
            total += i
        }
        return total
    }
    // fun summation(n: Int) = (1..n).sum()
}

fun main() {
    println(GrassHopper.summation(2))
    println(GrassHopper.summation(8))
}