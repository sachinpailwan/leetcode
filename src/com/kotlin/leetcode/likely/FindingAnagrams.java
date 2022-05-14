package com.kotlin.leetcode.likely;

import java.util.ArrayList;
import java.util.List;

public class FindingAnagrams {
    public static void main(String[] args) {

    }
    public static List<Integer> findAnagrams(String s,String p){
        List<Integer> output_list = new ArrayList<>();
        int [] chars = new int[26];
        for(char c : s.toCharArray()){
            chars[c-'a']++;
        }

        int left=0;
        int right=p.length();
        while(right<s.length()){
            
        }

        return output_list;
    }
}
