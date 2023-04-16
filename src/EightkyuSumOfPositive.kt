fun sum(numbers: IntArray): Int {
    var total = 0

    for(number in numbers) {
        if(number > 0) {
            total += number
        }
    }

    return total
}

fun main() {
    println(sum(intArrayOf(1,2,3,4,5)))
    println(sum(intArrayOf()))
    println(sum(intArrayOf(-1, -2, -3, -4, -5)))
    println(sum(intArrayOf(-1, 2, 3, 4, -5)))
}