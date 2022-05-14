package com.kotlin.leetcode.easy

fun main() {
    println(longestCommonPrefix(arrayOf("flower","flow","flight")))
    println(longestCommonPrefix(arrayOf("dog","racecar","car")))
}

fun longestCommonPrefix(strs: Array<String>): String {
    if(strs.isEmpty()) return ""
    var prefix:String = strs[0]
    for(i in 1 until strs.size){
        while(strs[i].indexOf(prefix)!=0){
            prefix=prefix.substring(0,prefix.length-1)
        }
    }
    return prefix
}