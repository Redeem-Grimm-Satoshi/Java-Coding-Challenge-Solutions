package com.app;

public class Solution_7 {
    public static boolean isValidBrackets(String s) {
        java.util.Deque<Character> st = new java.util.ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') st.push(c);
            else {
                if (st.isEmpty()) return false;
                char p = st.pop();
                if ((c == ')' && p != '(') || (c == ']' && p != '[') || (c == '}' && p != '{')) return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String sample = "()[]{}";
        System.out.println(isValidBrackets(sample));
    }
}
