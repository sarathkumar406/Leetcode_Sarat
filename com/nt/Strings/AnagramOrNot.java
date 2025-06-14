package com.nt.Strings;

public class AnagramOrNot {

    public static void main(String[] args) {

        String str = "eaat";
        String str1 = "ate";

        if(str.length()!=str1.length()) {
            System.out.println("not an anagram");
//            break;
        }

        int[] arr = new int[26];
        for(int i =0;i<str.length();i++){
            arr[str.charAt(i) - 'a']++;
            arr[str1.charAt(i) - 'a']--;
        }

        for(int freq : arr){
            if(freq!=0) {
                System.out.println("not an anagrams");
                break;
            }
        }

        System.out.println("its anagrams");
    }
}
