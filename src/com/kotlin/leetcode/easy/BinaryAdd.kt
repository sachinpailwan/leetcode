package com.kotlin.leetcode.easy

fun main() {
    println(addBinary("1010","1011"))
}
fun addBinary(a: String, b: String): String {
    var i = a.length-1
    var j = b.length-1
    var carry = 0
    var sum = ""
    while(i>=0 && j>=0){
        if(a[i]=='1' && b[j]=='1' && carry==1){
            sum+="1"
            carry =0
        }else if((a[i]=='1' && b[j]=='1') || ((a[i]=='1' || b[j]=='1') && carry == 1)){
            sum+="0"
            carry = 1
        }else if((a[i]=='1' || b[j]=='1')) {
            sum+="1"
        }else if(carry==1) {
            sum+="1"
        } else{
            sum+="0"
        }
        i--;
        j--;
    }
    if(i>=0){
        while(i>=0) {
            if (a[i] == '1' && carry == 1) {
                sum += "0"
                carry = 1
            } else {
                sum += a[i]
            }
            i--
        }
    }
    if(j>=0){
        while (j>=0) {
            if (b[j] == '1' && carry == 1) {
                sum += "0"
                carry = 1
            } else {
                sum += b[j]
            }
            j--
        }
    }
    if(carry==1) sum+="1"
    return sum.reversed()
}