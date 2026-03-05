package com.app;

public class Solution_1 {
    public static int maxSubarraySum(int[] arr) {
        int best = arr[0], curr = arr[0];
        for (int k = 1; k < arr.length; k++) {
            curr = Math.max(arr[k], curr + arr[k]);
            best = Math.max(best, curr);
        }
        return best;
    }

    public static void main(String[] args) {
        int[] sample = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubarraySum(sample));
    }
}
