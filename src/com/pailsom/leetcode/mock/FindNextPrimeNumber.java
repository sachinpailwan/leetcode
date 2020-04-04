package com.pailsom.leetcode.mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindNextPrimeNumber {

    public static final int MAX_VALUE = 1000034;

    public static void main(String [] arg){
        System.out.println(getIndexedPrime(6));
        /*System.out.println(getIndexedPrime(4));
        System.out.println(getIndexedPrime(15));
        System.out.println(getIndexedPrime(1048));*/
    }
    public static String getIndexedPrime(int index){
        StringBuilder sb = new StringBuilder();

        while(index>0){
            switch (index %4){
                case 1:
                    sb.append("2");
                    break;
                case 2:
                    sb.append("3");
                    break;
                case 3:
                    sb.append("5");
                    break;
                case 0:
                    sb.append("7");
                    break;
            }
            index=index/4;
        }
        return sb.reverse().toString();
    }
}
