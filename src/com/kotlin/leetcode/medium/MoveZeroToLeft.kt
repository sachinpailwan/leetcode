package com.kotlin.leetcode.medium

fun main() {
    val moveToLeft = moveToLeft(intArrayOf(1, 10, 20, 0, 59, 63, 0, 88, 0))
    println("${moveToLeft}")
}
fun moveToLeft(nums:IntArray):IntArray{
    var j = nums.size-1
    while(j>=0 && nums[j]==0) {
        j -= 1
    }
    if(j<0){
        return nums
    }
    var i = 0
    while (i<nums.size-1 && nums[i]!=0){
        i+=1
    }
    while(i<j){
        var t = nums[j]
        nums[j]=nums[i]
        nums[i]=t
        while (i<nums.size && nums[i]!=0){
            i++
        }
        j-=1
    }
    return nums
}