package com.kotlin.leetcode.top100

import java.util.*


fun main() {

}
fun lengthOfLongestSubstring(s: String): Int {
    val mem = HashMap<Char, Int?>()
    var l = 0
    var max = 0
    for (i in s.indices) {
        val c: Char = s[i]
        if (mem.containsKey(c)) {
            l = Math.max(l, mem[c]!! + 1)
        }
        mem[c] = i
        max = Math.max(max, i - l + 1)
    }
    return max
}
