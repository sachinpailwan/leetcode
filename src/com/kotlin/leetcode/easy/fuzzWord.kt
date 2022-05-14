package com.kotlin.leetcode.easy

fun main() {
    println(thirdMax(intArrayOf(1,3,4,6,1,2,6,4,2)))
}

fun thirdMax(nums: IntArray): Int {
    var maxSet = sortedSetOf<Int>()
    for(n in nums){
        maxSet.add(n)
        maxSet.sorted()
        if(maxSet.size>3){
            maxSet.remove(maxSet.first())
        }
    }
    return maxSet.first()


}

fun fizzBuzz(n: Int): List<String> {
    var result = ArrayList<String>()
    var maxSet = sortedSetOf<Int>()
    maxSet.first()
    for(i in 1..n){
        when{
            i%15==0 -> result.add("FizzBuzz")
            i%3==0 -> result.add("Fizz")
            i%5==0 -> result.add("Buzz")
            else   -> result.add("$i")
        }
    }

    return result
}