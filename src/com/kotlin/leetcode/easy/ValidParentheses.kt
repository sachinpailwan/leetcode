package com.kotlin.leetcode.easy

import java.util.ArrayDeque

fun main() {
    println(isValid("([{}])"))
}
fun isValid(s: String): Boolean {
    if (s.length<2) return false
    val stack = ArrayDeque<Char>()
    s.toCharArray().forEach { c ->
        when(c){
            '(' -> stack.push(')')
            '[' -> stack.push(']')
            '{' -> stack.push('}')
            ')',']','}'-> if (stack.isEmpty() || stack.pop()!=c)  return false
        }
    }
    return stack.isEmpty()
}