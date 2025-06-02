class Solution {
    public long distributeCandies(int n, int limit) {
        long total = comb(n + 2, 2);
        for (int mask = 1; mask < 8; mask++) {
            int bits = Integer.bitCount(mask);
            int sum = n - (limit + 1) * bits;
            if (sum < 0) continue;
            long ways = comb(sum + 2, 2);
            if (bits % 2 == 1) {
                total -= ways;
            } else {
                total += ways;
            }
        }

        return total;
    }

    private static long comb(int n, int k) {
        if (k > n || n < 0 || k < 0) return 0;
        if (k == 0 || k == n) return 1;
        long res = 1;
        for (int i = 1; i <= k; i++) {
            res = res * (n - i + 1) / i;
        }
        return res;
    
    }
}