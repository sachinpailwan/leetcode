package com.kotlin.leetcode.easy

fun main() {
    println(removeElement(intArrayOf(3,2,2,3),3))
    println(removeElement(intArrayOf(0,1,2,2,3,0,4,2),2))
}

fun removeElement(nums: IntArray, v: Int): Int {
    var i = 0
    for (n in nums){
        if(n!= v){
            nums[i++]=n
        }
    }
    return i
}