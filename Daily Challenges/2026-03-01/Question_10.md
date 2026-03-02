# Java Coding Challenge #10

## Problem
Given a non-empty integer array, return the maximum difference (arr[j] - arr[i]) such that j > i.

## Constraints
- 2 <= n <= 100000
- -10^9 <= arr[i] <= 10^9

## Example
Input: [7, 1, 5, 3, 6, 4]
Output: 5
Explanation: Buy at 1 and sell at 6.

## Approach
Track the smallest value seen so far and compute best difference at each step.
