package eightkyu

import kotlin.math.floor

/*
Nathan loves cycling.

Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.

You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.

For example:
- time = 3 ----> litres = 1
- time = 6.7---> litres = 3
- time = 11.8--> litres = 5
 */
fun litres(time: Double): Int {
    val totalDrinks = 0.5 * time
    return floor(totalDrinks).toInt()
}

fun main() {
     println(litres(3.0))
     println(litres(6.7))
     println(litres(11.8))
}