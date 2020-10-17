package finddigits

fun findDigits(number: Int): Int {
    return number.toString().toCharArray()
        .filterNot { it == '0' }
        .groupBy { it }
        .map { (character, list) ->
            val remainder = number % Character.getNumericValue(character)
            if (remainder == 0) list.size else 0
        }.sum()
}

fun main() {
    val result = findDigits(1012)
    val expected = 3

    println("Result is: $result")
    println("Result should be: $expected")
    println("Result equals expected? ${result == expected}")
}