package com.pailsom.leetcode.mock

import java.util.*

class ZigZag {

    public fun convert(s:String,numRows:Int):String{
        var str=Array<String>(numRows){""}
        var index:Int =0
        var down:Boolean =true
        if(numRows==1){
            return s;
        }
        for (i in 0..(s.length-1)){
            str[index]=str[index]+s[i];
            if(index == (numRows-1)){
                down=false
            }
            else if (index==0){
                down=true
            }
            if(down) {
                index++
            }
            else{
                index--
            }
        }
        return str.toList().joinToString ("")
    }
}
fun main(arg:Array<String>){
    var zigZag = ZigZag()
    println(zigZag.convert("AB",1))
}