package com.kotlin.leetcode.easy;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PascalTriangle {
    public static void main(String[] args) {
//        Map<String,Character> map = new HashMap<>();
//
//        int arr [] = {4,6,7};
//        LinkedList<Integer> linkedList = new LinkedList<>();
//
//
//        //System.out.println(generate(0).stream().map(String::valueOf).collect(Collectors.joining(",")));
//        System.out.println(increasingTriplet(new int[]{0,4,2,1,0,-1,-3}));

//        System.out.println(coinChange(new int[]{186,419,83,408},6249));

        System.out.println(findDuplicate_bs(new int []{2,3,4,1,2}));
        List<Integer> integers = new ArrayList<>();

    }

    public int[][] kClosest(int[][] points, int k) {
        Map<Integer,int[]> map = new HashMap<>();
        for(int i=0;i<points.length;i++){
            int area = (int) Math.sqrt(points[i][0]*points[i][0]+points[i][1]*points[i][1]);
            map.put(area,points[i]);
        }
        final LinkedHashMap<Integer, int[]> collect = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        int [][] data = new int[k][2];
        return (int[][]) collect.entrySet().stream().limit(k)
                .map(Map.Entry::getValue).toArray();
    }

    public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= first) first = nums[i];
            else if (nums[i] <= second) second = nums[i];
            else return true;
        }
        return false;
    }

    public static List<Integer> generate(int numRows) {
//       if(numRows==1) return Arrays.asList(1);
//       if(numRows==2) return Arrays.asList(1,1);
       List<Integer> result = Arrays.asList(1);
       List<Integer> pre = Arrays.asList(1);
       for(int i=1;i<=numRows;i++){
           final List<Integer> list = pre;
           final List<Integer> pp = new ArrayList<>();
           result = new ArrayList<>();
           result.add(1);
           pp.add(1);
           for(int j=1;j<list.size();j++){
               result.add(list.get(j-1)+list.get(j));
               pp.add(list.get(j-1)+list.get(j));
           }
           result.add(1);
           pp.add(1);
           pre = pp;
       }
       return result;
    }

    public boolean wordPattern(String pattern, String s) {
        if(s.split(" ").length!=pattern.length()) return false;
        Map<String,Character> map = new HashMap();
        int i =0;
        for(int j=0;j<s.split(" ").length;j++){
            String str = s.split(" ")[j];
            if(map.containsKey(str)) {
                if(map.get(str)!=pattern.charAt(i)) return false;
            }
            map.put(str,pattern.charAt(i));
            i++;
        }
        return true;
    }

    static int LIP(int dp[][], int mat[][], int n,
                   int m, int x, int y)
    {
        // If value not calculated yet.
        if (dp[x][y] < 0) {
            int result = 0;

            // If reach bottom right cell, return 1.
            if (x == n - 1 && y == m - 1)
                return dp[x][y] = 1;

            // If reach the corner of the matrix.
            if (x == n - 1 || y == m - 1)
                result = 1;

            // If value greater than below cell.
            if (x + 1 < n && mat[x][y] < mat[x + 1][y])
                result = 1 + LIP(dp, mat, n, m, x + 1, y);

            // If value greater than left cell.
            if (y + 1 < m && mat[x][y] < mat[x][y + 1])
                result = Math.max(result, 1 + LIP(dp, mat, n, m, x, y + 1));

            dp[x][y] = result;
        }

        return dp[x][y];
    }

    // Wrapper function
    static int wrapper(int mat[][], int n, int m)
    {
        int dp[][] = new int[10][10];
        for (int i = 0; i < 10; i++)
            Arrays.fill(dp[i], -1);

        return LIP(dp, mat, n, m, 0, 0);
    }


    public static int coinChange(int[] coins, int amount) {

        Arrays.sort(coins);
        int [] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for(int i=0;i<=amount;i++){
            for(int j=0;j<coins.length;j++){
                if(coins[j]<=i){
                    dp[i]=Math.min(dp[i],1+dp[i-coins[j]]);
                }else{
                    break;
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }

    public static int findDuplicate_bs(int[] nums) {
        int len = nums.length;
        int low = 1;
        int high = len - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            int cnt = 0;
            for (int i = 0; i < len; i++) {
                if (nums[i] <= mid) {
                    cnt++;
                }
            }

            if (cnt <= mid) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
}
