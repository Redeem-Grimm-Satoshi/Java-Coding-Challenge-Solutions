package com.app;

public class Solution_3 {
    public static int[] twoSum(int[] nums, int target) {
        java.util.Map<Integer, Integer> map = new java.util.HashMap<>();
        for (int k = 0; k < nums.length; k++) {
            int need = target - nums[k];
            if (map.containsKey(need)) return new int[]{map.get(need), k};
            map.put(nums[k], k);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15}; int target = 9;
        System.out.println(java.util.Arrays.toString(twoSum(nums, target)));
    }
}
