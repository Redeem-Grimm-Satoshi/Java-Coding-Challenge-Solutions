package com.app;

public class Solution_1 {
    public static int maxDifference(int[] arr) {
        int min = arr[0];
        int best = Integer.MIN_VALUE;

        for (int k = 1; k < arr.length; k++) {
            best = Math.max(best, arr[k] - min);
            min = Math.min(min, arr[k]);
        }
        return best;
    }

    public static void main(String[] args) {
        int[] sample = {7, 1, 5, 3, 6, 4};
        System.out.println(maxDifference(sample));
    }
}
