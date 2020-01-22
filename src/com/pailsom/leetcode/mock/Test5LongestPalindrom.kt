package com.pailsom.leetcode.mock

class Test5LongestPalindrom {
    fun longestPalindrome(s: String): String {
        if(s.isEmpty()) return ""
        var longest = s.substring(0,1)
        val size = s.length-1
        for (i in 0..size){
            var palindrome = intermediatePalindrome(s,i,i)
            if(palindrome.length>longest.length)
                longest=palindrome
            palindrome = intermediatePalindrome(s,i,i+1)
            if(palindrome.length>longest.length)
                longest=palindrome
        }
        return longest
    }

    private fun intermediatePalindrome(s: String, l: Int, r: Int): String {
        var left:Int=l
        var right:Int=r
        if(left>right) return ""
        while (left>=0 && right<s.length && s[left]==s[right]){
            left--
            right++
        }
        return s.substring(left+1,right)
    }
}

fun main(args:Array<String>) {
    val test5LongestPalindrom = Test5LongestPalindrom()
    println(test5LongestPalindrom.longestPalindrome(""))
}