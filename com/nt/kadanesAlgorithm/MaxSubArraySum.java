package com.nt.kadanesAlgorithm;

public class MaxSubArraySum {
    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maximumSubArraySum(nums));
    }

    private static int maximumSubArraySum(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int num : nums) {
            sum += num;

            max = Math.max(max, sum);

            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
