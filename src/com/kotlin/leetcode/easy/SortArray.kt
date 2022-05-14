package com.kotlin.leetcode.easy

import kotlin.math.abs

fun main() {
    println(intArrayOf(-6,-5,-4,-3,-2,-1).contentToString())
    println(squareArray(intArrayOf(-6,-5,-4,-3,-2,-1)).contentToString())
}
fun squareArray(nums:IntArray) : IntArray{
    var right = nums.size-1
    var left = 0
    var result = IntArray(nums.size)
    var index = nums.size-1
    while(left<=right){
        if(abs(nums[left])>nums[right]){
            result[index--] = nums[left] * nums[left]
            left ++
        }else{
            result[index--]=nums[right]*nums[right]
            right--
        }
    }
    return result
}