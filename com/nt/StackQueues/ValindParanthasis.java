package com.nt.StackQueues;

import java.util.Stack;

public class ValindParanthasis {
    public static void main(String[] args) {

        String str = "{{{}}}";
        System.out.println( solutionValidParanthasis(str));
    }

    private static boolean solutionValidParanthasis(String str) {

        Stack<Character> st = new Stack<>();

        for(char ch : str.toCharArray()){

            if(ch == '(') st.push(')');
            else if (ch == '[') st.push(']');
            else if(ch == '{') st.push('}');
            else {
                if(st.isEmpty() || st.pop() != ch)
                    return false;
            }
        }


        return st.isEmpty();
    }
}
