package com.kotlin.leetcode

fun main() {

    printTree(4)
}

fun printTree(n:Int){
    for(i in n-1 downTo 0){
        (1..i).forEach{_ -> print("*")}
        for(j in i until n){
            print('A'+j)
        }
        for(k in n-2  downTo   i ){
            print('A'+k)
        }
        println()
    }
    for(i in n-2 downTo 0){
        for(k in i until  n-2 ){
            print('A'+k)
        }
        println()
    }
}
