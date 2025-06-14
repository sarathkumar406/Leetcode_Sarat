
/*
Problem Summary (LeetCode 271: Encode and Decode Strings)
Design an algorithm to encode a list of strings to a single string.

The encoded string is then decoded back to the original list of strings.

📌 Example
java
Copy
Edit
Input: ["hello", "world"]
Encoded: "5#hello5#world"
Decoded: ["hello", "world"]

* */

package com.nt.Strings;
import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeStrings {

    public static void main(String[] args) {

        List<String>  list = List.of("hello","world","java");
        String encode = encodeString(list);
        System.out.println("encoded String " +encode);
        List<String> decode = decodeStrings(encode);
        System.out.println("Decode Strings "+decode);
    }

    private static List<String> decodeStrings(String str) {
        List<String> res = new ArrayList<>();
        int i =0;
        while(i<str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            res.add(str.substring(j+1,j+1+length));
            i = j+1+length;
        }
        return res;
    }

    private static String encodeString(List<String> list) {

        StringBuilder sb  = new StringBuilder();
        for(String str : list){
            sb.append(str.length()).append('#').append(str);
        }
        return sb.toString();
    }
}
