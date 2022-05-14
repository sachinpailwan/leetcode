package com.kotlin.leetcode.top100

fun main() {
    var result = partition("aab")
    println()
}

var result = ArrayList<ArrayList<String>>()
fun partition(s: String): List<List<String>> {
    helper(s,0,ArrayList<String>())
    return result
}

fun helper(s:String, start:Int,curr:ArrayList<String>){
    if(s.length==start){
        result.add(ArrayList(curr))
        return
    }
    for(i in start until s.length){
        if(isPalindrome(s,start,i)){
            curr.add(s.substring(start,i+1))
            helper(s,i+1,curr)
            curr.removeAt(curr.size-1)
        }
    }
}
fun isPalindrome(s:String, start:Int, end:Int):Boolean{
    var p = start
    var l = end
    while(p<l){
        if(s[p]!=s[l]) {
            return false
        }
        p++
        l--
    }
    return true
}