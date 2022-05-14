package com.kotlin.leetcode.top100

fun main() {
    println(longestConsecutive(intArrayOf(0,3,7,2,5,8,4,6,0,1)))
}
fun longestConsecutive(nums: IntArray): Int {
    var set = HashSet<Int>()
    for(n in nums){
        set.add(n)
    }
    var sequence = Int.MIN_VALUE
    for(n in nums){
        var current_sequence = 1
        var t = n
        while(set.contains(t+1)){
            current_sequence+=1
            t=t+1
        }
        sequence = maxOf(sequence,current_sequence)
    }
    return sequence
}