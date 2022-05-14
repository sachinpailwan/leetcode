package com.kotlin.leetcode.easy

import java.lang.RuntimeException
import kotlin.collections.HashMap

fun main(args:Array<String>){
    val result = twoSum(intArrayOf(2,7,11,13),9)
    println(result.contentToString())
}
fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int,Int>()
    for (i in nums.indices){
        val m = target - nums[i]
        if(map.containsKey(m)){
            return intArrayOf(map[m]!!,i)
        }
        map[nums[i]] = i
    }
    throw RuntimeException("does not have solution")
}