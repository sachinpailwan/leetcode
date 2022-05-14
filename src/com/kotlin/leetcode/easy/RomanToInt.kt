package com.kotlin.leetcode.easy

fun main() {
    println(romanToInt("LVIII"))
}

fun romanToInt(s: String): Int {
    val map = hashMapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )
    var ans = 0
    var pre = 'k'
    s.toCharArray().forEach { c ->
        ans+=map[c]!!
        if(pre=='I' && (c=='V' || c=='X')) ans-=2
        if(pre=='X' && (c=='L' || c=='C')) ans-=20
        if(pre=='C' && (c=='D' || c=='M')) ans-=200
        pre = c
    }
    return ans
}