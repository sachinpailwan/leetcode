package com.kotlin.leetcode

fun isValidSudoku(board: Array<CharArray>): Boolean {
    var set = HashSet<String>()
    for(i in board.indices){
        for (j in board[0].indices){
            var c = board[i][j]
            if(c!='.'){
                if(!set.add("$c found in row $i") ||
                        !set.add("$c found in col $j") ||
                        !set.add("$c found in sub ${i/3} ${j/3}")){
                    return false
                }
            }
        }
    }
    return true
}