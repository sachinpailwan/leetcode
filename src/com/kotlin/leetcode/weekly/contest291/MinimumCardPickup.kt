package com.kotlin.leetcode.weekly.contest291

import java.util.*


fun main() {

}
fun minimumCardPickup(cards: IntArray): Int {
    val n: Int = cards.size
    var res = n + 1

    val map: MutableMap<Int, Int> = HashMap()

    for (i in 0 until n) {
        if (map.containsKey(cards[i])) {
            res = Math.min(res, i - map[cards[i]]!! + 1)
        }
        map[cards[i]] = i
    }

    return if (res == n + 1) -1 else res
}