package com.app;

public class App {
   
    // Returns the index i such that swapping target[i] and target[i+1]
    // makes target equal to source. Otherwise returns -1.
    public static int spotSwaps(String source, String target) {
        int n = source.length();

        // If already equal, no swap needed -> -1
        if (source.equals(target)) return -1;

        int first = -1;
        int second = -1;

        // Collect mismatch positions (we only care if it's more than 2)
        for (int i = 0; i < n; i++) {
            if (source.charAt(i) != target.charAt(i)) {
                if (first == -1) first = i;
                else if (second == -1) second = i;
                else return -1; // more than 2 mismatches => can't be fixed by one swap
            }
        }

        // Must be exactly 2 mismatches
        if (second == -1) return -1;

        // Must be adjacent (can't swap last position anyway, but this enforces adjacency)
        if (second != first + 1) return -1;

        // Check if swapping target[first] and target[second] would match source
        char s1 = source.charAt(first);
        char s2 = source.charAt(second);
        char t1 = target.charAt(first);
        char t2 = target.charAt(second);

        if (s1 == t2 && s2 == t1) {
            return first; // left index of the swapped pair
        }

        return -1;
    }

}
