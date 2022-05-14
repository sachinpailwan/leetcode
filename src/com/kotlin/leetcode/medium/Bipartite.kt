package com.kotlin.leetcode.medium

import java.util.*

fun main() {

}

fun isBipartite(graph: Array<IntArray>): Boolean {
   var colors = IntArray(graph.size) { 0 }

    for (i in graph.indices){
        if(colors[i]==0){
            var queue = LinkedList<Int>()
            queue.offer(i)
            colors[i]=1
            while (queue.isNotEmpty()){
                var n = queue.poll()
                for ( j in graph[n]){
                    if(colors[j]==0){
                        colors[j]=-colors[n]
                        queue.offer(j)
                    }
                    else if (colors[j]!=-colors[n]) {
                        return false
                    }
                }
            }
        }
    }
    return true
}