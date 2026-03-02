package com.app;

public class Solution_5 {
    public static int lengthOfLongestSubstring(String s) {
        int[] last = new int[128];
        java.util.Arrays.fill(last, -1);
        int left = 0, best = 0;
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            left = Math.max(left, last[c] + 1);
            last[c] = r;
            best = Math.max(best, r - left + 1);
        }
        return best;
    }

    public static void main(String[] args) {
        String sample = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(sample));
    }
}
