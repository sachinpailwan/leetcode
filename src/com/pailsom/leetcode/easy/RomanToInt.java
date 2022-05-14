package com.pailsom.leetcode.easy;

import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("IVII"));
    }

    private static Integer romanToInt(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        h.put('I',1);
        h.put('X',10);
        h.put('V',5);
        h.put('C',100);
        h.put('D',500);
        h.put('M',1000);
        h.put('L',50);

        Character prev='k';
        int ans=0;
        for(int i=0;i<s.length();i++){
            Character q=s.charAt(i);
            ans+=h.get(q);
            if(prev=='I' && (q=='X' || q=='V'))
                ans=ans-2;
            else if(prev=='X' && (q=='L' || q=='C'))
                ans=ans-20;
            else if(prev=='C' && (q=='D' || q=='M'))
                ans=ans-200;
            prev=q;
        }
        return ans;
    }
}
