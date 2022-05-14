package com.kotlin.leetcode.easy

fun main() {
    //println(convertToTitle(701))
    println(titleToNumber("AB"))
}

fun convertToTitle(columnNum: Int): String {
    var col = ""
    var columnNumber = columnNum
    while(columnNumber>0){
        var rem = columnNumber % 26
        if(rem == 0 ){
            col = "Z$col"
            columnNumber = columnNumber/26 -1
        }else{
           var ch = 'A' + rem - 1
            col = "$ch$col"
            columnNumber /= 26
        }
    }
    return col
}

fun titleToNumber(columnTitle:String):Int{
    var map =('A'..'Z').mapIndexed { index, c -> c to index + 1 }.toMap()
    var result = 0
    for( i in columnTitle.indices){
        result*=26
        result+= map[columnTitle[i]] ?: error("")
    }
    return result
}