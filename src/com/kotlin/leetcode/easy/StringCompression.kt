package com.kotlin.leetcode.easy

fun main() {
    println(compress(charArrayOf('a')))
    var dp = IntArray(3){ _ -> 1 }
    var n = if(dp.max() == null) 0 else dp.max()
}
fun compress(chars: CharArray): Int {
    var i = 0
    var j = 1
    var res = ""
    while(i<chars.size){
        j=i
        while(j<chars.size && chars[i] == chars[j]) j++
        var t = "${j-i}"
        if(t=="1") t=""
        res+="${chars[i]}${t}"
        i=j
    }
    return res.length
}