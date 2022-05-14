package com.leetcode

fun main() {
   println(isMonotonic(intArrayOf(1,2,2,3)))
}

fun isMonotonic(nums: IntArray): Boolean {
    var increaseSum = 1
    var decreaseSum = 1
    for(i in 0 until nums.size-1){
        if(nums[i]<=nums[i+1]) increaseSum+=1
        if(nums[i]>=nums[i+1]) decreaseSum+=1
    }
    return increaseSum==nums.size || decreaseSum==nums.size
}