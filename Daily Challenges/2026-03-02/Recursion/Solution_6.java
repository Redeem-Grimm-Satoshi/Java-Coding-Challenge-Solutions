package com.app;

public class Solution_6 {
    public static int fib(int n) {
        int[] memo = new int[n + 1];
        java.util.Arrays.fill(memo, -1);
        return dfs(n, memo);
    }

    private static int dfs(int n, int[] memo) {
        if (n <= 1) return n;
        if (memo[n] != -1) return memo[n];
        memo[n] = dfs(n - 1, memo) + dfs(n - 2, memo);
        return memo[n];
    }
    public static void main(String[] args) {
        int sample = 10;
        System.out.println(fib(sample));
    }
}
