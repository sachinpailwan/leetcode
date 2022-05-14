package com.pailsom.leetcode.easy;

public class ReverseString {
    public static void main(String[] args) {
        String s [] = {"h","e","l","l","o"};
        int i=0,j=s.length-1;
        while(i<j){
            String t = s[i];
            s[i]=s[j];
            s[j]=t;
            i++;j--;
        }
        StringBuilder sb = new StringBuilder();
        for(j =0;j<s.length;j++){
            sb.append(s[j]);
        }
        System.out.println(sb.toString());
    }
}
