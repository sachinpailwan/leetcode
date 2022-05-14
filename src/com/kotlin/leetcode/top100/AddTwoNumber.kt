package com.kotlin.leetcode.top100

import com.kotlin.leetcode.easy.ListNode


fun main() {
    var num1 = ListNode(9)
    num1.next = ListNode(9)
//    num1!!.next!!.next = ListNode(9)
//    num1!!.next!!.next!!.next = ListNode(9)
//    num1!!.next!!.next!!.next!!.next = ListNode(9)
//    num1!!.next!!.next!!.next!!.next!!.next = ListNode(9)
//    num1!!.next!!.next!!.next!!.next!!.next!!.next = ListNode(9)

    var num2 = ListNode(9)
    num2.next = ListNode(9)
    num2!!.next!!.next = ListNode(9)
    num2!!.next!!.next!!.next = ListNode(9)

    var addTwoNumbers = addTwoNumbers(num1, num2)
    while (addTwoNumbers!=null){
        print("-> ${addTwoNumbers.`val`}")
        addTwoNumbers=addTwoNumbers.next
    }
}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var num1 = l1
    var num2 = l2
    val dummy = ListNode(0)
    var cur: ListNode? = ListNode(0)
    var prev: ListNode? = null
    dummy.next = cur
    var carry = 0

    // traverse through each node of the list and sum up value in new list

    // traverse through each node of the list and sum up value in new list
    while (num1 != null || num2 != null) {

        // if any list ends then assign value 0 
        val vanum1 = num1?.`val` ?: 0
        val vanum2 = num2?.`val` ?: 0

        // adding num1 , num2 and carry value for total sum
        val sum = vanum1 + vanum2 + carry

        // storing carry if any to add in sum in next loop
        carry = sum / 10
        cur!!.`val` = sum % 10

        // moving to next nodes
        prev = cur
        cur.next = ListNode(1)
        cur = cur!!.next // create and assign new next node if next node is null
        num1 = if (num1 != null) num1.next else num1
        num2 = if (num2 != null) num2.next else num2
        cur!!.next = null
    }

    // if carry still has value then assign it to next node or make next node null

    // if carry still has value then assign it to next node or make next node null
    prev!!.next!!.`val` = if (carry != 0) carry else 0
    prev!!.next = if (carry != 0) prev!!.next else null

    // return head of the result

    // return head of the result
    return dummy.next
}