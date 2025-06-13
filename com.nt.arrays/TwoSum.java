package com.nt.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15}; int target = 9;
        int[] res = twoSumSOlution(nums,target);

        System.out.println(res[0]);
        System.out.println(res[1]);
    }

    private static int[] twoSumSOlution(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            int current = target - nums[i];
            if(map.containsKey(current)){
                return new int[]{map.get(current),i};
            }
            map.put(nums[i],i);
        }

        return new int[]{};
    }
}

