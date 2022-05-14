package com.kotlin.leetcode

fun main() {
    println(searchRange(intArrayOf(5,7,7,8,8,10),8).joinToString(","))
}
fun searchRange(nums: IntArray, target: Int): IntArray {
    var result = IntArray(2)
    result [0] = findStartingIndex(nums,target)
    result [1] = findEndingIndex(nums,target)
    return result
}

fun findEndingIndex(nums: IntArray, target: Int): Int {

    var index = -1
    var i = 0
    var j = nums.size -1
    while(i<=j){

        var mid = i +(j-i)/2

        if(nums[mid]<=target){
            i=mid+1
        }else{
            j=mid-1
        }

        if(target==nums[mid]){
            index = mid
        }
    }
    return index
}

fun findStartingIndex(nums: IntArray, target: Int): Int {
    var index = -1
    var i = 0
    var j = nums.size -1
    while(i<=j){

        var mid = i +(j-i)/2

        if(nums[mid]>=target){
           j=mid-1
        }else{
            i=mid+1
        }

        if(target==nums[mid]) {
            index = mid
        }
    }
    return index
}
