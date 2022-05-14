package com.kotlin.leetcode.top100

fun main() {
  println(num_ways("12"))
}
private var numOfWays=0
fun num_ways(data:String):Int{
   return recursive(data,data.length)
    arrayOf<String>()

}

fun recursive(data:String, index:Int):Int{
    if(index ==0) {
        return 1
    }
    if(data.substring(index).startsWith("0")){
        return 0
    }
    var res = recursive(data,index-1)
    if(index>=2 && data.substring(index-2,index).toInt()<=26){
        res+= recursive(data,index-2)
    }
    return res
}