package com.kotlin.leetcode.easy.tree

class TNode(val data: Int){
    var left:TNode? = null
    var right:TNode? = null
}

fun main() {
//      var nums = intArrayOf(1,3,-1,-3,5,3,6,7)
//    println(nums.slice(3..6).max())
//    var list = ArrayList<Int>()
//    list.toTypedArray()
//    nums.slice(2..6).forEach{t: Int? -> println(t) }
//
    println(maxSlidingWindow(intArrayOf(1,3,-1,-3,5,3,6,7),3).contentToString())
}

fun maxSlidingWindow(nums: IntArray, kk: Int): IntArray {
    var list = ArrayList<Int>()
    var n = 0
    var k=kk-1
    while(n+k<nums.size){
        nums.slice(n..(n+k)).max()?.let { list.add(it) }
        n++
    }
    return list.toIntArray()
}

fun findDuplicate_bs(nums: IntArray): Int {
    val len = nums.size
    var low = 1
    var high = len - 1
    while (low < high) {
        val mid = low + (high - low) / 2
        var cnt = 0
        for (i in 0 until len) {
            if (nums[i] <= mid) {
                cnt++
            }
        }
        if (cnt <= mid) {
            low = mid + 1
        } else {
            high = mid
        }
    }
    return low
}