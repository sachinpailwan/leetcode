package com.leetcode

fun main() {
    var res = buildSpiralMatrix(3)
    res.forEach { ints ->
            ints.forEach { i -> print(" $i") }
            println()
        }
}
fun buildSpiralMatrix(n:Int): Array<Array<Int>> {
    var res = Array(n){IntArray(n)}

    return arrayOf(arrayOf(1, 2, 3), arrayOf(8, 9, 4))
}