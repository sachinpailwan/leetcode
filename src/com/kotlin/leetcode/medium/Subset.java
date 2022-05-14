package com.kotlin.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        final List<List<Integer>> subsets = subsets(new int[]{1, 2, 3});
        System.out.println(subsets);
    }
   public static List<List<Integer>> subsets(int [] nums){
       List<List<Integer>> result = new ArrayList<>();
       helper(nums,result,0,new ArrayList<Integer>());
       return result;
   }

    private static void helper(int[] nums, List<List<Integer>> result, int pos, ArrayList<Integer> subset) {
       if(pos == nums.length){
           result.add(new ArrayList<>(subset));
           return;
       }
       helper(nums,result,pos + 1,subset);
       subset.add(nums[pos]);
       helper(nums,result,pos + 1,subset);
       subset.remove(subset.size()-1) ;
    }
}

