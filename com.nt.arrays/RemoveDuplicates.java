package com.nt.arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
       int[] res = removeDuplicates(nums);
        System.out.println(Arrays.toString(res));
    }

    private static int[] removeDuplicates(int[] nums) {
        int n = nums.length;

        int val =  0;
        for(int i=0;i<n;i++){
            if(nums[i] != nums[val]){
                val++;
                nums[val] = nums[i];
            }
        }
        System.out.println(val+1);
        int res = val + 1;
        int[] resArray = new int[res];
        System.arraycopy(nums, 0, resArray, 0, res);
        return resArray;
    }

}
