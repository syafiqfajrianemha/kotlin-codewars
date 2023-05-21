package eightkyu

/*
The first century spans from the year 1 up to and including the year 100,
the second century - from the year 101 up to and including the year 200, etc.

Task
Given a year, return the century it is in.

Examples
- 1705 --> 18
- 1900 --> 19
- 1601 --> 17
- 2000 --> 20
 */
fun century(number: Int): Int {
    /*var result: Int = 0
    for(i in 0..number) {
        if(i % 100 === 0) {
            result++
        }
    }
    return result*/

    /*return if(number <= 0) {
        1
    } else if(number <= 100) {
        1
    } else if(number % 100 == 0) {
        number / 100
    } else {
        number / 100 + 1
    }*/

    return if(number % 100 == 0) {
        number / 100
    } else {
        (number / 100) + 1
    }
}

fun main() {
    println(century(1705))
    println(century(1900))
    println(century(1601))
    println(century(2000))
    println(century(89))
    println(century(1))
}