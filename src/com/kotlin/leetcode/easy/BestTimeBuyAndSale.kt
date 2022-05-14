package com.kotlin.leetcode.easy

fun main() {
    println(maxProfit(intArrayOf(7,1,5,3,6,4)))
}
fun maxProfit(prices: IntArray): Int {
    var maxProfit = 0
    var buy:Int = 0
    var sell = 0
    while (sell<prices.size){
        if(prices.get(sell) < prices.get(buy)){
            buy = sell;
        }
        else{
            maxProfit = maxOf(maxProfit,prices.get(buy)-prices.get(sell))
        }
        sell++;
    }
    return maxProfit
}