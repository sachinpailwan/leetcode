package com.kotlin.leetcode.easy

fun main() {
    println(indexOf("aaaaa","bba"))
}

fun indexOf(s: String, s1: String): Int {
    if(s.isEmpty() || s1.isEmpty()) return -1
    var i = 0
    for(j in s.indices){
        if(s[j]==s1[0]){
            var flag = true
            var n = j
            for(k in s1.indices){
                if (s[n++]!=s1[k]){
                   flag = false
                    break
                }
            }
            if(flag) return j
        }
    }
    return -1
}
