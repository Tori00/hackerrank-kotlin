package angryprof

fun angryProfessor(threshold: Int, arrivalTimes: Array<Int>): String {
    val onTimeCount = arrivalTimes.count { it <= 0 }

    return when (onTimeCount < threshold) {
        true -> "YES"
        false -> "NO"
    }
}

fun main() {
    val arrivalTimes = arrayOf(-1, -3, 4, 2)
    val threshold = 3

    val result = angryProfessor(threshold, arrivalTimes)

    val expectedResult = "YES"
    println("Result is: $result")
    println("Result should be: $expectedResult")
    println("Result equals expected? ${result == expectedResult}")
}
