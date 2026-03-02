package com.app;

public class Solution_8 {
    public static java.util.List<Double> movingAverage(int[] arr, int k) {
        java.util.List<Double> out = new java.util.ArrayList<>();
        java.util.ArrayDeque<Integer> q = new java.util.ArrayDeque<>();
        long sum = 0;
        for (int x : arr) {
            q.offer(x);
            sum += x;
            if (q.size() > k) sum -= q.poll();
            out.add(sum * 1.0 / q.size());
        }
        return out;
    }

    public static void main(String[] args) {
        int[] arr = {1,10,3,5}; int k = 3;
        System.out.println(movingAverage(arr, k));
    }
}
