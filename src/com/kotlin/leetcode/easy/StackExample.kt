package com.kotlin.leetcode.easy

import java.util.*

fun main() {

}

class MyStack() {
    var queue1  : PriorityQueue<Int> = PriorityQueue()
    var queue2 : PriorityQueue<Int> = PriorityQueue()
    var currentQueue : PriorityQueue<Int> = PriorityQueue()
    fun push(x: Int) {
        if(queue1.isEmpty()){
            queue1.offer(x)
            while(!queue2.isEmpty()){
                queue1.offer(queue2.poll())
            }
            currentQueue = queue1
        }else{
            queue2.offer(x)
            while(!queue1.isEmpty()){
                queue2.offer(queue1.poll())
            }
            currentQueue = queue2
        }
    }

    fun pop(): Int {
        if(currentQueue!=null && !currentQueue.isEmpty())
          return  currentQueue.poll()
        return -1
    }

    fun top(): Int {
        if(currentQueue!=null && !currentQueue.isEmpty())
            return  currentQueue.peek()
        return -1
    }

    fun empty(): Boolean {
        return currentQueue.isEmpty()
    }

}