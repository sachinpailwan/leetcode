package com.kotlin.leetcode.top100

class TreeNode(var `val`: Int){
    var left : TreeNode? = null
    var right : TreeNode ?= null
}
fun main() {
   var root = TreeNode(1)
   root.left = TreeNode(2)
    root.right = TreeNode(5)
    root!!.left!!.left = TreeNode(3)
    root!!.left!!.right = TreeNode(4)
    root!!.right!!.right = TreeNode(6)
    flatten(root)
    while(root!=null){
        print("${root.`val`}")
        root= root.right!!
    }
    println()
}
fun flatten(root: TreeNode?): Unit {
    if (root == null) {
        return
    }
    val leftRoot = root.left
    val rightRoot = root.right
    if (leftRoot != null) {
        var lastLeft = leftRoot
        while (lastLeft!!.right != null) {
            lastLeft = lastLeft.right
        }
        lastLeft.right = rightRoot
        root.right = leftRoot
        root.left = null
    }
    flatten(root.right)

}

