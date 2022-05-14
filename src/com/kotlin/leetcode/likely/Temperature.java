package com.kotlin.leetcode.likely;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class Temperature {
    public static void main(String[] args) {
        String s ="12";
        int[] memo = new int[s.length()+1];
        Arrays.fill(memo, -1);
        helper(s, memo);
    }


    private static int helper(String s, int[] memo) {
        if(s.length() == 0) return 1;
        if(memo[s.length()] != -1) return memo[s.length()];
        int first = s.charAt(0) - '0';
        int ans = 0;
        if(first > 0) {
            ans = helper(s.substring(1), memo);
        }
        if(s.length() > 1) {
            int second = s.charAt(1) - '0';
            int number = first * 10 + second;
            if(number >= 10 && number <=26) {
                ans += helper(s.substring(2), memo);
            }
        }
        memo[s.length()] = ans;
        return ans;
    }


}
