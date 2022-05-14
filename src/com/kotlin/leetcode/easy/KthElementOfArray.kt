package com.kotlin.leetcode.easy

import java.util.*

fun main() {
    println(kthElement(intArrayOf(3,2,1,5,6,4),6))
}
fun kthElement(nums:IntArray,k:Int):Int{
    var minHeap = PriorityQueue<Int>()
    for(n in nums){
        minHeap.add(n)
        if(minHeap.size>k){
            minHeap.remove()
        }
    }
    return minHeap.remove()
}