package com.kotlin.leetcode.easy

fun main() {
    println(addDigits(38))
}

fun addDigits(num: Int): Int {
    var n = num
    var sum = 0
    while(n>9){
        while(n>0){
            sum+=n % 10
            n/=10
        }
        n=sum
        sum=0
    }
    intArrayOf()
    return n
}