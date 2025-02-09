package com.kotlin.leetcode75

class MergeStrings {
    fun mergeAlternately(word1: String, word2: String): String {
        var i = 0
        var j = 0
        val result = StringBuilder(word1.length + word2.length)

        // Merge alternative characters
        while(i<word1.length || j<word2.length) {
            if(i<word1.length) result.append(word1[i++])
            if(j<word2.length) result.append(word2[j++])
        }

        return result.toString()
    }
}

fun main() {
    var solution = MergeStrings()
    println("Merged string of abc  & pqr  is ${solution.mergeAlternately("abc", "pqr")}")
    println("Merged string of ab   & pqrs is ${solution.mergeAlternately("ab", "pqrs")}")
    println("Merged string of abcd & pq   is ${solution.mergeAlternately("abcd", "pq")}")
}
