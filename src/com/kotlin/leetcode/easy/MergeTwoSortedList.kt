package com.kotlin.leetcode.easy

fun main() {

}

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    var l1 = list1
    var l2 = list2
    var listNode = ListNode(-1)
    var tailNode = listNode
    while(l1!=null && l2!=null){
        if(l1.`val`<l2.`val`){
            tailNode.next = l1
            l1 = l1.next
            tailNode= tailNode.next!!
        }else {
            tailNode.next = l2
            l2 = l2.next
            tailNode = tailNode.next!!
        }
    }
    if(l1!=null){
        tailNode.next=l1
    }else{
        tailNode.next=l2
    }
    return listNode.next
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}