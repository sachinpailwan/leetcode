package com.kotlin.leetcode.easy

import java.util.*
import kotlin.collections.ArrayList

fun main() {

    var n = TreeNode(1)
    n.left = TreeNode(2)
    n.right = TreeNode(3)
    n.left?.right = TreeNode(5)
    println(binaryTreePaths(n).joinToString { " " })
}

class TreeNode(var `val`: Int) {
         var left: TreeNode? = null
         var right: TreeNode? = null
    }
fun binaryTreePaths(root: TreeNode?): List<String> {
    var list = ArrayList<String>()
    var stack = Stack<TreeNode>()
    var pathStack = Stack<String>()
    if(root==null) return list
    stack.push(root)
    pathStack.push("")
    while (!stack.isEmpty()){
        var node = stack.pop()
        var currentPath = pathStack.pop()

        currentPath +="${node.`val`}->"
        if(node.left==null && node.right==null){
            currentPath = currentPath.substring(0,currentPath.length-2)
            list.add(currentPath)
        }
        if(node.left!=null){
            pathStack.push(currentPath)
            stack.push(node.left)
        }
        if(node.right!=null){
            pathStack.push(currentPath)
            stack.push(node.right)
        }
    }
    return list
}