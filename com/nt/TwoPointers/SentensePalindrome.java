package com.nt.TwoPointers;

public class SentensePalindrome {

    public static void main(String[] args) {

        String str = "race a car";

        boolean res = checkPalindrome(str);
        System.out.println(res);
    }

    private static boolean checkPalindrome(String str) {

        int left = 0, right = str.length()-1;
        while(left < right){

            //skip left
            if(!Character.isLetterOrDigit(str.charAt(left))){
                left++;
            }
            //right skip
            else if(!Character.isLetterOrDigit(str.charAt(right))){
                right--;
            }
            //compare both
            else if(Character.toLowerCase(str.charAt(left))
                    == Character.toLowerCase(str.charAt(right))){
                left++;
                right--;
            }
            //if no matches
            else
                return false;
        }
        return true;
    }
}
