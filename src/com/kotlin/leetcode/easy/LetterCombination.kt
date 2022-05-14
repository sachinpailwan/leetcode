package com.kotlin.leetcode.easy

fun main() {
    val letterCombinations = letterCombinations("23")
    println(letterCombinations.joinToString())
}

fun letterCombinations(digits: String): List<String> {
    var mapping = arrayOf(
        "0",
        "0",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz")
    var result = ArrayList<String>()
    permulation(result,digits,"",0,mapping)
    return result
}
fun permulation(result:ArrayList<String>,digits:String,curr:String,index:Int,mapping:Array<String>){
    if(index==digits.length){
        result.add(curr)
        return
    }
    var letters = mapping[digits[index]-'0']
    for(c in letters){
        permulation(result,digits,curr+c,index+1,mapping)
    }
}