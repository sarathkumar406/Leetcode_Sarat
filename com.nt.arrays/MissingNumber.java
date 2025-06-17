package com.nt.arrays;

public class MissingNumber {

    public static void main(String[] args) {

        int[] nums = {3,0,1};
        System.out.println(usingFormula(nums));
        System.out.println(anotherSolution(nums));
    }

    private static int anotherSolution(int[] nums) {
        int res = nums.length; // 4

        for(int i =0;i<nums.length;i++){
            res +=i-nums[i];
        }
        return res;
    }

    private static int usingFormula(int[] nums) {
        int  n = nums.length;

        int actualSum = n * (n+1)/2;
        int sum =0;
        for(int num : nums){
            sum+=num;
        }

        return actualSum - sum;
    }
}
