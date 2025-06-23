class Solution {
    public long kMirror(int k, int n) {
        long sum = 0;
        int len = 1;
        while (n > 0) {
            for (long x : generatePalindromes(len)) {
                if (isKPalindrome(x, k)) {
                    sum += x;
                    n--;
                    if (n == 0) break;
                }
            }
            len++;
        }
        return sum;
    }

    // Generate palindromes of given length
    private List<Long> generatePalindromes(int len) {
        List<Long> result = new ArrayList<>();
        int halfLen = (len + 1) / 2;
        long start = (long) Math.pow(10, halfLen - 1);
        long end = (long) Math.pow(10, halfLen);
        for (long i = start; i < end; i++) {
            String firstHalf = Long.toString(i);
            StringBuilder sb = new StringBuilder(firstHalf);
            if (len % 2 == 1) sb.setLength(sb.length() - 1); // remove middle digit for odd
            String full = firstHalf + sb.reverse();
            result.add(Long.parseLong(full));
        }
        return result;
    }

    // Check if number is a palindrome in base-k
    private boolean isKPalindrome(long num, int k) {
        List<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add((int)(num % k));
            num /= k;
        }
        int i = 0, j = digits.size() - 1;
        while (i < j) {
            if (!digits.get(i).equals(digits.get(j))) return false;
            i++; j--;
        }
        return true;
    }
}
