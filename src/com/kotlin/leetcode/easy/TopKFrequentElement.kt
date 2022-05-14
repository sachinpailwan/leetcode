package com.kotlin.leetcode.easy

import java.util.*


fun main() {
    println(topKFrequent(intArrayOf(1, 1, 1, 2, 2, 3), 2).contentToString())
}

fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val map: MutableMap<Int, Int> = HashMap()
    for (i in nums) {
        map[i] = map.getOrDefault(i, 0) + 1
    }

    val maxheap: Queue<Int> = PriorityQueue<Int> { a: Int, b: Int ->
        map[b]!! - map[a]!!
    }
    for (key in map.keys) {
        maxheap.add(key)
    }

    val ans = IntArray(k)
    for (i in 0 until k) {
        ans[i] = maxheap.poll()
    }

    return ans
}