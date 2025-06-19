package com.nt.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArraySum {

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(maxSubArraySum(s));
    }

    private static int maxSubArraySum(String s) {

        int maxLength =0, start = 0;

        Map<Character, Integer> map = new HashMap<>();

        for(int end = 0;end < s.length();end++){
            char ch = s.charAt(end);

            if(map.containsKey(ch)){
                start = Math.max(map.get(ch) + 1, start);
            }

            map.put(ch,end);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
