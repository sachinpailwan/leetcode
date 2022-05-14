package com.kotlin.leetcode

fun main() {
    println(findDuplicates(intArrayOf(1,1,2)).joinToString(","))
}
fun findDuplicates(nums: IntArray): List<Int> {
    val result = ArrayList<Int>()
    var duplicates = IntArray(nums.size){ i->-1}
    for (i in nums.indices){
        if( duplicates[nums[i]-1] != -1){
            result.add(nums[i])
        }else{
            duplicates[nums[i]-1]+=nums[i]
        }
    }
    return result
}