package com.kotlin.leetcode.medium;

public class RotateMatrix {

    public static void main(String[] args) {
        RotateMatrix r = new RotateMatrix();
        r.rotate(new int[][]{
                {1,2,3},{4,5,6},{7,8,9}
        });
    }
    public void rotate(int[][] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums[0].length;j++){
                swap(nums,i,j,j,i);
            }
        }
        for(int i=0;i<nums.length;i++){

            swap(nums,i,0,i,nums[0].length-1);

        }
    }
    public void swap(int [][]nums, int i,int j,int ii,int jj){
        int t = nums[i][j];
        nums[i][j]=nums[ii][jj];
        nums[ii][jj]=t;
    }
}


