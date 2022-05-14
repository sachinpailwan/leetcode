package com.kotlin.leetcode.top100

import com.kotlin.leetcode.easy.ListNode




fun main() {

}

fun hasCycle(head: ListNode?): Boolean {
    if (head?.next == null) {
        return false
    }
    var fast = head
    var slow = head
    while (fast!!.next != null && fast.next!!.next != null) {
        fast = fast.next!!.next
        slow = slow!!.next
        if (fast == slow) {
            return true
        }
    }
    return false
}