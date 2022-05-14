package com.kotlin.leetcode.easy.tree

fun main() {
  val node = sortedArrayToBST(intArrayOf(-10,-3,0,5,9))
}

fun isBalanced(root: TreeNode?): Boolean {
    if(root==null) return true
    val leftHeight = height(root.left)
    val rightHeight = height(root.right)
    if(Math.abs(leftHeight-rightHeight)>1) return false

    return isBalanced(root.left) && isBalanced(root.right)
}

fun height(root:TreeNode?): Int{
    if(root==null) return -1
    return maxOf(height(root.left),height(root.right))+1
}

fun sortedArrayToBST(nums: IntArray): TreeNode? {
  return buildTree(nums,0,nums.size-1)
}
fun buildTree(nums: IntArray,start:Int,end:Int):TreeNode?{

    if(start>end) return null
    val mid = (start+end)/2
    val node = TreeNode(nums[mid])
    node.left = buildTree(nums,start,mid-1)
    node.right = buildTree(nums,mid+1,end)
    return node
}