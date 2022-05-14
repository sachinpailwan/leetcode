package com.kotlin.leetcode.easy

fun main() {
    var matrix = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(2, 2, 3, 4),
        intArrayOf(3, 2, 3, 4),
        intArrayOf(4, 5, 6, 7 )
        )
    println(longestIncreasingPath(matrix))
}
fun longestIncreasingPath(matrix: Array<IntArray>): Int {
    var dp = Array<IntArray>(matrix.size+1) {IntArray(matrix.size+1){ i -> -1 } }
    return LIP(dp,matrix,matrix.size,matrix.size,0,0)
}

fun LIP(dp: Array<IntArray>, matrix: Array<IntArray>, n: Int, m: Int, x: Int, y: Int): Int {
    if(dp[x][y]<0){
        var res = 0
        // if bottom cell
        if(x==n-1 && y==m-1) {
            dp[x][y]=1
            return 1
        }
        // if corner
        if(x == n-1 || y == m-1) return 1

        if (x+1<n && matrix[x][y]<matrix[x+1][y]){
            res = 1 + LIP(dp,matrix,n,m,x+1,y)
        }
        if(y+1<m && matrix[x][y]<matrix[x][y+1]){
            res = maxOf(res,1+ LIP(dp,matrix,n,m,x,y+1))
        }
    }
    return dp[x][y]
}
