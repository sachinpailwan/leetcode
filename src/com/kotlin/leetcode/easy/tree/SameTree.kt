package com.kotlin.leetcode.easy.tree

fun main() {

    var n1 = TreeNode(1)
    n1.left = TreeNode(2)
    n1.right = TreeNode(3)

    var n2 = TreeNode(1)
    n2.left = TreeNode(2)
    n2.right = TreeNode(3)
    n2!!.left!!.left = TreeNode(4)
    println(isSameTree(n1,n2))

}

fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
    if(p==null && q==null) return true
    if(p==null || q==null) return false
    if(p.`val`==q.`val`) {
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right)
    }
    return false
}