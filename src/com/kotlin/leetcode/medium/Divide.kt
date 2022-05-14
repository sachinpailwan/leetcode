package com.kotlin.leetcode.medium

fun main() {
    println(
        divide(
            -2147483648
                    ,- 1)
    )
}


    fun divide(dividend: Int, divisor: Int): Int {
        var negative = if (divisor < 0 || dividend < 0) -1 else 1

        var res = 0

        var divi = dividend
        if (dividend < 0) {
            divi = divi * -1
        }
        var diviso = if (divisor < 0) divisor * -1 else divisor
        println("$divi $diviso $negative")
        if (diviso == 1) {
            return divi
        }
        while (divi >= diviso) {
            res += 1
            divi = divi - diviso
        }
        return negative * res
    }
