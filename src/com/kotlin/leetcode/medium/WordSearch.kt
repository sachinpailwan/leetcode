package com.kotlin.leetcode.medium

fun main() {

    var board = arrayOf(arrayOf('A','B','C','E'),
        arrayOf('S','F','C','S'),
        arrayOf('A','D','E','E')
    )
    println("is ABCCED exists in board ? Ans:${isWordExist(board,"ABCCED")}")
}

fun isWordExist(board: Array<Array<Char>>, word: String):Boolean {
    if(board==null || board.isEmpty() || board[0].isEmpty() || word==null ){
        return false
    }
    for (i in board.indices){
        for (j in board[0].indices){
            if(board[i][j] == word[0]){
                if(backtrack(board,i,j,word,0)){
                    return true
                }
            }
        }
    }
    return false
}

fun backtrack(board: Array<Array<Char>>, i:Int, j:Int, word:String, pos:Int):Boolean{
    if(pos==word.length){
        return true;
    }
    if(i<0 || i>=board.size || j<0 || j>=board[0].size || board[i][j]!=word[pos]){
        return false;
    }
    board[i][j]='#';
    var res = backtrack(board,i+1,j,word,pos+1) ||
            backtrack(board,i-1,j,word,pos+1) ||
    backtrack(board,i,j-1,word,pos+1) ||
    backtrack(board,i,j+1,word,pos+1)
    board[i][j]=word[pos]
    return res
}