package com.kotlin.leetcode.easy

fun main() {
   println(maxSubArray(intArrayOf(-2,1,-3,4,-1,2,1,-5,4)))
}

fun maxSubArray(nums: IntArray): Int {
    var maxSoFar: Int = Int.MIN_VALUE
    var maxEndingHere: Int = 0
    for (value in nums) {
        maxEndingHere += value
        if (maxSoFar < maxEndingHere) maxSoFar = maxEndingHere
        if (maxEndingHere < 0) maxEndingHere = 0
    }
    return maxSoFar
}