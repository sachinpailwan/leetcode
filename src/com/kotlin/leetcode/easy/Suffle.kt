package com.kotlin.leetcode.easy

import java.util.*

fun main() {
//    println(intArrayOf(1,2,3).contentToString())
//    var solution = Solution(intArrayOf(1,2,3))
//    println(solution.shuffle().contentToString())
//    println(solution.reset().contentToString())
    var root = TreeNode(3)
    root.left = TreeNode(9)
    root.right = TreeNode(20)
    root.right!!.left = TreeNode(15)
    root.right!!.right = TreeNode(7)
    println(sumOfLeftLeaves(root))
}

class Solution(nums: IntArray) {
    var nums = nums
    private var orignalNums:IntArray = nums.copyOf(nums.size)
    private var range = (0..nums.size-1)
    fun reset(): IntArray {
        return orignalNums
    }

    fun shuffle(): IntArray {
        var i = range.random()
        var j = range.random()
        var t = nums[i]
        nums[i]=nums[j]
        nums[j]=t
        return nums
    }

    fun sumOfLeftLeaves(root: TreeNode?): Int {
        if(root == null) return 0
        if(root.left!=null && root!!.left!!.left == null && root.right==null){
            return root!!.left!!.`val` + sumOfLeftLeaves(root.right)
        } else{
            return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right)
        }
    }

}
