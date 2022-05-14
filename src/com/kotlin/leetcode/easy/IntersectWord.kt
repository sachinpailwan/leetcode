package com.kotlin.leetcode.easy

fun main() {
    //println(intersect(intArrayOf(4,9,5), intArrayOf(9,4,9,8,4)).contentToString())
    findDisappearedNumbers(intArrayOf(4,3,2,7,8,2,3,1)).forEach{t: Int? ->
        println(t)
    }
}
fun findDisappearedNumbers(nums: IntArray): List<Int> {
    var arr = IntArray(nums.size+1)
    nums.forEachIndexed{index, i -> arr[i]=1 }

    var list = ArrayList<Int>()
    for ( i in 1 until arr.size){
        if(arr[i]!=1) list.add(i)
    }
    return list
}
fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    var map = hashMapOf<Int,Int>()
    var result = ArrayList<Int>()
    var i = 0;
    nums1.forEachIndexed{k,v->
        map.put(v,map.getOrDefault(v,0)+1)
    }
    nums2.forEachIndexed{k,v ->
        if (map.containsKey(v) && map.get(v)!! >0){
            result.add(v)
            map.put(v,map.get(v)!!-1)
        }
    }
    return result.toIntArray()
}