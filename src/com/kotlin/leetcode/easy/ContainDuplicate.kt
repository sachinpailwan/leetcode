package com.kotlin.leetcode.easy

fun main() {
    println(containsNearbyDuplicate(intArrayOf(1,2,3,1),3))
}
fun containsNearbyDuplicate(numbs: IntArray, k: Int): Boolean {
    val map = HashMap<Int,ArrayList<Int>>()
    numbs.forEachIndexed { index, i ->
        if(map.containsKey(i)){
            for( n in map[i]!!){
                if(n-index<=k) return true
            }
            map[i]!!.add(index)
        }else{
            val list = ArrayList<Int>()
            list.add(index)
            map[i] = list
        }
    }
    return false
}