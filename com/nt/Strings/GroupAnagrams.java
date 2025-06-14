package com.nt.Strings;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        List<String>  list = List.of("eat","tea","tan","ate","nat","bat");
        checkGroupAnagrams(list);
        AnotherApproachAnagrams(list);
    }

    private static void AnotherApproachAnagrams(List<String> list) {
        ArrayList<ArrayList<String>> anagramsList = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();

        for (String s : list) {
            String key = gethash(s);
            System.out.println(key);
            if (!map.containsKey(key)) {
                map.put(key, anagramsList.size());
                anagramsList.add(new ArrayList<>());
            }

            anagramsList.get(map.get(key)).add(s);

            System.out.println(anagramsList);

        }
    }

    private static String gethash(String s) {
        StringBuilder hash = new StringBuilder();
        int[] arr = new int[26];

        for(int i=0;i<s.length();i++){
            arr[s.charAt(i) - 'a']++;
        }

        for(int i =0;i<26;i++){
            hash.append(arr[i]);
            hash.append("$");
        }
    return hash.toString();

    }

    private static void checkGroupAnagrams(List<String> list) {
        ArrayList<ArrayList<String>> anagramsList = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();

        for (String str : list) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            str = new String(ch);

            if (!map.containsKey(str)) {
                map.put(str, anagramsList.size());
                anagramsList.add(new ArrayList<>());
            }
            anagramsList.get(map.get(str)).add(str);

        }
        System.out.println(anagramsList);
    }
}
