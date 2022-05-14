package com.kotlin.leetcode

fun main() {
    println(validPalindrome("deeee"))
}
fun validPalindrome(s:String):Boolean{
    var i = 0
    var j = s.length-1
    while(i<j){
        if(s[i]!=s[j]){
            return isValidPalindrome(s,i+1,j) || isValidPalindrome(s,i,j+1)
        }
        i+=1
        j-=1
    }
    return true
}

fun isValidPalindrome(s: String, i: Int, j: Int): Boolean {
    var k=i
    var l = j
    while(k<l){
        if(s[k]!=s[l]) return false
        k+=1
        l-=1
    }
    return true
}
