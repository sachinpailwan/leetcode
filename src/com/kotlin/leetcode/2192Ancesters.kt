package com.kotlin.leetcode

import java.util.*


fun main() {

}
fun getAncestors(n: Int, edges: Array<IntArray>): List<List<Int>> {
    var graph = Array<ArrayList<Int>>(n){ i -> ArrayList<Int>() }
    for (edge in edges){
        graph[edge[1]].add(edge[0])
    }
    var result = ArrayList<ArrayList<Int>>()
    for (i in 0 until n){
        var list = ArrayList<Int>()
        var visited = BooleanArray(n)
        helper(i,graph,list,visited)
        list.sort()
        result.add(list)
    }
    return result
}

private fun helper(vtx: Int, graph: Array<ArrayList<Int>>, ans: MutableList<Int>, visited: BooleanArray) {
    visited[vtx] = true
    for (nbr in graph[vtx]) {
        if (!visited[nbr]) {
            ans.add(nbr)
            helper(nbr, graph, ans, visited)
        }
    }
}