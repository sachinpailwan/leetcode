package com.kotlin.leetcode.easy

fun main() {
 println(26.toHex())
}

fun Int.toHex(): String {
    val hex = charArrayOf('0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f')
    var result = ""
    var n = this
    if(n==0) return "0"
    while(n!=0){
        result = hex[n%16] + result
        n/=16
    }
    return result
}


fun sumOfLeftLeaves(root: TreeNode?): Int {
    return sumof(root,0,false)
}

fun sumof(root:TreeNode?,sum:Int,isLeft:Boolean):Int{
    if(root==null) return sum
    var sum1 = sum
    if(root.left==null && root.right==null){
        if(isLeft){
            sum1+=root.`val`
        }
        return sum1
    }
    return sumof(root.left,sum1,true) + sumof(root.right,sum1,true)
}