/*
Problem :

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
*/

package com.nt.arrays;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4};
//        int[] nums = {-1,1,0,-3,3};

        //brute force
        ProductExceptSelfSolution(nums);

        //with prefix and suffix array
        ProductExceptSelfSolution1(nums);

        int[] arr ={1,2,3,4};
        //best solution
        ProductExceptSelfSolution2(arr);


    }

    private static void ProductExceptSelfSolution2(int[] arr) {

        System.out.println("input Array : " +Arrays.toString(arr));
        int zeros =0, index = -1, prod = 1;
        int n = arr.length;

        for(int i =0;i<n;i++){
            if(arr[i] == 0){
                zeros++;
                index = i;
            }else {
                prod = prod * arr[i];
            }
        }

        int[] res = new int[n];
        Arrays.fill(res,0);

        if(zeros == 0){
            for(int i =0;i<n;i++){
                res[i] = prod / arr[i];
            }
        } else
        if(zeros == 1){
            res[index] = prod;
        }
        System.out.println(Arrays.toString(res));



    }

    private static void ProductExceptSelfSolution1(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = 1;
        for(int i = 1;i< n; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        System.out.println(Arrays.toString(prefix));
        suffix[n-1] = 1;
        for(int i = n-2;i >= 0;i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }
        System.out.println(Arrays.toString(suffix));

        for(int i =0;i<n;i++){
            nums[i] = prefix[i] * suffix[i];
        }
        System.out.println(Arrays.toString(nums));
    }

    private static void ProductExceptSelfSolution(int[] nums) {
        int[] res = new int[nums.length];

        for(int i =0;i<nums.length;i++){
            int val = 1;
            for(int j= 0;j<nums.length;j++){
                if(i != j){
                    val = val * nums[j];
                }
            }
            res[i] = val;
        }

        System.out.println(Arrays.toString(res));
    }
}
