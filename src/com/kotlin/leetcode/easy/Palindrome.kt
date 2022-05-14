package com.kotlin.leetcode.easy

fun main() {
    println(isPalindrome(12321))
}

fun isPalindrome(num: Int): Boolean {
    var x = num
    if(x<0 || (x>0 && x%10==0)) return false
    var reserveNum:Int = 0
    while (x>reserveNum){
        reserveNum = reserveNum*10 + x % 10
        x /= 10
    }
    return x==reserveNum || (x==reserveNum/10)
}
