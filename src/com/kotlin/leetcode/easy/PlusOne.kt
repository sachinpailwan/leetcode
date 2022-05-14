package com.kotlin.leetcode.easy


fun main() {
    //println(plusOne(intArrayOf(1, 2, 3)).contentToString())
    //println(plusOne(intArrayOf(9)).contentToString())
   println(plusOne(intArrayOf(9,9)).contentToString())
}
fun plusOne(digits: IntArray): IntArray {
    var carry =1
    digits.indices.reversed().forEach { i ->
        digits[i]=digits[i]+carry
        if(digits[i]==10){
            digits[i]=0
            carry = 1
        }else{
            carry = 0
        }
    }
    if(carry==1){
        val arr = IntArray(digits.size+1)
        digits.indices.reversed().forEach { i ->
            arr[i+1]=digits[i]
        }
        arr[0]=carry
        return arr
    }
    return digits
}