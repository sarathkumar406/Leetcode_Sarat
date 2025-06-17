package com.nt.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {

        int[] nums = {-1,0,1,2,-1,-4};

        System.out.println(solutionSum(nums));
    }

    private static List<List<Integer>> solutionSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i =0;i<n;i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = n -1;

            while( j < k){
                int total = nums[i] + nums[j] + nums[k];
                if(total < 0){
                    j++;
                } else if(total > 0 ){
                    k--;
                } else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;

                    while(nums[j] == nums[j-1] && j < k){
                        j++;
                    }
                }
            }
        }
        return res;
    }
}
