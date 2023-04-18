package eightkyu

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