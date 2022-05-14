package com.kotlin.leetcode.top100

import java.util.*


fun main() {
    var aa = Array<IntArray>(3){intArrayOf(1, 2, 2)}
    aa[0]= intArrayOf(1, 2, 2)
    aa[1]= intArrayOf(3, 8, 2)
    aa[2]= intArrayOf(3, 8, 2)
    println(minimumEffortPath(aa))
}

fun minimumEffortPath(heights: Array<IntArray>): Int {
    var n = heights.size
    var m = heights[0].size
    if(m==0 || n==0) return 0

    val efforts = Array(n) { IntArray(m) }
    for (row in efforts) Arrays.fill(row, Int.MAX_VALUE)

    var queue = PriorityQueue<IntArray>(kotlin.Comparator { o1, o2 -> o1[2] - o2[2] })
    queue.offer(intArrayOf(0, 0, 0))

    var direction = arrayOf(intArrayOf(0,1),
        intArrayOf(0,-1),intArrayOf(1,0),intArrayOf(-1,0))

    while (!queue.isEmpty()){
        var curr = queue.poll()!!
        var row = curr[0]
        var col = curr[1]
        var wt = curr[2]
        for(dir in direction){
            var nrow = row + dir[0]
            var ncol = col + dir[1]
            if(ncol<0 || ncol>=m || nrow<0 || nrow>=n )
                continue
            var wt = maxOf(wt,Math.abs(heights[nrow][ncol]-heights[row][col]))
            if(wt<efforts[nrow][ncol]){
                efforts[nrow][ncol]=wt
                queue.offer(intArrayOf(nrow,ncol,wt))
            }
        }
    }
    return efforts[n-1][m-1]
}