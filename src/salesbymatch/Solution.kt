package salesbymatch

fun sockMerchant(n: Int, socks: Array<Int>): Int {
    return socks.groupBy { it }.map { (_, list) -> list.size / 2 }.sum()
}

fun main() {
    val result = sockMerchant(9, arrayOf(10, 20, 20, 10, 10, 30, 50, 10, 20))

    println("Result is: $result")
    println("Result should be 3")

    val isEqual = result == 3
    println("Result equals expected? $isEqual")
}