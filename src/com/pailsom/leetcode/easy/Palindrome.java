package com.pailsom.leetcode.easy;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12344321));
    }

    private static boolean isPalindrome(int x) {
        if(x<0 || (x>0 && x %10==0)) return false;
        int reserveNum = 0;
        while(x>reserveNum){
            reserveNum = reserveNum*10 + x % 10;
            x= x /10;
        }
        return x==reserveNum || x == reserveNum/10;
    }

}
