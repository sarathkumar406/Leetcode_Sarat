package com.nt.TwoPointers;



public class PrintOnlyStringsOrDigits {

    public static void main(String[] args) {

        String str = "A man, a plan, a canal: Panama";
        getOnlyStringsOrDigits(str);
    }

    private static void getOnlyStringsOrDigits(String str) {

        StringBuilder sb = new StringBuilder();
        str = str.toLowerCase();
        char[] ch = str.toCharArray();

        for (char c : ch) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }

        String res = sb.toString();
        String reverseString = sb.reverse().toString();
        if(res.equals(reverseString)){
            System.out.println("its palindrome");
        } else {
            System.out.println("Its not Palindrome");
        }

    }
}
