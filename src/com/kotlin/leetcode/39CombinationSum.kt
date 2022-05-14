package com.kotlin.leetcode

import com.kotlin.leetcode.easy.sumof
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val list = combinationSum(intArrayOf(2,3,6,7), 7)
    println(list)
}
fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
    var result = ArrayList<ArrayList<Int>>()
    Arrays.sort(candidates)
    findSubCombination(candidates,0,target,ArrayList<Int>(),result)
    return result;
}

fun findSubCombination(
    candidates: IntArray,
    index: Int,
    target: Int,
    current: java.util.ArrayList<Int>,
    result: java.util.ArrayList<java.util.ArrayList<Int>>
) {
    if(target==0){
        result.add(ArrayList<Int>(current))
        return
    }
    if(target<0){
        return
    }
    for(i in index until candidates.size){
        if(i==index || candidates[i]!=candidates[i-1]){
            current.add(candidates[i])
            findSubCombination(candidates,i+1,target-candidates[i],current,result)
            current.remove(current.size-1)
        }

    }
}
