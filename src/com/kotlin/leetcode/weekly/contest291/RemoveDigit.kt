package com.kotlin.leetcode.weekly.contest291

fun main() {
    println(removeDigit("123",'3'))
    println(removeDigit("551",'5'))
    println(removeDigit("1231",'1'))
}

fun removeDigit(number: String, digit: Char): String {
    var out_str = ""
    for( i  in number.indices){
        if(number[i]==digit){
            var num = number.substring(0,i) + number.substring(i+1,number.length)

            if(out_str.compareTo(num)<1){
                out_str=num
            }
        }
    }
    return out_str
}
