package com.kotlin.leetcode.medium

import com.kotlin.leetcode.easy.thirdMax
import java.util.*

fun main() {

    println(thirdMax(intArrayOf(3,5,7,2,7,3,7,3,9,11,12)))
}
fun thirdMax(nums: IntArray):Int{
    val treeSet = TreeSet<Int>()
    nums.forEach { n -> treeSet.add(n) }
    if(treeSet.size<3){
        return treeSet.last()
    }
    treeSet.pollLast()
    treeSet.pollLast()
    return treeSet.last()
}