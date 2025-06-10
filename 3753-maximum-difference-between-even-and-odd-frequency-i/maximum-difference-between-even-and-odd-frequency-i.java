import java.util.*;

class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];

        // Count character frequencies
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int maxOdd = 0;
        int minEven = Integer.MAX_VALUE;

        for (int f : freq) {
            if (f == 0) continue;
            if (f % 2 == 0) {
                minEven = Math.min(minEven, f);
            } else {
                maxOdd = Math.max(maxOdd, f);
            }
        }

        return maxOdd - minEven;
    }
}
