package com.kotlin.leetcode.easy

import java.util.*
import kotlin.collections.ArrayList


fun main() {
    val merge = merge(arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18)))
    println(merge.size)
}
fun merge(intervals: Array<IntArray>): Array<IntArray> {
    val result = ArrayList<IntArray>()
    Arrays.sort<IntArray>(intervals) { a, b -> a[0] - b[0] }
    var i = 0
    while(i<intervals.size){
        var j = i+1
        val res = IntArray(2)
        res[0]=intervals[i][0]
        res[1]=intervals[i][1]
        while(j<intervals.size){
            if (intervals[j][0] <= res[1]) {
                res[1]=intervals[j][1]
            }else{
                break
            }
            j++
        }
        i=j
        result.add(res)
    }
    return result.toTypedArray()
}