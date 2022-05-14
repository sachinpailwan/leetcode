package com.kotlin.leetcode.easy.linkedList;

import com.kotlin.leetcode.easy.tree.TreeNode;

import java.util.*;

public class BinaryLevelOrder {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int len = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i=1;i<=len;i++){
                TreeNode t = queue.poll();
                list.add(t.getVal());
                if(t.getLeft()!=null) queue.add(t.getLeft());
                if(t.getRight()!=null) queue.add(t.getRight());
            }
            result.add(list);
        }
        return result;
    }
}
