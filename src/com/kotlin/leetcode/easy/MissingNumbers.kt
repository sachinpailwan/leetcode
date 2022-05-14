package com.kotlin.leetcode.easy

fun main() {
    println(missingNumber(intArrayOf(9,6,4,2,3,5,7,0,1)))
}

fun missingNumber(nums: IntArray): Int {
    for((i,v) in nums.withIndex()){

    }
    for(i in 0..nums.size) if(!nums.contains(i)) return i
    return nums.size
}