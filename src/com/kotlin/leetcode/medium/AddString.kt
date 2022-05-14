package com.kotlin.leetcode.medium

fun main() {
    println(add("11","123"))
    println(add("456","77"))
    println(add("0","0"))

}
fun add(num1:String, num2:String):String {
    var n1 = num1.length - 1
    var n2 = num2.length - 1
    var carr:Int = 0
    var res = ""
    while(n1>=0 || n2>=0){
        val n11 = if(n1 >=0)  num1[n1] - '0' else  0
        val n12 = if(n2 >=0 )  num2[n2] - '0'  else  0

        val sum =  n11  + n12 + carr
        res = "${sum % 10}" + res
        carr = sum / 10
        n1-=1
        n2-=1
    }

    return res
}