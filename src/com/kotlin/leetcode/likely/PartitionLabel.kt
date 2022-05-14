package com.kotlin.leetcode.likely

import java.util.*
import kotlin.collections.ArrayList

fun main() {
  var list = intArrayOf(1,2,3)
    nextPermutation(list)
    println(Arrays.toString(list))
}

fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
    var nn = ArrayList<Int>(intArrayOf(1,2,3,4).toSet())

    return ArrayList<ArrayList<Int>>()

}

fun nextPermutation(nums: IntArray): Unit {
    var l = 0;
    var r = nums.size - 1
    for(i in 0 until nums.size-2){
        if(nums[i+1]>nums[i]){
            l=i
            break
        }
    }

    for(i in nums.size-2 downTo 1){
        if(nums[i]>nums[i+1]){
            r=i
            break
        }
    }
    if(r<0){
        reverse(nums,0)
    }else {
        var t = nums[r]
        nums[r] = nums[l]
        nums[l] = t
        reverse(nums, l+1)
    }
}

fun reverse(nums: IntArray, l: Int) {
    var m = l
    var n = nums.size-1
    while(m<n){
        var t = nums[n]
        nums[n]=nums[m]
        nums[m]=t
        m++
        n--
    }
}

