package com.kotlin.leetcode.easy.tree

fun main() {
    var n = TreeNode(1)
    n.right= TreeNode(2)
    n.right!!.left = TreeNode(3)
    println(inorder(n))
    println(preOrder(n))
    println(postOrder(n))
}

fun inorder(root: TreeNode?): List<Int> {
    var list = ArrayList<Int>()
    inOrderTraversal(root,list)
    return list
}

fun preOrder(root: TreeNode?): List<Int> {
    var list = ArrayList<Int>()
    preOrderTraversal(root,list)
    return list
}
fun postOrder(root: TreeNode?): List<Int> {
    var list = ArrayList<Int>()
    postOrderTraversal(root,list)
    return list
}


fun inOrderTraversal(root: TreeNode?, list: java.util.ArrayList<Int>) {
    if(root!=null){
        inOrderTraversal(root.left,list)
        list.add(root.`val`)
        inOrderTraversal(root.right,list)
    }
}

fun preOrderTraversal(root: TreeNode?, list: java.util.ArrayList<Int>) {
    if(root!=null){
        list.add(root.`val`)
        preOrderTraversal(root.left,list)
        preOrderTraversal(root.right,list)
    }
}

fun postOrderTraversal(root: TreeNode?, list: java.util.ArrayList<Int>) {
    if(root!=null){

        postOrderTraversal(root.left,list)
        postOrderTraversal(root.right,list)
        list.add(root.`val`)
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}