package com.pailsom.leetcode.mock

class Test4MedianOfTwoSortedArray{
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        var array3 = nums1.plus(nums2).sortedArray()
        val size = array3.size
        if(size != 0) {
            return if (size % 2 == 0) {
                (array3[size/2]+array3[(size/2)-1]).toDouble()/2
            } else {
                array3[(size-1)/2].toDouble()
            }
        }
        return 0.0
    }

}

fun main(arg:Array<String>) {
    val test4MedianOfTwoSortedArray = Test4MedianOfTwoSortedArray()
    val result = test4MedianOfTwoSortedArray.findMedianSortedArrays(intArrayOf(1,2), intArrayOf(3,4))
    println(result)
}