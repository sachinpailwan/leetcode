package com.kotlin.leetcode.binary.tree

import com.kotlin.leetcode.easy.ListNode
import com.kotlin.leetcode.easy.tree.TreeNode
import java.util.*


fun main() {
//    var root = TreeNode(3)
//    root.left = TreeNode(9)
//    root.right = TreeNode(20)
//    root!!.right!!.left = TreeNode(15)
//    root!!.right!!.right = TreeNode(7)
//    val result = averageOfLevels(root)
//    println(result.joinToString(","))
    var root = ListNode(1)
    root.next = ListNode(1)
    root!!.next!!.next = ListNode(2)
    deleteDuplicates(root)
}

fun averageOfLevels(root: TreeNode?): DoubleArray {
    val result = ArrayList<Double>()
    val queue = LinkedList<TreeNode>()
    root?.let { queue.add(it) }
    while (queue.isNotEmpty()){
        val size = queue.size
        var sum:Double = 0.0
        for(i in 1..size){
            var node =  queue.poll()
            sum +=node.`val`
            node.left?.let { queue.add(it) }
            node.right?.let { queue.add(it) }
        }
        result.add(sum.div(size))
    }
    return result.toDoubleArray()
}

fun reverseBits(n: Int): Int {
    var toReturn = 0
    for (bitPos in 0..31) {
        val toReturnBitPos = 31 - bitPos
        val thisBitOn = 1 shl bitPos and n != 0
        if (thisBitOn) toReturn = toReturn or (1 shl toReturnBitPos)
    }
    return toReturn
}

fun deleteDuplicates(head: ListNode?): ListNode? {
    var pre = head
    var next = head?.let{it.next}
    while (next!=null){
        if(pre!!.`val`==next!!.`val`){
            pre.next = next.next
        }else {
            pre = next
        }
        next = next!!.next
    }
    return head
}


fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
    var curr = head
    var pre=head
    for(i in 1..k){
        curr=curr!!.next
    }
    while(curr!=null){
        var t = curr.`val`
        curr.`val`=pre!!.`val`
        pre!!.`val`=t
        pre=curr
        var i = 1
        while(i<=k && curr!=null){
            curr = curr!!.next
        }
    }
    return head
}

//fun averageOfLevels(root: TreeNode?): List<Double>? {
//    val q: Queue<TreeNode?> = LinkedList()
//    // if(root==null)
//    q.add(root)
//    val arr: MutableLxxx zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzist<Double> = ArrayList()
//    var ans = 0.0
//    while (!q.isEmpty()) {
//        val n: Int = q.size
//        for (i in 0 until n) {
//            val front = q.remove()
//            if (front!!.left != null) {
//                q.add(front.left)
//            }
//            if (front.right != null) {
//                q.add(front.right)
//            }
//            ans += front.`val`
//        }
//        arr.add(ans / n)
//        ans = 0.0
//    }
//    return arr
//}