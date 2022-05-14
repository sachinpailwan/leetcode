package com.kotlin.leetcode.easy

fun main() {
  println(strStr("mississippi",
      "mississippi"))
}

fun strStr(s: String, s1: String): Int {
    if(s.isEmpty() || s1.isEmpty()) return -1
    var i = 0
    for(j in s.indices){
        if(s[j]==s1[0]){
            var flag = true
            var n = j
            for(k in s1.indices){
                if (n==s.length || s[n]!=s1[k] ){
                    flag = false
                    break
                }
                n++
            }
            if(flag) return j
        }
    }
    return -1
}