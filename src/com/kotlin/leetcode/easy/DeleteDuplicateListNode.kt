package com.kotlin.leetcode.easy

fun main() {

}

fun deleteDuplicates(head: ListNode?): ListNode? {
    var curr = head
    while (curr!=null){
        while (curr.next!=null && curr.`val`== curr.next!!.`val`) curr.next=curr.next!!.next
        curr=curr.next
    }
    return head
}