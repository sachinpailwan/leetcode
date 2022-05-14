package com.kotlin.leetcode.easy

fun main() {
    println(mySqrt(2147395600))
}
fun mySqrt(x: Int): Int {
    var l = 0
    var r = x
    while(l+1<r){
        var mid = l + (r-l) /2
        if(mid == x/mid) return mid
        else if (mid > x/mid) r=mid
        else l=mid
    }
    if(r!=0 && r<=x/r) return  r
    return l
}