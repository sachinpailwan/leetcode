package com.kotlin.leetcode.top100

import com.kotlin.leetcode.easy.ListNode

fun main() {
    var node = ListNode(1)
    node!!.next = ListNode(2)
    node!!.next!!.next = ListNode(3)
    node!!.next!!.next!!.next = ListNode(4)
    node = swapPairs(node)!!
    println(node.`val`)

}

fun swapPairs(head: ListNode?): ListNode? {
   if(head == null || head!!.next == null){
       return head
   }
   var temp = ListNode(12)
    temp.next= head
    var curr = temp
    while (curr.next!=null && curr!!.next!!.next != null){
        var first = curr!!.next
        var second = first!!.next
        first!!.next = second!!.next
        second.next = first
        curr.next = second

        curr = curr!!.next!!.next!!
    }
    return temp.next
}