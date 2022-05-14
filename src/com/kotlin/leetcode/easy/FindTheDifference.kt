package com.kotlin.leetcode.easy

import java.lang.StringBuilder
import java.util.function.BiFunction

fun main() {

    println(10.toString(2))
    println(20.toString(2))
    println((10 xor 20).toString(2))
    "".toUpperCase()

    println("5F3Z-2e-9-w".substring(0,"5F3Z-2e-9-w".indexOf('-')))
}

fun findMode(root: TreeNode?): IntArray {
    var list = ArrayList<Int>()
    findAll(root,list)
    var res = ArrayList<Int>()
    var duplicate = HashSet<Int>()
    for(n in list){
        if(!duplicate.add(n)){
            res.add(n)
        }
    }
    return res.toIntArray()
}

fun findAll(root:TreeNode?, list:ArrayList<Int>){
    if(root==null) return
    list.add(root.`val`)

}

fun fourSumCount(nums1: IntArray, nums2: IntArray, nums3: IntArray, nums4: IntArray): Int {
    var map = HashMap<Int,Int>()
    for(n1 in nums1){
        for(n2 in nums2){
            map.compute(n1+n2 , BiFunction { t, u -> if (u==null) 1 else u+1 })
        }
    }
    var sum=0
    for(n1 in nums3){
        for(n2 in nums3){
            sum+=map.getOrDefault(-(n1+n2),0)
        }
    }
    return sum
}



fun isSubsequence(s: String, t: String): Boolean {
    var j = 0
    t.forEachIndexed{i,v->
        if(v==s[j]) j++
    }
    return j==s.length
}