package gradingstudents

import kotlin.math.abs
import kotlin.math.ceil

fun convertGrade(grade: Int): Int {
    return if (grade < 38) grade
    else {
        val roundedValue = (ceil(grade.toDouble() / 5) * 5).toInt()
        val diff = abs(grade - roundedValue)

        if (diff < 3) roundedValue
        else grade
    }
}

fun gradingStudents(grades: Array<Int>): Array<Int> {
    return grades.map { it -> convertGrade(it) }.toTypedArray()
}

fun main() {
    val result = gradingStudents(arrayOf(73, 67, 38, 33))

    println("Result is:")
    println(result.joinToString(", "))

    println("Result should be: 75, 67, 40, 33")
    val isEqual = result.contentEquals(arrayOf(75, 67, 40, 33))

    println("Result equals expected? $isEqual")
}