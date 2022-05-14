package com.kotlin.leetcode.easy

import java.util.stream.Collectors

fun main() {
    println(summaryRanges(intArrayOf(0,2,3,4,6,8,9)).stream().collect(Collectors.joining(",")))
}
fun summaryRanges(nums: IntArray): List<String> {
    val list = ArrayList<String>()
    var i = 0
    while(i<nums.size){
        if(i!=nums.size-1 && nums[i]+1==nums[i+1]){
            var str ="${nums.get(i)}"
            while(i<nums.size-1 && nums[i]+1==nums[i+1] ){
                i++
            }
            str+="->${nums.get(i)}"
            list.add(str)
        }else{
            list.add("${nums[i]}")
        }
        i++
    }
    return list
}